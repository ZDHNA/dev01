package com.fc.test;

import com.fc.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = applicationContext.getBean("student",Student.class);
//        applicationContext.close();
        student.setId(1);
        student.setName("咩咩");
        student.setAge((byte) 22);
        System.out.println(student);

//        applicationContext.close();
    }
}
