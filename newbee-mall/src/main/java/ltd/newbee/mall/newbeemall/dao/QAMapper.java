package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.QA;

public interface QAMapper {
	List<QA> selectQA(long goodsId, int start, int number, String columnName);

	int totalCount(long goodsId);

	int getLikeQA(int answerId, int userId);

	int insertQALike(Map<String, Object> QALike);

}
