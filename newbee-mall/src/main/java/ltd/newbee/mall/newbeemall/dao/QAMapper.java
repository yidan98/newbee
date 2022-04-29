package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.QA;

public interface QAMapper {
	List<QA> selectQA(long goodsId, int start, int number, String columnName);

	int totalCount(long goodsId);

}
