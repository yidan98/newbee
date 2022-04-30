package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.WhetherReviewMapper;
import ltd.newbee.mall.newbeemall.entity.Review;
import ltd.newbee.mall.newbeemall.service.WhetherReviewService;

@Service
public class WhetherReviewServiceImpl implements WhetherReviewService {
	@Resource
	WhetherReviewMapper whetherReviewMapper;

	@Override
	public int insertReview(Map<String, Object> review) {

		return whetherReviewMapper.insertReview(review);
	}

	@Override
	public List<Review> getReview(long goodsId, int userId) {

		return whetherReviewMapper.getReview(goodsId, userId);
	}

}
