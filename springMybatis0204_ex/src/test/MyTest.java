package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.dto.CustomerDto;
import spring.dto.ReviewDto;
import spring.mapper.CustomerMapper;
import spring.mapper.ReviewMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/springContext.xml")
public class MyTest {

	@Autowired
	ReviewMapper reviewMapper;
	
	@Autowired
	CustomerMapper customerMapper;
	
	@Test
	public void test() {
		ReviewDto reviewDto = new ReviewDto(0, 3, "≥°¿Ã¥Ÿ");
		
		reviewMapper.insertReview(reviewDto);
		
		
		int rs = reviewMapper.selectByCustomerCount(reviewDto.getCustomer_id());
		System.out.println(rs);
		
		customerMapper.updateCustomer(rs, reviewDto.getCustomer_id());
		
		
		
	}

}
