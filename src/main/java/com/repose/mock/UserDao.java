package com.repose.mock;

/**
 * @author 常清 2019年04月29日 新建
 * @since 0.0.0-SNAPSHOT
 */
public interface UserDao {

    User queryUserByid(long id);

    int update(User user);
}
