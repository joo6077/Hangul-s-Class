package spring.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomerDto {
	
	private int customerId;
	private String userId;
	private String name;
	private LocalDate birth;
	private LocalDateTime regDate;
	private int reviewCnt;
	
	
	
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CustomerDto(int customerId, String userId, String name, LocalDate birth, LocalDateTime regDate,
			int reviewCnt) {
		super();
		this.customerId = customerId;
		this.userId = userId;
		this.name = name;
		this.birth = birth;
		this.regDate = regDate;
		this.reviewCnt = reviewCnt;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getBirth() {
		return birth;
	}


	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}


	public LocalDateTime getRegDate() {
		return regDate;
	}


	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}


	public int getReviewCnt() {
		return reviewCnt;
	}


	public void setReviewCnt(int reviewCnt) {
		this.reviewCnt = reviewCnt;
	}


	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", userId=" + userId + ", name=" + name + ", birth=" + birth
				+ ", regDate=" + regDate + ", reviewCnt=" + reviewCnt + "]";
	}
	
	
}
