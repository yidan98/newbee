package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;

public interface RescentCheckGoodsMapper {
	List<NewBeeMallGoodsDetailVO> userId(@Param("userId") int userId, int number);

	List<NewBeeMallGoods> select(List<Long> goodses);

	List<NewBeeMallGoods> getGoods(int userId, int number);

}
