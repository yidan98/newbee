package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RunRecommendApiHistory {
	private long goodsId;
	private long categoryId;
	private long userId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}

	public Date getRunDate() {
		return runDate;
	}

	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date runDate;

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		// TODO 自動生成されたメソッド・スタブ
		this.categoryId = categoryId;
	}

}