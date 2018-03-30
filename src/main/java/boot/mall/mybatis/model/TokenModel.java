package boot.mall.mybatis.model;

public class TokenModel{
	 // 用户 id
    private int userId;

    // 随机生成的 uuid
    private String token;

    public TokenModel (int userId, String token) {
        this.userId = userId;
        this.token = token;
    }

    public int getUserId () {
        return userId;
    }

    public void setUserId (int userId) {
        this.userId = userId;
    }

    public String getToken () {
        return token;
    }

    public void setToken (String token) {
        this.token = token;
    }
}
