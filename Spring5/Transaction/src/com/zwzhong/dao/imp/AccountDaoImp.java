package com.zwzhong.dao.imp;

import com.zwzhong.dao.AccountDao;
import com.zwzhong.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImp implements AccountDao {
//    注入Jdbc模板
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int addMoney(int id,int amount) {
        String sql="update `account` set money=money+? where id=?";
        return jdbcTemplate.update(sql,amount,id);
    }

    @Override
    public int subMoney(int id,int amount) {
        String sql="update `account` set money=money-? where id=?";
        return jdbcTemplate.update(sql,amount,id);
    }
}
