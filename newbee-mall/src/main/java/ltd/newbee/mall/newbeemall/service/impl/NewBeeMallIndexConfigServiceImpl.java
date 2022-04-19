package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.IndexConfigMapper;
import ltd.newbee.mall.newbeemall.entity.IndexConfig;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;

@Service
public class NewBeeMallIndexConfigServiceImpl implements NewBeeMallIndexConfigService {

	@Resource
	private IndexConfigMapper indexConfigMapper;

	@Override
	public List<NewBeeMallGoods> getConfigGoodsesForIndex(int configType, int number) {
		List<IndexConfig> idxConfList = indexConfigMapper.findIndexConfigsByTypeAndNum(configType, number);

		List<Long> s = new ArrayList<Long>();
		for (IndexConfig i : idxConfList) {
			s.add(i.getGoodsId());
		}

		return indexConfigMapper.select(s);
	}

}
//NewBeeMallIndexConfigServiceImpl getConfigGoodsesForIndex里面追加逻辑，调用查询goods_info表的mapper，返回正确的商品list
