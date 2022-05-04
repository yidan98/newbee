package ltd.newbee.mall.newbeemall.service.impl;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ReviewLikeItMapper;
import ltd.newbee.mall.newbeemall.service.ReviewLikeItService;

@Service
public class ReviewLikeItServiceImpl implements ReviewLikeItService {
	@Resource
	ReviewLikeItMapper reviewLikeItMapper;

	@Override
	public int insertLike(Map<String, Object> reviewLike) {
		reviewLike.replace("likeDate", new Date());

		return reviewLikeItMapper.insertLike(reviewLike);
	}

	@Override
	public int getLikeCount(int reviewId, int userId) {

		return reviewLikeItMapper.getLikeCount(reviewId, userId);

	}

}
