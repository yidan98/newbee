package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.QA;

public interface QAMapper {
	List<QA> selectQA(@Param("goodsId") long goodsId, int start, @Param("number") int number, String columnName);

	int totalCount(long goodsId);

}
