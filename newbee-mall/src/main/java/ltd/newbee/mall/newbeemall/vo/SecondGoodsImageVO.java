package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;

public class SecondGoodsImageVO implements Serializable {
	private Long goodsId;
	private String image;
	private Integer goodsRank;

	public Long getGoodId() {
		return goodsId;
	}

	public void setGoodId(Long goodId) {
		this.goodsId = goodId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getGoodsRank() {
		return goodsRank;
	}

	public void setGoodsRank(Integer goodsRank) {
		this.goodsRank = goodsRank;
	}

}
