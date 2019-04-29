package com.repose.mock;

/**
 * @author 常清 2019年04月29日 新建
 * @since 0.0.0-SNAPSHOT
 */
public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean update(long id, String name){

        User user = userDao.queryUserByid(id);
        if(user==null){
            return false;
        }
        user.setName(name);
        userDao.update(user);
        return true;
    }

}
