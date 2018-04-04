package boot.mall.controller.web.manager;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;





/*import org.apache.axiom.om.OMAbstractFactory;
 import org.apache.axiom.om.OMElement;
 import org.apache.axiom.om.OMFactory;
 import org.apache.axiom.om.OMNamespace;
 import org.apache.axis2.AxisFault;
 import org.apache.axis2.addressing.EndpointReference;
 import org.apache.axis2.client.Options;
 import org.apache.axis2.rpc.client.RPCServiceClient;*/
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import boot.mall.constants.Common;
import boot.mall.constants.Common.EnumSmsType;
import boot.mall.mybatis.mapper.SmsValidateMapper;
import boot.mall.mybatis.model.SmsValidate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.cloopen.rest.sdk.CCPRestSDK;


@Controller
public class SmsManager {
	@Autowired
	private SmsValidateMapper smsValidateMapper;
	
	private static Logger logger = Logger.getLogger(SmsManager.class);

	@RequestMapping(value = "sendRegisterCode")
	public ModelAndView sendRegisterCode(HttpSession session,
			HttpServletRequest request, HttpServletResponse respnose){
		logger.info("sendRegisterCode Handler ,Parameter="
				+ JSON.toJSONString(request.getParameterMap()));
		int resultCode = 0;// 0成功，1已注册的手机, 2非法的手机号码， 3今天的短信数量到达上限, 4发送间隔要超过60S
		String smsCode = "";
		String message="发送成功";
		String userAgent=request.getHeader("user-agent"); 
		if (request.getParameter("user_agent") != null) {
			String user_agent = request.getParameter("user_agent");
			if (!user_agent.equals("7bf073e716a7e5e67b35ed4989e728b74281ae75b2f176bfc24ee1a344e698a0")) {
				resultCode = -1;
				message = "非法地址访问，已经被风控拦截，如有疑问请联系企业客服！";
				return new ModelAndView("message", Common.GetResponsePost(null, message, resultCode));
			}
		}

		String phoneNum = request.getParameter("phoneNum");

		if (phoneNum == null || !Common.isPhoneNum(phoneNum)) {
			resultCode = 2;
			message="非法的手机号";
			
		} else{
			
				SmsValidate smsValidate = smsValidateMapper
						.selectByPrimaryKey(phoneNum);
				boolean canSend = false;// 是否能够发送消息
				if (smsValidate == null
						|| smsValidate.getSendCode().equalsIgnoreCase("")) {
					canSend = true;
				}
				if (!canSend) {// 发送过验证码
					if (new Date().getTime()
							- smsValidate.getSendDate().getTime() < 1 * 60 * 1000) {
						resultCode = 4;// 发送间隔要超过60S
						message="发送间隔要超过60秒";
						
					} else if (smsValidate.getSendCount() < Common.SMS_MAX_COUNT
							|| !Common.isSameDay(new Date(),
									smsValidate.getSendDate())) {// 今天发送次数没有达到5次
						canSend = true;
					} else {
						message="今天的短信数量到达上限";
						resultCode = 3; // 今天的短信数量到达上限
						
					}
				}
				
				if (canSend) {
					smsCode = getSmsCode(phoneNum);
					logger.info("短信验证吗："+smsCode);
					String isOK = sendCloSms(EnumSmsType.RegisterCode,
							phoneNum, smsCode, "10");

					if (isOK == null || isOK.equals("fail")) {
						resultCode = 5;
						message  = "获取验证码失败,请重试!";
						
					}
				}
			
		}
		logger.info("结果："+Common.GetResponsePost(null, message, resultCode).toString());
		return new ModelAndView("message", Common.GetResponsePost(null, message, resultCode));
	}

	

	

	// 获取验证码（1.有的话直接取出来， 2.过期了重新生成， 3.没有的话生成）
	private String getSmsCode(String phoneNum) {
		String code = null;
		SmsValidate smsValidate = smsValidateMapper
				.selectByPrimaryKey(phoneNum);
		if (smsValidate != null) { // 发送过验证信息
			logger.info("getSmsCode Handler ,phoneNum="
					+ phoneNum
					+ "|db code:"
					+ smsValidate.getSendCode()
					+ "|now:"
					+ new Date().getTime()
					+ "|shendDate:"
					+ smsValidate.getSendDate()
					+ "|is right:"
					+ ((new Date().getTime() - smsValidate.getSendDate()
							.getTime()) <= 1 * 59 * 1000));
			if ((!smsValidate.getSendCode().equalsIgnoreCase(""))
					&& (new Date().getTime()
							- smsValidate.getSendDate().getTime() <= 1 * 59 * 1000)) {
				code = smsValidate.getSendCode();
			} else {
				// 验证过期
				code = gernerateCode();
				smsValidate.setSendCode(code);
			}
			if (Common.isSameDay(new Date(), smsValidate.getSendDate())) {
				smsValidate.setSendCount(smsValidate.getSendCount() + 1);// 今天发送过
			} else {
				smsValidate.setSendCount(1);// 今天没有发送过
			}
			smsValidate.setSendDate(new Date());
			smsValidateMapper.updateByPrimaryKey(smsValidate);
		} else {
			code = gernerateCode();
			smsValidate = new SmsValidate();
			smsValidate.setPhoneNum(phoneNum);
			smsValidate.setSendCode(code);
			smsValidate.setSendDate(new Date());
			smsValidate.setSendCount(1);
			smsValidateMapper.insertSelective(smsValidate);
		}

		return code;
	}

	// 生成随机码
	private String gernerateCode() {
		String returnStr = "";
		Random rand = new Random();
		for (int i = 0; i < 4; i++) {
			returnStr += rand.nextInt(10);
		}
		return returnStr;
	}

	public static String sendCloSms(EnumSmsType sendType, String phoneNum,
			String code, String code2) {
		String tempid = "";
		if (sendType == EnumSmsType.RegisterCode) {
			tempid = "89523";//注册验证38891改为89523
		} else if (sendType == EnumSmsType.GetbackPasswordCode) {
			tempid = "38892";
		} else if (sendType == EnumSmsType.DoctorRegisterApplyOk) {
			tempid = "38895";
		} else if (sendType == EnumSmsType.DoctorQuestionResult) {
			tempid = "38894";
		} else if(sendType == EnumSmsType.LoginCode) {
			tempid = "89523";
		}else
			
		{
			return "error";
		}

		HashMap<String, Object> result = null;

		CCPRestSDK restAPI = new CCPRestSDK();
		restAPI.init("app.cloopen.com", "8883");// 初始化服务器地址和端口，格式如下，服务器地址不需要写https://
		restAPI.setAccount("8a48b5514f4020ed014f40314e5e0077",
				"4e55614009d54a288e4d70897454bd15");// 初始化主帐号和主帐号TOKEN
		restAPI.setAppId("8a48b5514f4020ed014f40381ed6009f");// 初始化应用ID

		if (sendType == EnumSmsType.DoctorQuestionResult) {
			result = restAPI.sendTemplateSMS(phoneNum, tempid,
					new String[] { code });
		} else {
			result = restAPI.sendTemplateSMS(phoneNum, tempid, new String[] {
					code, code2 });
		}

		logger.info("SDKTestSendTemplateSMS result=" + result);
		if ("000000".equals(result.get("statusCode"))) {
			
			return "ok";
		} else {
			// 异常返回输出错误码和错误信息
			logger.error("错误码=" + result.get("statusCode") + " 错误信息= "
					+ result.get("statusMsg"));
			return "fail";
		}

	}

	



	
	/**
	 * 容联短信发送注册成功
	 * 
	 * @param sendType
	 * @param phoneNum
	 * @return
	 */
	public static String sendCloSmsRegisterSuccess(String phoneNum) {

		String tempid = "87119";
		HashMap<String, Object> result = null;

		CCPRestSDK restAPI = new CCPRestSDK();
		restAPI.init("app.cloopen.com", "8883");// 初始化服务器地址和端口，格式如下，服务器地址不需要写https://
		restAPI.setAccount("8a48b5514f4020ed014f40314e5e0077",
				"4e55614009d54a288e4d70897454bd15");// 初始化主帐号和主帐号TOKEN
		restAPI.setAppId("8a48b5514f4020ed014f40381ed6009f");// 初始化应用ID

		result = restAPI.sendTemplateSMS(phoneNum, tempid, new String[] { });

		logger.info("sendCloSmsTijianWX result=" + result);
		if ("000000".equals(result.get("statusCode"))) {
			return "ok";
		} else {
			// 异常返回输出错误码和错误信息
			logger.error("错误码=" + result.get("statusCode") + " 错误信息= "
					+ result.get("statusMsg"));
			return "fail";
		}

	}

	
	
	public static void main(String[] args) throws JSONException {
		/*
		 * String returnStr = ""; Random rand = new Random(); for (int i = 0; i
		 * < 4; i++) { returnStr += rand.nextInt(10); }
		 * sendSms(EnumSmsType.RegisterCode, "15316028637", returnStr, "");
		 * System.out.println(new Date()); returnStr = ""; for (int i = 0; i <
		 * 4; i++) { returnStr += rand.nextInt(10); }
		 * sendSms(EnumSmsType.RegisterCode, "13564881405", returnStr, "");
		 * System.out.println(new Date()); returnStr = "";
		 * 
		 * for (int i = 0; i < 4; i++) { returnStr += rand.nextInt(10); }
		 * sendSms(EnumSmsType.RegisterCode, "13585745077", returnStr, "");
		 * System.out.println(new Date()); returnStr = "";
		 */

		// System.out.println(PushJobManager.jobQueueErrorMessage.size());
		// for (ErrorMessage string : PushJobManager.jobQueueErrorMessage) {
		// System.out.println(string.getId()+" "+string.getTitle());
		// }
		ConcurrentLinkedQueue<String> s=new ConcurrentLinkedQueue<String>();
		s.add("as");
		s.add("as");
		s.add("as");
		s.add("as");
		s.add("as");
		s.add("as");
		for (String str : s) {  
            System.out.println(str);  
        }  
	}
}
