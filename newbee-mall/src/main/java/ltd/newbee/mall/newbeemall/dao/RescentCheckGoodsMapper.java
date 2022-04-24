package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;

public interface RescentCheckGoodsMapper {
	List<NewBeeMallGoods> getGoods(long userId, int number);

//	List<NewBeeMallGoods> select(List<Long> goodses);

//	List<NewBeeMallGoods> getGoods(long userId, int number);

}
