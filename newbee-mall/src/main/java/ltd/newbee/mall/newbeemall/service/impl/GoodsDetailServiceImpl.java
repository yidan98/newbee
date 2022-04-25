package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsDetailMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsDetail;
import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.vo.GoodsDetailVO;

@Service
public class GoodsDetailServiceImpl implements GoodsDetailService {

	@Resource
	GoodsDetailMapper goodsDetailMapper;

	@Override
	public List<GoodsDetailVO> selectDetail(long goodsId) {

		// TODO 自動生成されたメソッド・スタブ
		List<GoodsDetailVO> voList = new ArrayList<>();
		List<GoodsDetail> list = goodsDetailMapper.selectDetail(goodsId);
		for (GoodsDetail s : list) {
			GoodsDetailVO vo = new GoodsDetailVO();
			vo.setColor(s.getColor());
			vo.setGoodsId(s.getGoodsId());

			vo.setSize(s.getSize1() + s.getSize1Name() + s.getSizeUnit() + "*" + s.getSize2() + s.getSize2Name()
					+ s.getSizeUnit() + "*" + s.getSize3() + s.getWrapSize3Name() + s.getSizeUnit());
			vo.setWarranty(s.getWarranty());
			vo.setWrap(s.getWrapSize1() + s.getWrapSize1Name() + s.getWrapSizeUnit() + "*" + s.getWrapSize2()
					+ s.getWrapSize2Name() + s.getWrapSizeUnit() + "*" + s.getWrapSize3() + s.getWrapSize3Name()
					+ s.getWrapSizeUnit());

			vo.setYear(s.getWarranty() + s.getWarrantyUnit());
			voList.add(vo);

		}
		return voList;
	}

}
