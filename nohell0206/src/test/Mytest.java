package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.user.dao.UserDao;
import spring.user.dao.UserDaoImpl;
import spring.user.dto.UserDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/config/springContext.xml")
public class Mytest {

	@Autowired
	private UserDaoImpl userDao;
	
	@Test
	public void test() {
		userDao.insert(new UserDto("luffy", "priateKing", "strawHat"));
		//ÇüÁÖ
	}
	
}
