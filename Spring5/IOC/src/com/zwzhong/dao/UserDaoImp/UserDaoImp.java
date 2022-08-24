package com.zwzhong.dao.UserDaoImp;

import com.zwzhong.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp implements UserDao {
    @Override
    public void userDao() {
        System.out.println("dao层");
    }
}
