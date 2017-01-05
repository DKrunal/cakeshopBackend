package com.cakeshop;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cakeshop.dao.UserDAO;
import com.cakeshop.model.User;

public class UserDAOTestCase {

@Autowired
static UserDAO userDAO;

@Autowired
static User user;

@Autowired
static AnnotationConfigApplicationContext config;

@BeforeClass
public static void init(){
	config = new  AnnotationConfigApplicationContext();
	config.scan("com.cakeshop");
	config.refresh();

	user = (User) config.getBean("user");
	userDAO = (UserDAO) config.getBean("userDAOImpl");
}

@Test
public void saveTestCase()
{
	user.setId("kd");
	user.setPassword("12345");
	user.setFname("Krunal");
	user.setLname("Desai");
	user.setNumber("989898989");
	user.setAdd("Nsp");
	user.setRole("ROLE_ADMIN");
 Assert.assertEquals("saveTestCase", true, 	userDAO.save(user));
	
}


}
