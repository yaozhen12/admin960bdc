package admin960bdc.dao;

import admin960bdc.entity.UserEntity;

/**
 * 用户
 * 
 * @author Luka
 * 
 * @date 2017-03-23 15:22:06
 */
public interface UserDao extends BaseDao<UserEntity> {

    UserEntity queryByMobile(String mobile);
}
