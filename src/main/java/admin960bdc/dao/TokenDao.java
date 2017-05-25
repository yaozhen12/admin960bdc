package admin960bdc.dao;

import admin960bdc.entity.TokenEntity;

/**
 * 用户Token
 * 
 * @author Luka
 * 
 * @date 2017-03-23 15:22:07
 */
public interface TokenDao extends BaseDao<TokenEntity> {
    
    TokenEntity queryByUserId(Long userId);

    TokenEntity queryByToken(String token);
	
}
