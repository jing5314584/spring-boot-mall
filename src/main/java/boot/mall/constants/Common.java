package boot.mall.constants;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSON;

public class Common {
	/**
     * token有效期（小时）
     */
    public static final int TOKEN_EXPIRES_HOUR = 2;
    private static char[] caList = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    public static final String[] userImage = {"001", "002", "003", "004","005","006","007","008","009","010"};
    public final static int SMS_MAX_COUNT = 5;
    
    
    /** 商品TYPE */
	public final static int GOODS_SERVICE = 17;
    public enum EnumSmsType {
		RegisterCode, GetbackPasswordCode, DoctorRegisterApplyOk, DoctorQuestionResult, LoginCode
	}
    public static Map<Integer, String> department=new HashMap<Integer, String>();
    
    
    public static String getDepartmentByKey(int idx){
    	department.put(1, "呼吸科");
    	department.put(2, "消化科");
    	department.put(3, "肾内科");
    	department.put(4, "血液科");
    	department.put(5, "内分泌科");
    	department.put(6, "肿瘤科");
    	department.put(7, "普外科");
    	department.put(8, "神经外科");
    	department.put(9, "胸外科");
    	department.put(10, "泌尿外科");
    	department.put(14, "骨科");
    	department.put(15, "妇科");
    	department.put(16, "眼耳鼻喉科");
    	department.put(17, "口腔科");
    	department.put(18, "皮肤科");
    	department.put(19, "中医科");
    	department.put(20, "移植科");
    	department.put(21, "放射科");
    	department.put(22, "老年科");
    	department.put(23, "介入科");
    	department.put(24, "淋巴内科");
    	department.put(25, "病理科");
    	department.put(26, "心内科");
    	department.put(27, "血管外科");
    	department.put(28, "儿科");
    	department.put(100, "全科");
		return department.get(idx);
    	
    }
    public static Map<String, String> GetResponsePost(Object obj,
			String errorString, int result_code) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("res", obj);
		map.put("error_string", errorString);
		map.put("result_code", result_code);

		Map<String, String> post = new HashMap<String, String>();
		post.put("message", JSON.toJSONString(map));
		return post;
	}
    public static boolean isPhoneNum(String phoneNum) {
		if (phoneNum != null && phoneNum.length() == 11) {
			Pattern p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$");
			Matcher m = p.matcher(phoneNum);
			return m.matches();
		}

		return false;
	}
    public static boolean isSameDay(Date date1, Date date2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr1 = sdf.format(date1);
		String dateStr2 = sdf.format(date2);
		return dateStr1.equals(dateStr2);
	}
    public synchronized static String getRandomNickName(String phone) {
		Random r = new Random();
		// 接着你的程序往下写，就是在里面随机抽取4个
		String pass = "用户*";
		if(phone != null && phone.length()>=11){
			pass += phone.substring(7, 11);
		}else{
			for (int i = 0; i < 4; i++) {
				final int rnd = r.nextInt();
				// 使随机数长度总是在 0 ～ 列表长度 区间内
				final int index = (rnd < 0 ? -rnd : rnd) % caList.length;
				pass += caList[index];
			}
		}
		
		return pass;
	}
    /**
	 * 生成订单编号
	 * 
	 * @return
	 */
	public static synchronized String getOrderNo() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String formatStr =formatter.format(new Date());
		return "YH"+formatStr;
	}
    public static String getUserImage() {
   	 String random = "";
   	 int index = (int) (Math.random() * userImage.length);
   	 random = userImage[index];
		return "/Doctor/image/headimage/"+ random+".jpg";
		
	}
    public enum EnumOrderState {
		WaitPay(1), PaySuccess(2), CancelOrder(3), ExceptionOrder(4), DisabledOrder(
				5), RefundOrder(6), RefundFinish(7), RejectRefund(8), WaitShipments(
				9), WaitReceipt(10), Finish(11), Delete(12);

		EnumOrderState(int state) {
			this.state = state;
		}

		private final int state;

		public int getState() {
			return this.state;
		}
	}

	public static String getOrderStateString(EnumOrderState state) {
		switch (state) {
		case WaitPay:
			return "等待支付";
		case PaySuccess:
			return "支付成功";
		case CancelOrder:
			return "订单取消";
		case ExceptionOrder:
			return "异常订单";
		case DisabledOrder:
			return "订单失效 ";
		case RefundOrder:
			return "申请退款 ";
		case RefundFinish:
			return "退款完成";
		case RejectRefund:
			return "拒绝退款";
		case WaitShipments:
			return "等待发货";
		case WaitReceipt:
			return "等待收货";
		case Finish:
			return "已完成";
		case Delete:
			return "已删除";
		default:
			return "";
		}
	}

	public static String getOrderStateString(int state) {
		switch (state) {
		case 1:
			return "等待支付";
		case 2:
			return "支付成功";
		case 3:
			return "订单取消";
		case 4:
			return "异常订单";
		case 5:
			return "订单失效 ";
		case 6:
			return "申请退款 ";
		case 7:
			return "退款完成";
		case 8:
			return "拒绝退款";
		case 9:
			return "等待发货";
		case 10:
			return "等待收货";
		case 11:
			return "已完成";
		case 12:
			return "已删除";
		default:
			return "";
		}
	}
}
