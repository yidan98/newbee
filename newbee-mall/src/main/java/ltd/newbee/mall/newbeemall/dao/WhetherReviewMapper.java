package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Review;

public interface WhetherReviewMapper {
	int insertReview(List<Review> list);

	List<Review> getReview(long goodsId, int userId);

}
