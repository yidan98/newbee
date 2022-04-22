package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.RescentCheckGoodsMapper;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.RescentCheckService;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;

@Service
public class RescentCheckServiceImpl implements RescentCheckService {

	@Resource
	RescentCheckGoodsMapper rescentCheckGoodsMapper;

	@Override
	public List<NewBeeMallGoodsDetailVO> getGoods(int userId, int number) {
		// TODO 自動生成されたメソッド・スタブ

		List<NewBeeMallGoodsDetailVO> voList = new ArrayList<NewBeeMallGoodsDetailVO>();
		List<NewBeeMallGoods> entityList = rescentCheckGoodsMapper.getGoods(1, number);

		if (entityList != null) {

			for (NewBeeMallGoods entity : entityList) {
				NewBeeMallGoodsDetailVO vo = new NewBeeMallGoodsDetailVO();
				vo.setGoodsId(entity.getGoodsId());
				vo.setGoodsName(entity.getGoodsName());
				vo.setOriginalPrice(entity.getOriginalPrice());

				voList.add(vo);
			}
		}
		return voList;
	}

}
