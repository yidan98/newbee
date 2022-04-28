package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.QAVOFirst;

public interface QAService {
	List<QAVOFirst> selectQA(long goodsId, int pageNo, int number, String columnName);

}
