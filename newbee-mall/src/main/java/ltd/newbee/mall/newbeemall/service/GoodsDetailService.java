package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.GoodsDetailVO;

public interface GoodsDetailService {
	List<GoodsDetailVO> selectDetail(long goodsId);

}
