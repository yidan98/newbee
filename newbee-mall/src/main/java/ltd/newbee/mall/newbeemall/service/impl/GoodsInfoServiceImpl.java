package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsInfoMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsInfo;
import ltd.newbee.mall.newbeemall.service.GoodsInfoService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.GoodsInfoVO;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
	@Resource
	GoodsInfoMapper goodsInfoMapper;

	@Override
	public List<GoodsInfoVO> selectInfo() {
		// TODO 自動生成されたメソッド・スタブ
//		List<GoodsInfoVO> voList = new ArrayList<>();
		List<GoodsInfo> list = goodsInfoMapper.selectInfo();
//		for (GoodsInfo s : list) {
//			GoodsInfoVO vo = new GoodsInfoVO();
//
//			BeanUtil.copyProperties(s, vo);
//
//			voList.add(vo);
//
//		}
		// copy list
		List<GoodsInfoVO> voList = BeanUtil.copyList(list, GoodsInfoVO.class);
		return voList;

	}
}