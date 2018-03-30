package boot.mall.controller.web.manager;

import boot.mall.mybatis.model.TokenModel;

public interface TokenManager {
	/**
     * 创建一个 token 关联上指定用户
     * @param userId 指定用户的 id
     * @return 生成的 token
     */
    public TokenModel createToken (int userId);

    /**
     * 检查 token 是否有效
     * @param model token
     * @return 是否有效
     */
    public boolean checkToken (TokenModel model);

    /**
     * 从字符串中解析 token
     * @param authentication 加密后的字符串
     * @return
     */
    public String getToken (Integer userIdx);

    /**
     * 清除 token
     * @param userId 登录用户的 id
     */
    public void deleteToken (int userId);
}
