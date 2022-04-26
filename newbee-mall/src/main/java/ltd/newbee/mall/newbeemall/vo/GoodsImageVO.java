package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.List;

public class GoodsImageVO implements Serializable {
	private Long goodsId;
//	 List<ArrayList<String>>
	private String image;
	private Integer goodsRank;
	private List<SecondGoodsImageVO> secondGoodsImageVOS;

	public List<SecondGoodsImageVO> getSecondGoodsImageVOS() {
		return secondGoodsImageVOS;
	}

	public void setSecondGoodsImageVOS(List<SecondGoodsImageVO> secondGoodsImageVOS) {
		this.secondGoodsImageVOS = secondGoodsImageVOS;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
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