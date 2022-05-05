package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.vo.QAVOFirst;

public interface QAService {
	List<QAVOFirst> selectQA(long goodsId, int pageNo, int number, String columnName);

	int getLikeQA(int answerId, int userId);

	int insertQALike(Map<String, Object> QALike);

	int insertQA(Map<String, Object> QAInsert);

}
