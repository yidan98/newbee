package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.ReviewFirstVO;

public interface ReviewService {
	List<ReviewFirstVO> countRating(int goodsId);

}
