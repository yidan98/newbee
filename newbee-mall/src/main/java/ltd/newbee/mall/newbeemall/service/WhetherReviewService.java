package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Review;

public interface WhetherReviewService {
	int insertReview(List<Review> list);

	List<Review> getReview(long goodsId, int userId);
}
