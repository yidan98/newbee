package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ReviewMapper;
import ltd.newbee.mall.newbeemall.entity.Review;
import ltd.newbee.mall.newbeemall.service.ReviewRatingService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.ReviewRatingSecondVO;
import ltd.newbee.mall.newbeemall.vo.ReviewRatingVO;

@Service
public class ReviewRatingServiceImpl implements ReviewRatingService {
	@Resource
	ReviewMapper reviewRatingMapper;

	@Override
	public ReviewRatingVO getRating(long goodsId) {
		Review getTotalAndAvePoint = reviewRatingMapper.getTotalAndAvePoint(goodsId);
		// 第二层是list所以这里写list
		List<Review> getRatingAndNum = reviewRatingMapper.getRatingAndNum(goodsId);
		// 这里讲entit转化成第二层的vo
		List<ReviewRatingSecondVO> voList = BeanUtil.copyList(getRatingAndNum, ReviewRatingSecondVO.class);
		// 将第一层所需要的数据取出来
		int getContentsNum = reviewRatingMapper.getContentsNum(goodsId);
		float ave = getTotalAndAvePoint.getAverage();
		int total = getTotalAndAvePoint.getTotalNum();

		// 第一层 平均分，评论人数，总评论人数
		// 将第一层的数据放入vo r中

		ReviewRatingVO r = new ReviewRatingVO();
		r.setContentsNum(getContentsNum);
		r.setAverage(ave);
		r.setTotalNum(total);
		// 第二层 将list放入r中
		r.setSecondVO(voList);

		return r;
	}

}
