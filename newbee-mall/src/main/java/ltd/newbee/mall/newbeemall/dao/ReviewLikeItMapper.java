package ltd.newbee.mall.newbeemall.dao;

import java.util.Map;

public interface ReviewLikeItMapper {
	int insertLike(Map<String, Object> reviewLike);

	int getLikeCount(int reviewId, int userId);

}
