package boot.mall.controller.web;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import boot.mall.constants.Common;
import boot.mall.controller.Sender;
import boot.mall.controller.web.manager.SmsManager;
import boot.mall.controller.web.manager.TokenManager;
import boot.mall.mybatis.mapper.RsdCircleMapper;
import boot.mall.mybatis.mapper.SmsValidateMapper;
import boot.mall.mybatis.mapper.UserMapper;
import boot.mall.mybatis.model.SmsValidate;
import boot.mall.mybatis.model.User;
import boot.mall.mybatis.model.UserExample;

import com.alibaba.fastjson.JSON;

@Controller
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private RsdCircleMapper rsdCircleMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
    private TokenManager tokenManager;
	@Autowired
	private SmsValidateMapper smsValidateMapper;
	@Autowired
	private Sender sender;
	@RequestMapping(value = "/index")
	public ModelAndView index(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("test Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		int result_code = 0;
		Map<String, Object> postData = new HashMap<String, Object>();
		Map<String, Object> posts = new HashMap<String, Object>();
		posts.put("res", "12");
		// RsdCircle circle = circleMapper.selectByPrimaryKey(9);
		posts.put("result_code", result_code);
		postData.put("message", JSON.toJSONString(posts));
		return new ModelAndView("mall/index", postData);
	}
	@RequestMapping(value = "/login")
	public ModelAndView login(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("login Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		int result_code = 0;
		String userName = request.getParameter("userName");
		String userCode = request.getParameter("code");
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUserNameEqualTo(userName);
		List<User> userList = userMapper.selectByExample(userExample);
		User user = null;
		session.setAttribute("userIdx", 867);
		session.setAttribute("userName", "天追梦人心");
		result_code = 0;
		return new ModelAndView("message", Common.GetResponsePost(user,
				"登陆成功!", result_code));
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
	
	@RequestMapping(value = "/register")
	public ModelAndView register(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("register Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		int result_code = 0;
		Map<String, Object> postData = new HashMap<String, Object>();
		Map<String, Object> posts = new HashMap<String, Object>();
		/*String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		UserExample userExample=new UserExample();
		userExample.createCriteria().andPhoneEqualTo(phone);
		List<User> userList = userMapper.selectByExample(userExample);
		
		if (userList.size() != 1) {
			posts.put("res", "未注册");
			posts.put("result_code", -1);
			postData.put("message", JSON.toJSONString(posts));
			return new ModelAndView("mall/login", postData);
		}
		if(!userList.get(0).getPassWord().equals(password)){
			posts.put("res", "密码错误");
			posts.put("result_code", -1);
			postData.put("message", JSON.toJSONString(posts));
			return new ModelAndView("mall/login", postData);
		}
        // 生成一个 token，保存用户登录状态
        TokenModel model = tokenManager.createToken (userList.get(0).getIdx ());*/
		posts.put("res", "12");
		posts.put("result_code", result_code);
		postData.put("message", JSON.toJSONString(posts));
		return new ModelAndView("mall/register", postData);
	}
	//http://localhost:8080/Mall/register?phone=15316028637&password=5314584
	//http://localhost:8080/Mall/getToken?userIdx=1
	@RequestMapping(value = "/getToken")
	public ModelAndView getToken(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		int userIdx = Integer.parseInt(request.getParameter("userIdx"));
			String token=tokenManager.getToken(userIdx);
			System.out.println("Token = "+token);
			return null;
		
	}
	@RequestMapping(value = "/sigin-out")
	public ModelAndView singinOut(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("sigin-out Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		int result_code = 0;
		session.setAttribute("userIdx", 0);
		session.setAttribute("userName", "");
		return new ModelAndView("message", Common.GetResponsePost(null,
				"登陆成功!", result_code));
		
	}
}
