package boot.mall.controller.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

@Controller
public class MallContrller {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	@RequestMapping(value = "/healthMall")
	public ModelAndView login(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("healthMall Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		int result_code = 0;
		Map<String, Object> postData = new HashMap<String, Object>();
		Map<String, Object> posts = new HashMap<String, Object>();
		posts.put("res", "12");
		// RsdCircle circle = circleMapper.selectByPrimaryKey(9);
		posts.put("result_code", result_code);
		postData.put("message", JSON.toJSONString(posts));
		return new ModelAndView("mall/healthMall", postData);
	}
}
