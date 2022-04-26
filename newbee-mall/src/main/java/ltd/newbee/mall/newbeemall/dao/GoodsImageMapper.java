package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsImage;

public interface GoodsImageMapper {
//	List<ArrayList<String>>
	List<GoodsImage> selectImage(long goodsId);
}
