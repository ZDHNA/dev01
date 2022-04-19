package com.fc.dao.impl;

import com.fc.dao.UserDao;
import com.fc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findAll() {
        ArrayList<User> list = new ArrayList<>();

        list.add(new User(1, "耶耶", "123456"));
        list.add(new User(2, "桃枝", "111111"));
        list.add(new User(3, "知知", "456789"));

        return list;
    }
}
