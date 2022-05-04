package ltd.newbee.mall.newbeemall.service;

import java.util.Map;

public interface ReviewLikeItService {
	int insertLike(Map<String, Object> reviewLike);

	int getLikeCount(int reviewId, int userId);

}
