package com.zwzhong.service;

import com.zwzhong.dao.imp.UserDaoImp;
import com.zwzhong.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDaoImp userDaoImp;
    public int addUser(User user){
        return userDaoImp.addUser(user);
    }
    public int updateUser(User user){
        return userDaoImp.updateUser(user);
    }
    public int deleteUser(int id){
        return userDaoImp.deleteUser(id);
    }
    public User queryOneUser(int id){
        return userDaoImp.queryOneUser(id);
    }
    public List<User> queryForUserList() {
        return userDaoImp.queryForUserList();
    }
}
