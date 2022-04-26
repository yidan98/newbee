package ltd.newbee.mall.newbeemall.service;

import java.util.ArrayList;
import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsImage;

public interface GoodsImageService {
	List<ArrayList<GoodsImage>> getGoodsImages(long goodsId);

}
