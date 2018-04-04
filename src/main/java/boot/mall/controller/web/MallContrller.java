package boot.mall.controller.web;

import java.math.BigDecimal;
import java.util.ArrayList;
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
import boot.mall.mybatis.mapper.ConfProductSubjectMapper;
import boot.mall.mybatis.mapper.ProductDetailMapper;
import boot.mall.mybatis.mapper.ProductMapper;
import boot.mall.mybatis.mapper.ShoppingCartMapper;
import boot.mall.mybatis.mapper.V_ProductSubjectMapper;
import boot.mall.mybatis.mapper.V_ShoppingCartMapper;
import boot.mall.mybatis.model.ConfProductSubject;
import boot.mall.mybatis.model.ConfProductSubjectExample;
import boot.mall.mybatis.model.Product;
import boot.mall.mybatis.model.ProductDetailWithBLOBs;
import boot.mall.mybatis.model.ShoppingCart;
import boot.mall.mybatis.model.ShoppingCartExample;
import boot.mall.mybatis.model.V_ProductSubject;
import boot.mall.mybatis.model.V_ProductSubjectExample;
import boot.mall.mybatis.model.V_ShoppingCart;
import boot.mall.mybatis.model.V_ShoppingCartExample;

import com.alibaba.fastjson.JSON;

@Controller
public class MallContrller {
	private static Logger logger = LoggerFactory
			.getLogger(UserController.class);
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
	@Autowired
	private ShoppingCartMapper shoppingCartMapper;

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
		List<V_ProductSubject> v_productSubjectList = new ArrayList<V_ProductSubject>();
		if (confProductSubjectList.size() > 0) {
			V_ProductSubjectExample v_ProductSubjectExample = new V_ProductSubjectExample();
			v_ProductSubjectExample
					.createCriteria()
					.andParentSubjectIdxEqualTo(
							confProductSubjectList.get(0).getIdx())
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
		v_ProductSubjectExample.createCriteria()
				.andParentSubjectIdxEqualTo(subjectIdx).andIsShowEqualTo(1);
		v_ProductSubjectExample.setOrderByClause("view_order desc");
		List<V_ProductSubject> v_productSubjectList = v_ProductSubjectMapper
				.selectByExample(v_ProductSubjectExample);
		// System.out.println(v_productSubjectList);
		Map<String, Object> postData = new HashMap<String, Object>();
		Map<String, Object> posts = new HashMap<String, Object>();
		posts.put("v_productSubjectList", v_productSubjectList);
		postData.put("message", JSON.toJSONString(posts));

		return new ModelAndView("message", postData);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/product-detail")
	public ModelAndView productDetail(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
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
	public ModelAndView userCart(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("userCart Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		Map<String, Object> postData = new HashMap<String, Object>();
		Object o = session.getAttribute("userIdx");
		List<V_ShoppingCart> shoppingCartList = new ArrayList<V_ShoppingCart>();
		// if (o != null) {
		int userIdx = 867;
		try {
			userIdx = Integer.parseInt(o.toString());
		} catch (Exception e) {
		}
		V_ShoppingCartExample example = new V_ShoppingCartExample();
		example.createCriteria().andUserIdxEqualTo(userIdx)
				.andParentIdxEqualTo(0);
		shoppingCartList = v_ShoppingCartMapper.selectByExample(example);
		// }
		double selectProductPrice = 0;
		for (int i = 0; i < shoppingCartList.size(); i++) {
			V_ShoppingCart shoppingCartSelect = shoppingCartList.get(i);
			selectProductPrice += Double.parseDouble(shoppingCartSelect
					.getProductPrice().multiply(
							new BigDecimal(shoppingCartSelect.getProductNum()))
					+ "");
		}
		postData.put("price", selectProductPrice);
		postData.put("shoppingCartList", shoppingCartList);
		postData.put("shoppingCartListSize", shoppingCartList.size());
		return new ModelAndView("mall/user-cart", postData);
	}

	@RequestMapping(value = "updateShoppingCartProduct")
	public ModelAndView updateShoppingCartProduct(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("updateShoppingCartProduct controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));

		int idx = 0;
		try {
			idx = Integer.parseInt(request.getParameter("idx"));
		} catch (Exception e) {
		}
		String count = request.getParameter("count");
		Map<String, Object> postData = new HashMap<String, Object>();
		Map<String, Object> pots = new HashMap<String, Object>();

		ShoppingCart shoppingCart = shoppingCartMapper.selectByPrimaryKey(idx);

		if (shoppingCart != null) {
			shoppingCart.setProductNum(Integer.parseInt(count));
			shoppingCartMapper.updateByPrimaryKeySelective(shoppingCart);
		} else {
			System.err.println("无法更新");
		}
		double selectCartPrice = 0;
		selectCartPrice += Double.parseDouble(shoppingCart.getProductPrice()
				.multiply(new BigDecimal(shoppingCart.getProductNum())) + "");
		int userIdx = 867;
		V_ShoppingCartExample example = new V_ShoppingCartExample();
		example.createCriteria().andUserIdxEqualTo(userIdx)
				.andParentIdxEqualTo(0);
		List<V_ShoppingCart> shoppingCartList = v_ShoppingCartMapper
				.selectByExample(example);
		double selectProductPrice = 0;
		for (int i = 0; i < shoppingCartList.size(); i++) {
			V_ShoppingCart shoppingCartSelect = shoppingCartList.get(i);
			selectProductPrice += Double.parseDouble(shoppingCartSelect
					.getProductPrice().multiply(
							new BigDecimal(shoppingCartSelect.getProductNum()))
					+ "");
		}
		pots.put("selectCartPrice", selectCartPrice);
		pots.put("price", selectProductPrice);
		postData.put("message", JSON.toJSONString(pots));
		return new ModelAndView("message", postData);

	}
	
	@RequestMapping(value = "/check-out")
	public ModelAndView checkOut(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("check-out Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		Map<String, Object> postData = new HashMap<String, Object>();
		
		return new ModelAndView("mall/check-out", postData);
	}
	@RequestMapping(value = "/online-charge")
	public ModelAndView onlineCharge(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("online-charge Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		Map<String, Object> postData = new HashMap<String, Object>();
		
		return new ModelAndView("mall/online-charge", postData);
	}
	@RequestMapping(value = "/addShoppingCart")
	public ModelAndView addShoppingCart(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("addShoppingCart controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));

		Object o = session.getAttribute("userIdx");
		Map<String, Object> postData = new HashMap<String, Object>();
		Map<String, Object> pots = new HashMap<String, Object>();
		int productIdx = 0;
		int userIdx = 0;
		int result_code = 0;
		int productNum = 1;
		try {
			userIdx = Integer.parseInt(o.toString());
		} catch (Exception e) {
			result_code = -1;
			return new ModelAndView("message", Common.GetResponsePost(null, "当前用户数据异常请重新登录！", result_code));
		}
		try {
			productIdx = Integer.parseInt(request.getParameter("productIdx"));
			productNum = Integer.parseInt(request.getParameter("productNum"));
		} catch (Exception e) {
			result_code = -1;
			return new ModelAndView("message", Common.GetResponsePost(null, "当前商品不存在或已下架", result_code));
		}
		if (productIdx != 0) {
			Product product = productMapper.selectByPrimaryKey(productIdx);
			if (product != null) {
				ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
				shoppingCartExample.createCriteria().andUserIdxEqualTo(userIdx)
						.andProductIdxEqualTo(productIdx);
				List<ShoppingCart> shoppingCartList = shoppingCartMapper
						.selectByExample(shoppingCartExample);
				if (shoppingCartList.size() > 0) {
					ShoppingCart shoppingCart = shoppingCartList.get(0);
					shoppingCart.setProductNum(productNum+shoppingCart.getProductNum());
					shoppingCart.setAddTime(new Date());
					shoppingCartMapper.updateByPrimaryKeySelective(shoppingCart);
				} else {

					ShoppingCart shoppingCart = new ShoppingCart();
					shoppingCart.setProductIdx(productIdx);
					shoppingCart.setProductName(product.getProductName());
					shoppingCart.setProductNum(productNum);
					shoppingCart.setProductPrice(product.getDiscountPrice());
					shoppingCart.setProductType(1);
					shoppingCart.setUserIdx(userIdx);
					shoppingCart.setAddTime(new Date());
					shoppingCart.setParentIdx(0);
					shoppingCartMapper.insertSelective(shoppingCart);
				}

			} else {
				result_code = -1;
				return new ModelAndView("message", Common.GetResponsePost(null, "当前商品不存在或已下架", result_code));
			}

		} else {
			result_code = -1;
			return new ModelAndView("message", Common.GetResponsePost(null, "当前商品不存在或已下架", result_code));
		}

		pots.put("error_string", "加入商品成功");
		pots.put("result_code", 0);
		postData.put("message", JSON.toJSONString(pots));
		return new ModelAndView("message", postData);

	}
	@RequestMapping(value = "/getShoppingCartCount")
	public ModelAndView getShoppingCartCount(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("getShoppingCartCount controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));
		Object o = session.getAttribute("userIdx");
		int userIdx = 0;
		int result_code = 0;
		try {
			userIdx = Integer.parseInt(o.toString());
		} catch (Exception e) {
			result_code = -1;
			return new ModelAndView("message", Common.GetResponsePost(null, "当前用户数据异常请重新登录！", result_code));
		}
		int shoppingCartCount = 0;
		V_ShoppingCartExample example = new V_ShoppingCartExample();
		example.createCriteria().andUserIdxEqualTo(userIdx).andParentIdxEqualTo(0);
		List<V_ShoppingCart> shoppingCartList = v_ShoppingCartMapper.selectByExample(example);
		for (int i = 0; i < shoppingCartList.size(); i++) {
			shoppingCartCount += shoppingCartList.get(i).getProductNum();
			
		}
		return new ModelAndView("message", Common.GetResponsePost(shoppingCartCount, "当前用户数据异常请重新登录！", result_code));
		
	}
	
}
