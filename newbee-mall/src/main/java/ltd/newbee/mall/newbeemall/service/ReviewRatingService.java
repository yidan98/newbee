package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.ReviewRatingVO;

public interface ReviewRatingService {
	List<ReviewRatingVO> getRating(long goodsId);

}
