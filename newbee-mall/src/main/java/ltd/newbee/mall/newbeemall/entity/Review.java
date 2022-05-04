package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;

public class Review {

	private int rating;
	private String nickName;
	private String title;
	private String contents;
	private Date reviewDate;
	private int reviewId;
	private int count;
	private int orderId;
	private String photo1;
	private String photo2;
	private String photo3;
	private String photo4;
	private String photo5;
	private int totalNum;
	private float average;
	private int contentsNum;
	private int numOfRating;

	private String goodsName;
	private Long goodsId;
	private int countRating;

	private int ratingFive;
	private int ratingFour;
	private int ratingThree;
	private int ratingTwo;
	private int ratingOne;

	public int getRatingFive() {
		return ratingFive;
	}

	public void setRatingFive(int ratingFive) {
		this.ratingFive = ratingFive;
	}

	public int getRatingFour() {
		return ratingFour;
	}

	public void setRatingFour(int ratingFour) {
		this.ratingFour = ratingFour;
	}

	public int getRatingThree() {
		return ratingThree;
	}

	public void setRatingThree(int ratingThree) {
		this.ratingThree = ratingThree;
	}

	public int getRatingTwo() {
		return ratingTwo;
	}

	public void setRatingTwo(int ratingTwo) {
		this.ratingTwo = ratingTwo;
	}

	public int getRatingOne() {
		return ratingOne;
	}

	public void setRatingOne(int ratingOne) {
		this.ratingOne = ratingOne;
	}

	public String getContents() {
		return contents;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public int getContentsNum() {
		return contentsNum;
	}

	public void setContentsNum(int contentsNum) {
		this.contentsNum = contentsNum;
	}

	public int getNumOfRating() {
		return numOfRating;
	}

	public void setNumOfRating(int numOfRating) {
		this.numOfRating = numOfRating;
	}

	public String getPhoto1() {
		return photo1;
	}

	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}

	public String getPhoto2() {
		return photo2;
	}

	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}

	public String getPhoto3() {
		return photo3;
	}

	public void setPhoto3(String photo3) {
		this.photo3 = photo3;
	}

	public String getPhoto4() {
		return photo4;
	}

	public void setPhoto4(String photo4) {
		this.photo4 = photo4;
	}

	public String getPhoto5() {
		return photo5;
	}

	public void setPhoto5(String photo5) {
		this.photo5 = photo5;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCountRating() {
		return countRating;
	}

	public void setCountRating(int countRating) {
		this.countRating = countRating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

}
