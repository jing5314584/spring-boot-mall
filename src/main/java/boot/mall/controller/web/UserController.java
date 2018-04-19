package boot.mall.controller.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.mall.controller.result.ExceptionMsg;
import boot.mall.controller.result.ResponseData;
import boot.mall.mybatis.mapper.RsdCircleMapper;
import boot.mall.mybatis.mapper.SmsValidateMapper;
import boot.mall.mybatis.mapper.UserMapper;
import boot.mall.mybatis.model.User;
import boot.mall.mybatis.model.UserExample;

import com.alibaba.fastjson.JSON;

@RestController
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private RsdCircleMapper rsdCircleMapper;
	@Autowired
	private UserMapper userMapper;
/*	@Autowired
    private TokenManager tokenManager;*/
	@Autowired
	private SmsValidateMapper smsValidateMapper;
//	@Autowired
//	private Sender sender;
	@RequestMapping(value = "/is-login")
	public ResponseData isLogin(HttpSession session, HttpServletRequest request,
			HttpServletResponse response){
		Object userIdx = session.getAttribute("userIdx");
		if (userIdx == null) {
			return new ResponseData(ExceptionMsg.FAILED);
		}
		if (Integer.parseInt(userIdx+"") == 0) {
			return new ResponseData(ExceptionMsg.FAILED);
		}
		String userName = (String) session.getAttribute("userName");
		return new ResponseData(ExceptionMsg.SUCCESS, userName);
		
	}
	@RequestMapping(value = "/login")
	public ResponseData login(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("login Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		String userName = request.getParameter("userName");
		String userCode = request.getParameter("code");
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUserNameEqualTo(userName);
		List<User> userList = userMapper.selectByExample(userExample);
		User user = null;
		session.setAttribute("userIdx", 867);
		session.setAttribute("userName", "天追梦人心");
		return new ResponseData(ExceptionMsg.SUCCESS, user);
		/*if (userList.size() == 1) {
			// 验证码登录
			SmsValidate smsValidate = smsValidateMapper
					.selectByPrimaryKey(userName);
			if (smsValidate != null
					&& !smsValidate.getSendCode().equalsIgnoreCase("")
					&& smsValidate.getSendCode().equals(userCode)
					&& (new Date().getTime() - smsValidate.getSendDate()
							.getTime()) <= 60 * 60 * 1000) {
				user = userList.get(0);
				// 登录成功后将验证信息删除掉
				smsValidate.setSendCode("");
				smsValidateMapper.updateByPrimaryKey(smsValidate);
				session.setAttribute("userIdx", user.getIdx());
				result_code = 0;
				return new ModelAndView("message", Common.GetResponsePost(user,
						"登陆成功!", result_code));
			} else {
				result_code = -1;
				return new ModelAndView("message", Common.GetResponsePost(null,
						"验证码错误或过期,请重新尝试!", result_code));
			}
		}else {

			SmsValidate smsValidate = smsValidateMapper
					.selectByPrimaryKey(userName);
			logger.info("健康商城userRegistered Handler ,Parameter="
					+ JSON.toJSONString(request.getParameterMap()));
			if (smsValidate != null
					&& !smsValidate.getSendCode().equalsIgnoreCase("")
					&& smsValidate.getSendCode().equals(userCode)
					&& (new Date().getTime() - smsValidate.getSendDate()
							.getTime()) <= 60 * 60 * 1000) {

				user = new User();
				user.setUserName(userName);
				user.setPassWord("");
				user.setNickName(Common
						.getRandomNickName(userName));

				 user.setNickName(""); 

				user.setSex(1);
				user.setPhone(userName);
				user.setEmail("");
				user.setRegisterDate(new Date());
				user.setPortraitPath(Common.getUserImage());
				user.setAddress("");
				userMapper.insertSelective(user);


				// 注册成功后将验证信息删除掉
				smsValidate.setSendCode("");
				smsValidateMapper.updateByPrimaryKey(smsValidate);

				try {

					SmsManager.sendCloSmsRegisterSuccess(userName);
				} catch (Exception e) {
					
				}
				session.setAttribute("userIdx", user.getIdx());
				result_code = 0;
				return new ModelAndView("message", Common.GetResponsePost(user,
						"登陆成功!", result_code));

			} else {
				result_code = -1;
				return new ModelAndView("message", Common.GetResponsePost(null,
						"验证码错误或过期,请重新尝试!", result_code));
			}

		}*/
	}
	
	@RequestMapping(value = "/sigin-out")
	public ResponseData singinOut(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {

		session.setAttribute("userIdx", 0);
		session.setAttribute("userName", "");
		return new ResponseData(ExceptionMsg.SUCCESS);
		
	}
}
