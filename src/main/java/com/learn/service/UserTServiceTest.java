package com.learn.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.model.UserT;

public class UserTServiceTest {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserTService uService = (UserTService) application.getBean("userTService");
        UserT user = uService.selectByPrimaryKey(1);
        System.out.println(user.getUserName());
    }
	
}
