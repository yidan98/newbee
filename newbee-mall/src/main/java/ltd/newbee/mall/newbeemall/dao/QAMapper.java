package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.QA;

public interface QAMapper {
	List<QA> selectQA(@Param("goodsId") int goodsId, int pageNo, @Param("number") int number);

	List<QA> countTotal(int currentPage);
}
