package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.Review;

public interface WhetherReviewMapper {

	List<Review> getReview(long goodsId, int userId);

	int insertReview(Map<String, Object> review);

	long selectMaxReviewId();

}
