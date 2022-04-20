package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.IndexConfigMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.entity.IndexConfig;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCategoryVO;

@Service
public class NewBeeMallIndexConfigServiceImpl implements NewBeeMallIndexConfigService {

	@Resource
	private IndexConfigMapper indexConfigMapper;

	@Override
	public List<NewBeeMallGoodsDetailVO> getConfigGoodsesForIndex(int configType, int number) {
		List<IndexConfig> idxConfList = indexConfigMapper.findIndexConfigsByTypeAndNum(configType, number);

		List<Long> s = new ArrayList<Long>();
		for (IndexConfig i : idxConfList) {
			s.add(i.getGoodsId());
		}

		List<NewBeeMallGoods> entityList = indexConfigMapper.select(s);
		List<NewBeeMallGoodsDetailVO> voList = new ArrayList<NewBeeMallGoodsDetailVO>();
		for (NewBeeMallGoods entity : entityList) {
			NewBeeMallGoodsDetailVO vo = new NewBeeMallGoodsDetailVO();
			vo.setGoodsId(entity.getGoodsId());
			vo.setGoodsName(entity.getGoodsName());
			vo.setGoodsIntro(entity.getGoodsIntro());
			vo.setGoodsCoverImg(entity.getGoodsCoverImg());

			vo.setSellingPrice(entity.getSellingPrice());
			vo.setOriginalPrice(entity.getOriginalPrice());
			vo.setGoodsDetailContent(entity.getGoodsDetailContent());
			String a = vo.getGoodsName();
			if (a.length() > 30) {
				vo.setGoodsName(a.substring(0, 30) + "…");

			}

			voList.add(vo);

		}

		return voList;

	}

	@Override
	public List<GoodsCategory> getCate() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<NewBeeMallIndexCategoryVO> getCategoriesForIndex() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
