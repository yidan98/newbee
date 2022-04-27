package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.QAVO;

public interface QAService {
	List<QAVO> selectQA(int goodsId, int pageNo, int number);

	List<QAVO> countTotal(int currentPage);
}
