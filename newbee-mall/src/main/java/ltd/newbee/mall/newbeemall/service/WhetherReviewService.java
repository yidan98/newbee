package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.Review;

public interface WhetherReviewService {
	int insertReview(Map<String, Object> review);

	List<Review> getReview(long goodsId, int userId);
}
