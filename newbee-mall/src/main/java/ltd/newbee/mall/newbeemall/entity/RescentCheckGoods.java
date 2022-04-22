package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RescentCheckGoods {
	private Long userId;

	private Long goodsId;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date checkDate;

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", userId=").append(userId);
		sb.append(", checkDate=").append(checkDate);
		sb.append(", goodsId").append(goodsId);

		sb.append("]");
		return sb.toString();
	}

	public Long getGoodsId() {
		// TODO 自動生成されたメソッド・スタブ
		return goodsId;
	}
}
