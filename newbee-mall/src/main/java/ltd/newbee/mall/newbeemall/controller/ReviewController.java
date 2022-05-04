package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.Review;
import ltd.newbee.mall.newbeemall.service.ReviewLikeItService;
import ltd.newbee.mall.newbeemall.service.ReviewRatingService;
import ltd.newbee.mall.newbeemall.service.ReviewService;
import ltd.newbee.mall.newbeemall.service.WhetherReviewService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class ReviewController {
	@Resource
	ReviewService reviewService;
	@Resource
	WhetherReviewService whetherReviewService;
	@Resource
	ReviewRatingService reviewRatingService;
	@Resource
	ReviewLikeItService reviewLikeItService;

	@GetMapping("/insertReview")
	@ResponseBody

	public Result review(@RequestBody HashMap<String, Object> reviewMap) {
		System.out.println(reviewMap);
		String goodsId = (String) reviewMap.get("goodsId");
		int userId = (int) reviewMap.get("userId");
		List<Review> review = whetherReviewService.getReview(Long.parseLong(goodsId), userId);
		// 判断可不可以插入数据
		if (review.size() == 0 && review != null) {
			return ResultGenerator.genFailResult("failed");
		} else {
			return ResultGenerator.genSuccessResult(whetherReviewService.insertReview(reviewMap));
		}
	}

	@GetMapping("/clickLike")
	@ResponseBody
	public Result clickLike(@RequestBody HashMap<String, Object> likeMap) {
		int userId = (int) likeMap.get("userId");
		int reviewId = (int) likeMap.get("reviewId");
		int like = reviewLikeItService.getLikeCount(reviewId, userId);
		if (like != 0) {
			return ResultGenerator.genFailResult("您已经点击过了，不要重复点赞");
		} else {
			return ResultGenerator.genSuccessResult(reviewLikeItService.insertLike(likeMap) + "谢谢点赞");
//			reviewLikeItService.insertLike(likeMap)
		}

	}

	@GetMapping("/review")
	@ResponseBody
	public Result getReview(long goodsId) {
		return ResultGenerator.genSuccessResult(reviewService.countRating(goodsId));

	}

	@GetMapping("/reviewRating")
	@ResponseBody
	public Result getTotalAndAvePoint(long goodsId) {

		return ResultGenerator.genSuccessResult(reviewRatingService.getRating(goodsId));

	}

}
