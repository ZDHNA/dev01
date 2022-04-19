package com.fc.test;

import com.fc.dao.StudentDao;
import com.fc.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class BindTest {
    @Test
    public void testFindByIdAndName() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findByIdAndName(1, "王俊凯");

            System.out.println(student);

            session.commit();
            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindByIdAndAge() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findByIdAndAge(1, 22);

            System.out.println(student);

            session.commit();
            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindByNameAndAge() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findByNameAndAge("耶耶", 15);

            System.out.println(student);

            session.commit();
            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
