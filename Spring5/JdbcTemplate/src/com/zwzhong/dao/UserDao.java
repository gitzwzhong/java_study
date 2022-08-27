package com.zwzhong.dao;

import com.zwzhong.entity.User;

import java.util.List;

public interface UserDao {
//    添加
    public int addUser(User user);
//    修改
    public int updateUser(User user);
//    删除
    public int deleteUser(int id);
//    查询单个对象
    public User queryOneUser(int id);
//   查询返回集合
    public List<User> queryForUserList();
//    批量添加
    public int[] batchAddUser(List<Object[]> userList);
//    批量修改
    public int[] batchUpdateUser(List<Object[]> userList);
//    批量删除
    public int[] batchDeleteUser(List<Object[]> userList);
}
