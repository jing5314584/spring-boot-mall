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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import boot.mall.constants.Common;
import boot.mall.constants.Common.EnumOrderState;
import boot.mall.controller.result.ExceptionMsg;
import boot.mall.controller.result.ResponseData;
import boot.mall.mybatis.mapper.ConfProductSubjectMapper;
import boot.mall.mybatis.mapper.OrderDetailMapper;
import boot.mall.mybatis.mapper.OrderDetailSubMapper;
import boot.mall.mybatis.mapper.OrderMapper;
import boot.mall.mybatis.mapper.ProductDetailMapper;
import boot.mall.mybatis.mapper.ProductMapper;
import boot.mall.mybatis.mapper.ReceiveAddressMapper;
import boot.mall.mybatis.mapper.ShoppingCartMapper;
import boot.mall.mybatis.mapper.V_IndexProductMapper;
import boot.mall.mybatis.mapper.V_ProductSubjectMapper;
import boot.mall.mybatis.mapper.V_ShoppingCartMapper;
import boot.mall.mybatis.model.ConfProductSubject;
import boot.mall.mybatis.model.ConfProductSubjectExample;
import boot.mall.mybatis.model.Order;
import boot.mall.mybatis.model.OrderDetail;
import boot.mall.mybatis.model.OrderDetailSub;
import boot.mall.mybatis.model.Product;
import boot.mall.mybatis.model.ProductDetailWithBLOBs;
import boot.mall.mybatis.model.ReceiveAddress;
import boot.mall.mybatis.model.ReceiveAddressExample;
import boot.mall.mybatis.model.ShoppingCart;
import boot.mall.mybatis.model.ShoppingCartExample;
import boot.mall.mybatis.model.V_IndexProduct;
import boot.mall.mybatis.model.V_IndexProductExample;
import boot.mall.mybatis.model.V_ProductSubject;
import boot.mall.mybatis.model.V_ProductSubjectExample;
import boot.mall.mybatis.model.V_ShoppingCart;
import boot.mall.mybatis.model.V_ShoppingCartExample;

import com.alibaba.fastjson.JSON;


@RestController
public class MallContrller {
	private static Logger logger = LoggerFactory
			.getLogger(MallContrller.class);
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
	@Autowired
	private ReceiveAddressMapper receiveAddressMapper;
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private OrderDetailMapper orderDetailMapper;
	@Autowired
	private OrderDetailSubMapper orderDetailSubMapper;
	@Autowired
	private V_IndexProductMapper v_IndexProductMapper;
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "getProductDetail")
	public ResponseData getProductDetail(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("getProductDetail Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
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
		}else{
			return new ResponseData(ExceptionMsg.FAILED);
		}
		Map<String, Object> postData = new HashMap<String, Object>();
		postData.put("product", product);
		postData.put("productDetail", productDetail);
		postData.put("baseInfoList", baseInfoList);
		
		return new ResponseData(ExceptionMsg.SUCCESS, postData);
	}
	@RequestMapping(value = "/getProductbySubjectList")
	public ResponseData login(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("getProductbySubjectList Handler,Parameter=："
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
		return new ResponseData(ExceptionMsg.SUCCESS, postData);
	}

	@RequestMapping(value = "getProductbySubject")
	public ResponseData getProductbySubject(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("getProductbySubject controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));
		int subjectIdx = 0;
		try {
			subjectIdx = Integer.parseInt(request.getParameter("subjectIdx"));
		} catch (Exception e) {
			return new ResponseData(ExceptionMsg.FAILED);
		}

		V_ProductSubjectExample v_ProductSubjectExample = new V_ProductSubjectExample();
		v_ProductSubjectExample.createCriteria()
				.andParentSubjectIdxEqualTo(subjectIdx).andIsShowEqualTo(1);
		v_ProductSubjectExample.setOrderByClause("view_order desc");
		List<V_ProductSubject> v_productSubjectList = v_ProductSubjectMapper
				.selectByExample(v_ProductSubjectExample);

		return new ResponseData(ExceptionMsg.SUCCESS, v_productSubjectList);
	}

	
	@RequestMapping(value = "getProductListBytype")
	public String getProductListBytype(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		int type = 1;
		try {
			type = Integer.parseInt(request.getParameter("type"));
		} catch (Exception e) {
			
		}
		V_IndexProductExample example=new V_IndexProductExample();
		example.createCriteria().andTypeEqualTo(type);
		List<V_IndexProduct> productList = v_IndexProductMapper.selectByExample(example);
		
		return JSON.toJSONString(productList);
	}
	@RequestMapping(value = "/getCartProduct")
	public ResponseData userCart(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("getCartProduct Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		Map<String, Object> postData = new HashMap<String, Object>();
		int userIdx = 0;
		Object o = session.getAttribute("userIdx");
		List<V_ShoppingCart> shoppingCartList = new ArrayList<V_ShoppingCart>();
		if (o != null) {
			userIdx = Integer.parseInt(o.toString());
		}else{
			return new ResponseData(ExceptionMsg.FAILED);
		}
		V_ShoppingCartExample example = new V_ShoppingCartExample();
		example.createCriteria().andUserIdxEqualTo(userIdx)
				.andParentIdxEqualTo(0);
		shoppingCartList = v_ShoppingCartMapper.selectByExample(example);
		
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
		return new ResponseData(ExceptionMsg.SUCCESS, postData);
	}

	@RequestMapping(value = "updateShoppingCartProduct")
	public ResponseData updateShoppingCartProduct(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("updateShoppingCartProduct controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));
		int userIdx = 0;
		Object o = session.getAttribute("userIdx");
		if (o != null) {
			userIdx = Integer.parseInt(o.toString());
		}else{
			return new ResponseData(ExceptionMsg.FAILED);
		}
		int idx = 0;
		try {
			idx = Integer.parseInt(request.getParameter("idx"));
		} catch (Exception e) {
			return new ResponseData(ExceptionMsg.FAILED);
		}
		String count = request.getParameter("count");
		Map<String, Object> postData = new HashMap<String, Object>();

		ShoppingCart shoppingCart = shoppingCartMapper.selectByPrimaryKey(idx);

		if (shoppingCart != null) {
			shoppingCart.setProductNum(Integer.parseInt(count));
			shoppingCartMapper.updateByPrimaryKeySelective(shoppingCart);
		} else {
			return new ResponseData(ExceptionMsg.FAILED);
		}
		double selectCartPrice = 0;
		selectCartPrice += Double.parseDouble(shoppingCart.getProductPrice()
				.multiply(new BigDecimal(shoppingCart.getProductNum())) + "");
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
		postData.put("selectCartPrice", selectCartPrice);
		postData.put("price", selectProductPrice);
		return new ResponseData(ExceptionMsg.SUCCESS, postData);

	}
	
	@RequestMapping(value = "/checkOutData")
	public ResponseData checkOut(HttpSession session,HttpServletRequest request) {
		logger.info("checkOutData Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		int userIdx = 0;
		int addressIdx = 0;
		double selectProductPrice = 0;
		int count = 0;
		Object o = session.getAttribute("userIdx");
		if (o != null) {
			userIdx = Integer.parseInt(o.toString());
		}
		Map<String, Object> postData = new HashMap<String, Object>();
		List<ReceiveAddress> addresseList = new ArrayList<ReceiveAddress>();
		List<V_ShoppingCart> shoppingCartList = new ArrayList<V_ShoppingCart>();
		if (userIdx != 0) {
			ReceiveAddressExample example = new ReceiveAddressExample();
			example.createCriteria().andUserIdxEqualTo(userIdx);
			example.setOrderByClause("create_time desc");
			addresseList = receiveAddressMapper.selectByExample(example);
			
			
		}
		V_ShoppingCartExample example = new V_ShoppingCartExample();
		example.createCriteria().andUserIdxEqualTo(userIdx)
				.andParentIdxEqualTo(0);
		shoppingCartList = v_ShoppingCartMapper.selectByExample(example);
		// }
		
		for (int i = 0; i < shoppingCartList.size(); i++) {
			V_ShoppingCart shoppingCartSelect = shoppingCartList.get(i);
			selectProductPrice += Double.parseDouble(shoppingCartSelect
					.getProductPrice().multiply(
							new BigDecimal(shoppingCartSelect.getProductNum()))
					+ "");
			count += shoppingCartSelect.getProductNum();
		}
		if (addresseList.size()>0) {
			addressIdx = addresseList.get(0).getIdx();
		}
		postData.put("selectProductPrice", selectProductPrice);
		postData.put("shoppingCartList", shoppingCartList);
		postData.put("count", count);
		postData.put("addressIdx", addressIdx);
		postData.put("addressList", addresseList);
		return new ResponseData(ExceptionMsg.SUCCESS, postData);
	}
	
	@RequestMapping(value = "/addShoppingCart")
	public ResponseData addShoppingCart(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("addShoppingCart controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));

		Object o = session.getAttribute("userIdx");
		int productIdx = 0;
		int userIdx = 0;
		int productNum = 1;
		try {
			userIdx = Integer.parseInt(o.toString());
		} catch (Exception e) {
			return new ResponseData(ExceptionMsg.ParamError);
		}
		try {
			productIdx = Integer.parseInt(request.getParameter("productIdx"));
			productNum = Integer.parseInt(request.getParameter("productNum"));
		} catch (Exception e) {
			return new ResponseData(ExceptionMsg.ParamError);
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
				return new ResponseData("000001", "当前商品不存在或已下架");
			}

		} else {
			return new ResponseData("000001", "当前商品不存在或已下架");
		}

		return new ResponseData(ExceptionMsg.SUCCESS);

	}
	@RequestMapping(value = "/getShoppingCartCount")
	public ResponseData getShoppingCartCount(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("getShoppingCartCount controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));
		Object o = session.getAttribute("userIdx");
		if(o == null){
			return new ResponseData(ExceptionMsg.FAILED, 0);
		}
		int userIdx = 0;
		try {
			userIdx = Integer.parseInt(o.toString());
		} catch (Exception e) {
			return new ResponseData(ExceptionMsg.FAILED, 0);
		}
		int shoppingCartCount = 0;
		V_ShoppingCartExample example = new V_ShoppingCartExample();
		example.createCriteria().andUserIdxEqualTo(userIdx).andParentIdxEqualTo(0);
		List<V_ShoppingCart> shoppingCartList = v_ShoppingCartMapper.selectByExample(example);
		for (int i = 0; i < shoppingCartList.size(); i++) {
			shoppingCartCount += shoppingCartList.get(i).getProductNum();
			
		}
		return new ResponseData(ExceptionMsg.SUCCESS, shoppingCartCount);
		
	}
	/**
	 * 更新收货人地址
	 * 
	 * @param session
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "updateAddressForHealthMall")
	public ResponseData updateAddressForHealthMall(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {

		logger.info("updateAddressForHealthMall controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));
		Object o = session.getAttribute("userIdx");
		int userIdx = 0;
		if (o != null) {
			userIdx = Integer.parseInt(o.toString());
		}
		String addressIdx = request.getParameter("addressIdx");

		String name = request.getParameter("name");// 收货人
		String phone = request.getParameter("phone");// 收货人联系方式
		String address = request.getParameter("address");// 收货人地址
		String sheng = request.getParameter("sheng");// 收货人省
		String chengshi = request.getParameter("chengshi");// 收货人城市
		String diqu = request.getParameter("diqu");// 收货人地区

		if (phone != null && !phone.trim().equals("")) {
			if (!Common.isPhoneNum(phone)) {
				return new ResponseData("000001","请确认手机号是否填写正确");
			}
		} else {
			return new ResponseData("000001","请确认手机号是否填写");
		}
		if (addressIdx != null && !addressIdx.equals("0")) {
			ReceiveAddress receiveAddress = receiveAddressMapper
					.selectByPrimaryKey(Integer.parseInt(addressIdx));
			receiveAddress.setCreateTime(new Date());
			receiveAddress.setOrderIdx(0);
			receiveAddress.setUserIdx(userIdx);
			receiveAddress.setPhone(phone);
			receiveAddress.setReceiveAddressProvince(sheng);
			receiveAddress.setReceiveAddressCity(chengshi);
			receiveAddress.setReceiveAddressArea(diqu);
			receiveAddress.setReceiveAddressDetail(address);
			receiveAddress.setReceive(name);
			receiveAddressMapper.updateByPrimaryKeySelective(receiveAddress);

			return new ResponseData(ExceptionMsg.SUCCESS);
		}
		return new ResponseData(ExceptionMsg.ParamError);

	}
	/**
	 * 添加收货人地址
	 * 
	 * @param session
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "addAddressForHealthMall")
	public ResponseData addAddressForHealthMall(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		Object o = session.getAttribute("userIdx");
		logger.info("addAddressForHealthMall controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));
		int userIdx = 0;
		if (o != null) {
			userIdx = Integer.parseInt(o.toString());
		}

		String name = request.getParameter("name");// 收货人
		String phone = request.getParameter("phone");// 收货人联系方式
		String address = request.getParameter("address");// 收货人地址
		String sheng = request.getParameter("sheng");// 收货人省
		String chengshi = request.getParameter("chengshi");// 收货人城市
		String diqu = request.getParameter("diqu");// 收货人地区

		ReceiveAddress receiveAddress = new ReceiveAddress();
		receiveAddress.setCreateTime(new Date());
		receiveAddress.setOrderIdx(0);
		receiveAddress.setUserIdx(userIdx);
		receiveAddress.setPhone(phone);
		receiveAddress.setReceiveAddressProvince(sheng);
		receiveAddress.setReceiveAddressCity(chengshi);
		receiveAddress.setReceiveAddressArea(diqu);
		receiveAddress.setReceiveAddressDetail(address);
		receiveAddress.setReceive(name);
		receiveAddressMapper.insertSelective(receiveAddress);

		return new ResponseData(ExceptionMsg.SUCCESS);

	}
	/**
	 * 创 建 者: 景朋飞 创建日期: 2016年10月11日 下午1:41:50 接 口 名: deleteShoppingCartProduct
	 * 接口描述: 删除购物车商品 参 数: idx 购物车的idx 返回参数: result_code errorString
	 */
	@RequestMapping(value = "deleteShoppingCartProduct")
	public ResponseData deleteShoppingCartProduct(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("deleteShoppingCartProduct controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));
		int idx = 0;
		try {
			idx = Integer.parseInt(request.getParameter("productIdx"));
		} catch (Exception e) {
			return new ResponseData(ExceptionMsg.ParamError);
		}

		try {
			shoppingCartMapper.deleteByPrimaryKey(idx);

			return new ResponseData(ExceptionMsg.SUCCESS);
		} catch (Exception e) {
			return new ResponseData(ExceptionMsg.FAILED);
		}

	}
	/**
	 * 删除收货人地址
	 * 
	 * @param session
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "deleteAddressForHealthMall")
	public ResponseData deleteAddressForHealthMall(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {

		logger.info("deleteAddressForHealthMall controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));
		String receive_idx = request.getParameter("addressIdx");
		if (receive_idx != null && !receive_idx.equals("0")) {

			try {
				receiveAddressMapper.deleteByPrimaryKey(Integer
						.parseInt(receive_idx));
				return new ResponseData(ExceptionMsg.SUCCESS);
			} catch (Exception e) {
				return new ResponseData(ExceptionMsg.FAILED);
			}

		}
		return new ResponseData(ExceptionMsg.FAILED);
	}
	
	@RequestMapping(value = "addOrderNew")
	public ResponseData addOrderNew(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("addOrderNew controller,Parameter = "
				+ JSON.toJSONString(request.getParameterMap()));
		Object o = session.getAttribute("userIdx");
		int userIdx = 0;
		if (o != null) {
			userIdx = Integer.parseInt(o.toString());
		}else{
			return new ResponseData(ExceptionMsg.ParamError);
		}
		
		int addressIdx = 0;
		try {
			addressIdx = Integer.parseInt(request.getParameter("addressIdx"));
		} catch (Exception e) {
			return new ResponseData(ExceptionMsg.ParamError);
		}
		
		String name = "";// 收货人姓名
		String phone = "";// 收货人手机号
		String address = "";// 收货人详细地址；

		if (addressIdx != 0) {
			ReceiveAddress receiveAddress = receiveAddressMapper
					.selectByPrimaryKey(addressIdx);
			if (receiveAddress != null) {
				address = receiveAddress.getReceiveAddressProvince() + "_"
						+ receiveAddress.getReceiveAddressCity() + "_"
						+ receiveAddress.getReceiveAddressArea() + "_"
						+ receiveAddress.getReceiveAddressDetail();
				name = receiveAddress.getReceive();
				phone = receiveAddress.getPhone();
			}
		}
		int orderIdx = 0;
		

		StringBuffer orderNameS = new StringBuffer();
		String orderName = "";
			double selectProductPrice = 0;
			
			V_ShoppingCartExample example = new V_ShoppingCartExample();
			example.createCriteria().andUserIdxEqualTo(userIdx)
					.andParentIdxEqualTo(0);
			List<V_ShoppingCart> shoppingCartList = v_ShoppingCartMapper.selectByExample(example);
			for (int i = 0; i < shoppingCartList.size(); i++) {
				V_ShoppingCart shoppingCartSelect = shoppingCartList.get(i);
				selectProductPrice += Double.parseDouble(shoppingCartSelect
						.getProductPrice().multiply(
								new BigDecimal(shoppingCartSelect.getProductNum()))
						+ "");
				orderNameS.append(shoppingCartSelect
						.getProductName() + "  ");
				
			}
			if (orderNameS.length() > 20) {
				orderName = orderNameS.toString().substring(0, 20) + "...";
			} else {
				orderName = orderNameS.toString();
			}
			orderName = "("+name+")"+orderName;
			orderIdx = addOrderAndOrderDetail(userIdx, selectProductPrice*100,
					orderName, Common.GOODS_SERVICE,0,"");
			
			if (shoppingCartList.size() > 0) {
				for (int i = 0; i < shoppingCartList.size(); i++) {
					V_ShoppingCart shoppingCart = shoppingCartList.get(i);
					OrderDetailSub orderDetailSub = new OrderDetailSub(
							orderIdx, userIdx,
							shoppingCart.getProductIdx(),
							shoppingCart.getProductNum(),
							shoppingCart.getProductPrice(),
							shoppingCart.getProductType(), 0, name,
							address, phone, 0, "", 0,
							new Date(), "", "", new BigDecimal(0));
					orderDetailSubMapper.insertSelective(orderDetailSub);
				}
			}
			ShoppingCartExample shoppingCartExampleNew = new ShoppingCartExample();
			shoppingCartExampleNew.createCriteria().andUserIdxEqualTo(userIdx);
			shoppingCartMapper.deleteByExample(shoppingCartExampleNew);	
			return new ResponseData(ExceptionMsg.SUCCESS,orderIdx);
	}

	private int addOrderAndOrderDetail(int userIdx, double money,
			String content, int orderType,int productIdx,String memo) {
		Order order = new Order();
		order.setLevelIdx(0);
		order.setOrderType(orderType);
		order.setUserIdx(userIdx);
		order.setBillIdx(0);//
		order.setState(EnumOrderState.WaitPay.getState());
		order.setCreateTime(new Date());
		order.setPayTime(new Date());
		order.setRefundTime(new Date());
		order.setTotalPrice((int)money);
		order.setOrderName(Common.getOrderNo());// 订单编号名称
		order.setOrderContent(content);
		order.setMemo(memo);
		orderMapper.insertSelective(order);
		// 创建一个orderDetail
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setOrderIdx(order.getIdx());
		orderDetail.setPriceIdx(10017);
		orderDetail.setProductIdx(productIdx);
		orderDetailMapper.insertSelective(orderDetail);

		return order.getIdx();
	}
}
