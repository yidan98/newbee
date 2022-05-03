package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.List;

public class ReviewRatingVO implements Serializable {
	// 第一层
	private int totalNum;
	private float average;
	private int contentsNum;
	private List<ReviewRatingSecondVO> secondVO;

	public List<ReviewRatingSecondVO> getSecondVO() {
		return secondVO;
	}

	public void setSecondVO(List<ReviewRatingSecondVO> secondVO) {
		this.secondVO = secondVO;
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

}
