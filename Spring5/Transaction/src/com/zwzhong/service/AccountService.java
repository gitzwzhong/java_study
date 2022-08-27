package com.zwzhong.service;

import com.zwzhong.dao.imp.AccountDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//开启事务注解
@Transactional
@Service
public class AccountService {
    @Autowired
    AccountDaoImp accountDaoImp;
    //模拟转账
    public void AccountMoney(){
        //张三给李四转账，张三减少100元钱，则李四增加100元钱
        accountDaoImp.subMoney(1,100);
        int a=10/0;
        accountDaoImp.addMoney(2,100);
    }
}
