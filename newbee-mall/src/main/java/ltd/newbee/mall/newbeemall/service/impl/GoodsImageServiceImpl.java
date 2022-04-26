package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.GoodsImageMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsImage;
import ltd.newbee.mall.newbeemall.service.GoodsImageService;

@Service
public class GoodsImageServiceImpl implements GoodsImageService {
	@Resource
	GoodsImageMapper goodsImageMapper;

	@Override
	public List<ArrayList<GoodsImage>> getGoodsImages(long goodsId) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<GoodsImage> tempList = new ArrayList<GoodsImage>();
		List<GoodsImage> list = goodsImageMapper.selectImage(goodsId);
		List<ArrayList<GoodsImage>> rsList = new ArrayList<ArrayList<GoodsImage>>();
		for (int i = 0; i < list.size(); i++) {

			tempList.add(list.get(i));
			if ((i + 1) % 8 == 0) {
				rsList.add(tempList);
				tempList = new ArrayList<GoodsImage>();
			}
			if (i == (list.size() - 1) && (i + 1) % 8 != 0) {
				rsList.add(tempList);
			}

		}

		return rsList;
	}
}
