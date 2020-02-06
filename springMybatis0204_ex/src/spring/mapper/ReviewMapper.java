package spring.mapper;

import spring.dto.ReviewDto;

public interface ReviewMapper {

	public void insertReview(ReviewDto reviewDto);
	
	public int selectByCustomerCount(int customerId);
}
