package com.zwzhong.dao.imp;

import com.zwzhong.dao.UserDao;
import com.zwzhong.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    //    注入JdbcTemplate模板,自动注入
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int addUser(User user) {
        String sql="insert into user values(?,?,?)";
        int update = jdbcTemplate.update(sql, user.getId(), user.getUsername(), user.getPassword());
        return update;
    }

    @Override
    public int updateUser(User user) {
        String sql="update `user` set `username`= ? where id= ?";
        Integer update = jdbcTemplate.update(sql,user.getUsername(),user.getId());
        return update;
    }

    @Override
    public int deleteUser(int id) {
        String sql="delete from user where id=?";
        int update = jdbcTemplate.update(sql, id);
        return update;
    }

    @Override
    public User queryOneUser(int id) {
        String sql="select * from user where id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),id);
    }

    @Override
    public List<User> queryForUserList() {
        String sql="select * from user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public int[] batchAddUser(List<Object[]> userList) {
        String sql="insert into user values(?,?,?)";
        return jdbcTemplate.batchUpdate(sql, userList);
    }

    @Override
    public int[] batchUpdateUser(List<Object[]> userList) {
//      每个Object[]数组只有两个数据
        String sql="update `user` set `username`= ? where id= ?";
        return jdbcTemplate.batchUpdate(sql,userList);
    }

    @Override
    public int[] batchDeleteUser(List<Object[]> userList) {
//       每个Object数组只有数据:例如Object[]={1}
        String sql="delete from user where id=?";
        return jdbcTemplate.batchUpdate(sql,userList);
    }

}
