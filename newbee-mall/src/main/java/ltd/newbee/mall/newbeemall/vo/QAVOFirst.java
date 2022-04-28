package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.List;

public class QAVOFirst implements Serializable {
	private int totalCount;
	private int currentPage;
	private int totalPage;
	private List<QAVO> QASecondVOS;

	public List<QAVO> getQASecondVOS() {
		return QASecondVOS;
	}

	public void setQASecondVOS(List<QAVO> qASecondVOS) {
		QASecondVOS = qASecondVOS;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
}
