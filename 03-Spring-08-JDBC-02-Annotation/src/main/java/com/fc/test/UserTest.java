package com.fc.test;

import com.fc.config.ApplicationContextConfig;
import com.fc.dao.UserDao;
import com.fc.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class UserTest {
    @Test
    public void testDelete() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

        UserDao userDao = applicationContext.getBean(UserDao.class);

        int affectedRows = userDao.delete(2);

        System.out.println(affectedRows);
    }

    @Test
    public void testUpdate() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

        UserDao userDao = applicationContext.getBean(UserDao.class);

        int affectedRows = userDao.update(new User(2, null, "888"));

        System.out.println(affectedRows);
    }

    @Test
    public void testInsert() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

        UserDao userDao = applicationContext.getBean(UserDao.class);

        int affectedRows = userDao.insert(new User(null, "耶耶", "1111"));

        System.out.println(affectedRows);
    }

    @Test
    public void testFindCount() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

        UserDao userDao = applicationContext.getBean(UserDao.class);

        int count = userDao.findCount();

        System.out.println(count);
    }

    @Test
    public void testFindByID() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

        UserDao userDao = applicationContext.getBean(UserDao.class);

        User user = userDao.findById(1);

        System.out.println(user);
    }

    @Test
    public void testFindAll() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

        UserDao userDao = applicationContext.getBean(UserDao.class);

        List<User> users = userDao.findAll();

        System.out.println(users);
    }
}
