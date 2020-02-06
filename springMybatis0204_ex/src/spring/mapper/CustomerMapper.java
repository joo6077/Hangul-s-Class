package spring.mapper;

import org.apache.ibatis.annotations.Param;

import spring.dto.CustomerDto;

public interface CustomerMapper {
	
	public void updateCustomer(@Param("reviewCnt")int reviewCnt, @Param("customerId")int customerId);
}
