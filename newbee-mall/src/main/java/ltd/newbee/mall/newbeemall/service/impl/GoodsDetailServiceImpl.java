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
			String size = "";
			String wrap = "";
			if (s.getSize1() != 0) {
				size = s.getSize1Name() + s.getSize1();
			}
			if (s.getSize2() != 0) {
				size = size + "*" + s.getSize2Name() + s.getSize2();

			}
			if (s.getSize3() != 0) {
				size = size + "*" + s.getSize3Name() + s.getSize3() + s.getSizeUnit();
			}
			vo.setSize(size);
			if (s.getWrapSize1() != 0) {
				wrap = s.getWrapSize1Name() + s.getWrapSize1();
			}
			if (s.getWrapSize2() != 0) {
				wrap = wrap + "*" + s.getWrapSize2Name() + s.getWrapSize2();
			}
			if (s.getWrapSize3() != 0) {
				wrap = wrap + "*" + s.getWrapSize3Name() + s.getWrapSize3() + s.getWrapSizeUnit();
			}
			vo.setWrap(wrap);

			vo.setYear(s.getWarranty() + s.getWarrantyUnit());
			voList.add(vo);

		}
		return voList;
	}

}
