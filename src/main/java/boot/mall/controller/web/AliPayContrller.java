package boot.mall.controller.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import boot.mall.controller.result.ExceptionMsg;
import boot.mall.controller.result.ResponseData;
import boot.mall.mybatis.mapper.OrderMapper;
import boot.mall.mybatis.model.Order;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;

@RestController
public class AliPayContrller {
	private static Logger logger = LoggerFactory
			.getLogger(AliPayContrller.class);
	private static final String CHARSET="UTF-8";
	public static String APP_ID = "2017032306360203";
	private static final String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDNy2cILO53bQc/uR9ug+Fps64AXiujQTkod/t8Cgkx9P1jMzCnxi//LHfLqe/+bskPm4BHBNqCbBz6bZ7yHgkoEo9Rhr0Ve0NrE3mtgUHbaq9ibVd4dAyuskFWyKxrPEFy8XbVc1/eEaiW1pKPhURihYVQbr1MHcmN0RctGJxTk3n8x92xMh08n5lYnCfvG0+r1j6pUwehG0OtbxOUkFPV3mDNhQQVdW84a83qTdJTI096etJYXRpkCnVlI+JOxVk3xi0K1A/Ayu/Z7OFza4q4PpsqIKcmArV05JmGjQ9fXHq471X/DHSjbyHvHaHBnRxT9KZJ0KW4tBxoq1aNx6JBAgMBAAECggEASFbQf9ozdP15R9gOCW4IRXyolG6Fzlw1+Fi8qOxqMQpaK42p87/BzWPXNFsnBnvw5zCVFeHJ4YCZaxovfhI6y8BCarj/LFbo6vGsmuXNvZAx2FpxHeFFN/9m4lel7AgBRaNFT2C/+TKh3WvNlu+Ui0E+DHjwx5nM6LHwAKUfBm02RE2rN2zis5pDhkIUr8pg+nf7ofw3NWz6kB7tzrIB54o+xmjZB32Evk16pH+/dj4JgSHbQxAuOD1i68hV5Bg37w8v7adxXDrxc0s7HAT+RfKOA5KiIoXmaLtUwlhaFoyBbJrMIJ/EF4t4gqv0C1WOl+pOLhQDRI8FiNjU9l2ztQKBgQDtrZsn9WP6BAghsn56bdO6jYr3HqO6PBIrYo9z2oCrXNUmMi+Jk0z2nVxa3+wbF2FJLW8dpdNVNc53f4HwSd9sAVMsuKEndCLIKgDeW43ZQ0/escFTI22ohiMH/07Oyrq7MyM8YQb+LbUL+UBN6nkw8TC2SG5vE+3k/PkoqYZcpwKBgQDdqJkeRLX3Y0DPa9Lm5x1HkMPTzgdPxtifPgWeWl976p2n5xH3AoCGQQBv2ftvqy2QS3mPammptKf+MfY/tp69P3ActE641ImwHQon7bcEqxMp4g6FWR2GTAbWtSMFjUHyc0Upyt9wT6j+el2UqCCkXw4Opkq3uIShDuE+OZHe1wKBgQCMbw6FHq4S9LzlRDUNG8WFrcpVV2pASOwnbFX8izeJiRF8PxztefZ4pOQD4dj87OSTu1+zMd7bsy4qV1Gsa8myZFoDy5eU2z8N7BuVRp1aqTYRDBCBkiZh89fRCt5Cu3B32bBRJbdfChy2VXDUWN2AuJIisktmIG1o5rxFdV0pcwKBgB+4uCkHxk7gKm9EzAr1elA6nHvcWVmGaIvpkV5HKrEOM3/K5txFxGTyOoDHXl9tzPiAhKYMoZCC5SPQvKADn5YP1RiWiUmUSRwmG8T5FR8a6IQu8MsOpNYKXVQu2hM6UvzCmFxRx0ZIcDPzCR90LC+51sYr8Dd4tapi+cMw8/pDAoGACig1EYA3nW1KJ+AOTEAetrBRDfkw+sDI92RpUkkS1eOAhBNGamVORiL3JWrRauyLXjfoHvhOCd7il/gsKobrkKNRB0jMndSPNba2gN4bbiYZ//zff4+HrIS38pky00rEa9xIDbxolOHJYurcNK/LSYs1r081zOfO9f8NNAHRe/s=";
	private static final String FORMAT = "json";
	private static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmXw0Z6qqaNFn7h5M1AVzCAXds6Xa8gzvrN+V4rRlj/Q8tiqcIcrXRXzFLs3YvpLOjTQC5zwtf/28iO7bYrZhduV9xSFXTX49bk4UUGNa1Z197hcFbhC3qlSJxvkI9JtkgX9Ybm4mqdvQxJ7DU4I65hZLl76VK/GsKYFvOyRz/QOqrVI6XI4l4tEN/yHPJBPJRrPPtGSz5XcDL9fVAOpAzuDqXFZ8oZ1MJq9obJ9zzJnpdwimA/kEdgnmMfXosQGNnhQz7KKnDWRsXUehIpsQTYmTk1bTEXgRWCFSkfGolajJ91H/aoWoaVzv3BydPoy4P8XZ4bNCulJPLj9IAoIbNQIDAQAB";
	private static final String SIGN_TYPE = "RSA2";
	@Autowired
	private OrderMapper orderMapper;
	@RequestMapping(value = "/aliwebpay")
	public ResponseData aliwebpay(HttpSession session, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		logger.info("aliwebpay Handler,Parameter=："
				+ JSON.toJSONString(request.getParameterMap()));
		int orderIdx = 0;
		try {
			orderIdx = Integer.parseInt(request.getParameter("orderIdx"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		Order order= orderMapper.selectByPrimaryKey(orderIdx);
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY, SIGN_TYPE); //获得初始化的AlipayClient
	    AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
	    alipayRequest.setReturnUrl("http://domain.com/CallBack/return_url.jsp");
	    alipayRequest.setNotifyUrl("http://domain.com/CallBack/notify_url.jsp");//在公共参数中设置回跳和通知地址
	    Map<String, String> param = new HashMap<String, String>();
	    param.put("out_trade_no", order.getOrderName());
	    param.put("product_code", "FAST_INSTANT_TRADE_PAY");
	    param.put("total_amount", Double.parseDouble(order.getTotalPrice()+"")/100+"");
	    param.put("subject", order.getOrderContent());
	    param.put("body", "一乎百医，订单支付服务，订单编号：" + order.getOrderName());
	    alipayRequest.setBizContent(JSON.toJSONString(param));//填充业务参数
	    String form="";
	    try {
	        form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
	    } catch (AlipayApiException e) {
	        e.printStackTrace();
	    }
		return new ResponseData(ExceptionMsg.SUCCESS, form);
	}
}
