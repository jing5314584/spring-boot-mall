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
    public enum EnumSmsType {
		RegisterCode, GetbackPasswordCode, DoctorRegisterApplyOk, DoctorQuestionResult, LoginCode
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
    public static String getUserImage() {
   	 String random = "";
   	 int index = (int) (Math.random() * userImage.length);
   	 random = userImage[index];
		return "/Doctor/image/headimage/"+ random+".jpg";
		
	}
}
