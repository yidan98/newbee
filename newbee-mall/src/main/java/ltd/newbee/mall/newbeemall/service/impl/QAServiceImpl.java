package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.QAMapper;
import ltd.newbee.mall.newbeemall.entity.QA;
import ltd.newbee.mall.newbeemall.service.QAService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.QAVO;

@Service
public class QAServiceImpl implements QAService {
	@Resource
	QAMapper qaMapper;

	@Override
	public List<QAVO> selectQA(int goodsId, int pageNo, int number) {

		// TODO 自動生成されたメソッド・スタブ

		List<QA> list = qaMapper.selectQA(goodsId, pageNo, 100);
		List<QA> temp = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {

			if (i == (pageNo - 1) * number) {

				for (int j = i; j < number + i; j++) {
					temp.add(list.get(j));

				}

			}

		}

		List<QAVO> voList = BeanUtil.copyList(temp, QAVO.class);

		return voList;
	}

	@Override
	public List<QAVO> countTotal(int currentPage) {
		// TODO 自動生成されたメソッド・スタブ

		return null;
	}

}
