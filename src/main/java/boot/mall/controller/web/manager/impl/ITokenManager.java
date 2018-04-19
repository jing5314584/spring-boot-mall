//package boot.mall.controller.web.manager.impl;
//
//import java.util.UUID;
//import java.util.concurrent.TimeUnit;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Component;
//
//import boot.mall.constants.Common;
//import boot.mall.controller.web.manager.TokenManager;
//import boot.mall.mybatis.model.TokenModel;
//@Component
//public class ITokenManager implements TokenManager {
////	@Autowired
////    private RedisTemplate redisTemplate;
//	@SuppressWarnings("unchecked")
//	public TokenModel createToken(int userId) {
//		// 使用 uuid 作为源 token
//        String token = UUID.randomUUID ().toString ().replace ("-", "");
//        TokenModel model = new TokenModel (userId, token);
////        redisTemplate.boundValueOps (userId+"").set (token, Common.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
//        return model;
//	}
//
//	@SuppressWarnings("unchecked")
//	public boolean checkToken(TokenModel model) {
//		if (model == null) {
//            return false;
//        }
////        String token =  (String) redisTemplate.boundValueOps (model.getUserId ()).get ();
//        if (token == null || !token.equals (model.getToken ())) {
//            return false;
//        }
//        // 如果验证成功，说明此用户进行了一次有效操作，延长 token 的过期时间
//        redisTemplate.boundValueOps (model.getUserId ()+"").expire (Common.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
//        return true;
//	}
//
//	@SuppressWarnings("unchecked")
//	public String getToken(Integer userIdx) {
//		String token =  (String) redisTemplate.boundValueOps (userIdx+"").get ();
//        return token;
//	}
//
//	@SuppressWarnings("unchecked")
//	public void deleteToken(int userId) {
//		// TODO 自动生成的方法存根
//		redisTemplate.delete (userId);
//	}
//
//}
