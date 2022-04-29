package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ReviewMapper;
import ltd.newbee.mall.newbeemall.entity.Review;
import ltd.newbee.mall.newbeemall.service.ReviewService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.ReviewVO;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Resource
	ReviewMapper reviewMapper;

	@Override
	public List<ReviewVO> countRating(Long goodsId) {
		List<Review> list = reviewMapper.selectReview(goodsId);
		List<ReviewVO> voList = BeanUtil.copyList(list, ReviewVO.class);
		return voList;
	}

}
