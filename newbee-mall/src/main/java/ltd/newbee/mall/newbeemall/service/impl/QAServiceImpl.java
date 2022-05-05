package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.QAMapper;
import ltd.newbee.mall.newbeemall.entity.QA;
import ltd.newbee.mall.newbeemall.service.QAService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.QAVO;
import ltd.newbee.mall.newbeemall.vo.QAVOFirst;

@Service
public class QAServiceImpl implements QAService {
	@Resource
	QAMapper qaMapper;
//	List<QA> list = qaMapper.selectQA(goodsId, pageNo, 100);
//	List<QA> temp = new ArrayList<>();
//
//	for (int i = 0; i < list.size(); i++) {
//
//		if (i == (pageNo - 1) * number) {
//
//			for (int j = i; j < number + i; j++) {
//				temp.add(list.get(j));
//
//			}
//
//		}
//
//	}

//	List<QAVO> voList = BeanUtil.copyList(temp, QAVO.class);

	@Override
	public List<QAVOFirst> selectQA(long goodsId, int pageNo, int number, String columnName) {

		List<QA> list = qaMapper.selectQA(goodsId, (pageNo - 1) * number, number, columnName);

		int currentPage = pageNo;
		int totalCount = qaMapper.totalCount(goodsId);
		int totalPage = 0;
		if (totalCount % number == 0) {
			totalPage = (totalCount / number);
		} else {
			totalPage = (totalCount / number) + 1;
		}
		List<QAVOFirst> voList = new ArrayList<QAVOFirst>();
		QAVOFirst vo = new QAVOFirst();
		vo.setTotalCount(totalCount);
		vo.setCurrentPage(currentPage);
		vo.setTotalPage(totalPage);
		List<QAVO> voList2 = BeanUtil.copyList(list, QAVO.class);
		vo.setQASecondVOS(voList2);
		voList.add(vo);

		return voList;
	}

	@Override
	public int getLikeQA(int answerId, int userId) {

		return qaMapper.getLikeQA(answerId, userId);
	}

	@Override
	public int insertQALike(Map<String, Object> QALike) {
		QALike.replace("likeDate", new Date());
		return qaMapper.insertQALike(QALike);
	}

	@Override
	public int insertQA(Map<String, Object> QAInsert) {
		QAInsert.replace("date", new Date());
		return qaMapper.insertQA(QAInsert);
	}
}