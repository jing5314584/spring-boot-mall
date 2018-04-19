package boot.mall.mybatis.model;

public class TokenModel {
	private int userId;
	private String token;
	public TokenModel(int userId, String token) {
		// TODO 自动生成的构造函数存根
		this.userId = userId;
		this.token = token;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
