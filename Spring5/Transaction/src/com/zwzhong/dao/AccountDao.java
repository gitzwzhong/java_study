package com.zwzhong.dao;

import com.zwzhong.entity.Account;

public interface AccountDao {
//    添加金额
    int addMoney(int id,int amount);
//    减少金额
    int subMoney(int id,int amount);
}
