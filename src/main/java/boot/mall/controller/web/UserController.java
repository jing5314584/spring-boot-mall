package boot.mall.controller.web;

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

import boot.mall.controller.Sender;
import boot.mall.controller.web.manager.TokenManager;
import boot.mall.mybatis.mapper.RsdCircleMapper;
import boot.mall.mybatis.mapper.UserMapper;
import boot.mall.mybatis.model.TokenModel;
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
		Map<String, Object> postData = new HashMap<String, Object>();
		Map<String, Object> posts = new HashMap<String, Object>();
		posts.put("res", "12");
		// RsdCircle circle = circleMapper.selectByPrimaryKey(9);
		posts.put("result_code", result_code);
		postData.put("message", JSON.toJSONString(posts));
		return new ModelAndView("mall/login", postData);
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
}
