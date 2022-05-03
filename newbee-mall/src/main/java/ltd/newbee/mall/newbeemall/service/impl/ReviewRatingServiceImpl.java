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
	public List<ReviewRatingVO> getRating(long goodsId) {
		List<Review> getTotalAndAvePoint = reviewRatingMapper.getTotalAndAvePoint(goodsId);
		List<Review> getRatingAndNum = reviewRatingMapper.getRatingAndNum(goodsId);
		int getContentsNum = reviewRatingMapper.getContentsNum(goodsId);
		// 第一层 平均分，评论人数，总评论人数
		// 将总评论人数加入getTotalAndAvePoint这个List中
		Review r = new Review();
		r.setContentsNum(getContentsNum);
		getTotalAndAvePoint.add(r);
		List<ReviewRatingVO> voList = BeanUtil.copyList(getTotalAndAvePoint, ReviewRatingVO.class);

		// 第二层 评分和评分的人数

		List<ReviewRatingSecondVO> voList2 = BeanUtil.copyList(getRatingAndNum, ReviewRatingSecondVO.class);
		ReviewRatingVO vo = new ReviewRatingVO();
		vo.setSecondVO(voList2);

		return voList;
	}

}
