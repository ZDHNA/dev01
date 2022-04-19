package com.fc.dao.impl;

import com.fc.dao.UserDao;
import com.fc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("userDaoMySQLImpl")
public class UserDaoMySQLImpl implements UserDao {
    @Override
    public List<User> findAll() {
        ArrayList<User> list = new ArrayList<>();

        list.add(new User(4, "玛卡巴卡", "123456"));
        list.add(new User(5, "依古比古", "111111"));
        list.add(new User(6, "小点点", "555555"));

        return list;
    }
}
