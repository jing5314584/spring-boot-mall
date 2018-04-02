package boot.mall.controller.web;

import java.util.ArrayList;
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

import boot.mall.mybatis.mapper.ConfProductSubjectMapper;
import boot.mall.mybatis.mapper.ProductDetailMapper;
import boot.mall.mybatis.mapper.ProductMapper;
import boot.mall.mybatis.mapper.V_ProductSubjectMapper;
import boot.mall.mybatis.mapper.V_ShoppingCartMapper;
import boot.mall.mybatis.model.ConfProductSubject;
import boot.mall.mybatis.model.ConfProductSubjectExample;
import boot.mall.mybatis.model.Product;
import boot.mall.mybatis.model.ProductDetailWithBLOBs;
import boot.mall.mybatis.model.V_ProductSubject;
import boot.mall.mybatis.model.V_ProductSubjectExample;
import boot.mall.mybatis.model.V_ShoppingCart;
import boot.mall.mybatis.model.V_ShoppingCartExample;

import com.alibaba.fastjson.JSON;

@Controller
public class MallContrller {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private ConfProductSubjectMapper confProductSubjectMapper;
	@Autowired
	private V_ProductSubjectMapper v_ProductSubjectMapper;
	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private ProductDetailMapper productDetailMapper;
	@Autowired
	private V_ShoppingCartMapper v_ShoppingCartMapper;
	@RequestMapping(value = "/healthMall")
	public ModelAndView login(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("healthMall Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		
		Map<String, Object> postData = new HashMap<String, Object>();
		ConfProductSubjectExample confProductSubjectExample = new ConfProductSubjectExample();
		confProductSubjectExample.createCriteria()
				.andParentSubjectIdxEqualTo(0).andViewOrderNotEqualTo(0);
		confProductSubjectExample.setOrderByClause("view_order desc");
		List<ConfProductSubject> confProductSubjectList = confProductSubjectMapper
				.selectByExample(confProductSubjectExample);
		postData.put("confProductSubjectList", confProductSubjectList);
		List<V_ProductSubject> v_productSubjectList=new ArrayList<V_ProductSubject>();
		if (confProductSubjectList.size() > 0) {
			V_ProductSubjectExample v_ProductSubjectExample = new V_ProductSubjectExample();
			v_ProductSubjectExample
					.createCriteria()
					.andParentSubjectIdxEqualTo(confProductSubjectList.get(0).getIdx())
					.andIsShowEqualTo(1);
			v_ProductSubjectExample.setOrderByClause("view_order desc");
			v_productSubjectList = v_ProductSubjectMapper
					.selectByExample(v_ProductSubjectExample);
		}
		postData.put("v_productSubjectList", v_productSubjectList);
		return new ModelAndView("mall/healthMall", postData);
	}
	
	@RequestMapping(value = "getProductbySubject")
	public ModelAndView getProductbySubject(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("getProductbySubject controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));
		int subjectIdx = 0;
		try {
			subjectIdx = Integer.parseInt(request.getParameter("subjectIdx"));
		} catch (Exception e) {
		}
		
		V_ProductSubjectExample v_ProductSubjectExample = new V_ProductSubjectExample();
		v_ProductSubjectExample
				.createCriteria()
				.andParentSubjectIdxEqualTo(subjectIdx)
				.andIsShowEqualTo(1);
		v_ProductSubjectExample.setOrderByClause("view_order desc");
		List<V_ProductSubject> v_productSubjectList = v_ProductSubjectMapper
				.selectByExample(v_ProductSubjectExample);
//		System.out.println(v_productSubjectList);
		Map<String, Object> postData = new HashMap<String, Object>();
		Map<String, Object> posts = new HashMap<String, Object>();
		posts.put("v_productSubjectList", v_productSubjectList);
		postData.put("message", JSON.toJSONString(posts));

		return new ModelAndView("message", postData);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/product-detail")
	public ModelAndView productDetail(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("productDetail Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		Map<String, Object> postData = new HashMap<String, Object>();
		String productIdx = request.getParameter("id");
		Product product = null;
		ProductDetailWithBLOBs productDetail = null;
		List<String> baseInfoList = new ArrayList<String>();
		if (productIdx != null) {

			product = productMapper.selectByPrimaryKey(Integer
					.parseInt(productIdx));
			productDetail = productDetailMapper.selectByPrimaryKey(Integer
					.parseInt(productIdx));
			if (productDetail.getBaseInfo() != null) {
				try {
					baseInfoList = (List<String>) com.alibaba.fastjson.JSONArray
							.parse(productDetail.getBaseInfo());
				} catch (Exception e) {
				}
			}
		}
		postData.put("product", product);
		postData.put("productDetail", productDetail);
		postData.put("baseInfoList", baseInfoList);
		return new ModelAndView("mall/product-detail", postData);
	}
	
	@RequestMapping(value = "/user-cart")
	public ModelAndView userCart(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("userCart Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		Map<String, Object> postData = new HashMap<String, Object>();
		Object o = session.getAttribute("userIdx");
		List<V_ShoppingCart> shoppingCartList = new ArrayList<V_ShoppingCart>();
//		if (o != null) {
			int userIdx = 867;
			try {
				userIdx = Integer.parseInt(o.toString());
			} catch (Exception e) {
			}
			V_ShoppingCartExample example = new V_ShoppingCartExample();
			example.createCriteria().andUserIdxEqualTo(userIdx)
					.andParentIdxEqualTo(0);
			shoppingCartList = v_ShoppingCartMapper.selectByExample(example);
//		}
		postData.put("shoppingCartList", shoppingCartList);
		postData.put("shoppingCartListSize", shoppingCartList.size());
		return new ModelAndView("mall/user-cart", postData);
	}
}
