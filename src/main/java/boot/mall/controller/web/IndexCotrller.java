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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import boot.mall.mybatis.mapper.OrderDetailSubMapper;
import boot.mall.mybatis.mapper.OrderMapper;
import boot.mall.mybatis.model.Order;
import boot.mall.mybatis.model.OrderDetailSub;
import boot.mall.mybatis.model.OrderDetailSubExample;

import com.alibaba.fastjson.JSON;

@Controller
public class IndexCotrller {
	private static Logger logger = LoggerFactory.getLogger(IndexCotrller.class);
	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private OrderDetailSubMapper orderDetailSubMapper;
	@RequestMapping(value = "/index" ,method=RequestMethod.GET)
	public String index(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("index Handler");
		return "index";
	}
	@RequestMapping(value = "/product-detail")
	public String productDetail(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("productDetail Handler");
		String productIdx = request.getParameter("id");
		/**/
		return "product-detail";
	}
	@RequestMapping(value = "contactUs")
	public String contactUs(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		
		return "contact-us";
	}
	@RequestMapping(value = "/news-detail")
	public String newsDetail(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		int d=1;
		try {
			d = Integer.parseInt(request.getParameter("d"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "news-detail"+d;
	}
	@RequestMapping(value = "/news")
	public String news() {
		return "news";
	}
	@RequestMapping(value = "/yhby-App")
	public String yhbyApp() {
		return "yhby-app";
	}
	@RequestMapping(value = "/doctorList")
	public String doctorList() {
		
		return "doctorList";
	}
	@RequestMapping(value = "/healthMall")
	public String healthMall() {
		return "healthMall";
	}
	@RequestMapping(value = "/user-cart")
	public String userCart() {
		return "user-cart";
	}
	@RequestMapping(value = "/check-out")
	public String checkOut() {
		return "check-out";
	}
	@RequestMapping(value = "/online-charge")
	public String onlineCharge(HttpServletRequest request,ModelMap model) {
		logger.info("online-charge Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		int orderIdx = 0;
		try {
			orderIdx = Integer.parseInt(request.getParameter("orderId"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		double price = 0;
		String orderName = "";
		String name = "";
		String phone = "";
		String address = "";
		Order order=orderMapper.selectByPrimaryKey(orderIdx);
		System.out.println("orderID"+orderIdx);
		if (order != null) {
			price = Double.parseDouble(order.getTotalPrice()+"")/100;
			orderName = order.getOrderName();
			OrderDetailSubExample example=new OrderDetailSubExample();
			example.createCriteria().andOrderIdxEqualTo(orderIdx);
			List<OrderDetailSub> orderDetailSubList = orderDetailSubMapper.selectByExample(example);
			if (orderDetailSubList.size() > 0) {
				name = orderDetailSubList.get(0).getConsignee();
				phone = orderDetailSubList.get(0).getPhone();
				address = orderDetailSubList.get(0).getAddress();
			}
		}
		model.put("price", price);
		model.put("orderName", orderName);
		model.put("name", name);
		model.put("phone", phone);
		model.put("address", address);
		model.put("orderIdx", orderIdx);
		return "online-charge";
	}
}
