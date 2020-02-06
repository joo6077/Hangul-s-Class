package spring.dto;

public class ReviewDto {

	private int reviewId;
	private int customer_id;
	private String review;
	
	
	
	
	public ReviewDto(int reviewId, int customer_id, String review) {
		super();
		this.reviewId = reviewId;
		this.customer_id = customer_id;
		this.review = review;
	}




	public ReviewDto() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getReviewId() {
		return reviewId;
	}




	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}




	public int getCustomer_id() {
		return customer_id;
	}




	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}




	public String getReview() {
		return review;
	}




	public void setReview(String review) {
		this.review = review;
	}




	@Override
	public String toString() {
		return "ReviewDto [reviewId=" + reviewId + ", customer_id=" + customer_id + ", review=" + review + "]";
	}
	
	
}
