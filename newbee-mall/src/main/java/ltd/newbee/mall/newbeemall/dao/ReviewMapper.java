package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Review;

public interface ReviewMapper {
	List<Review> selectReview();

	int countRating(int goodsId);

}
