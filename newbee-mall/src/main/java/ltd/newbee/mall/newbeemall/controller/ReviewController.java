package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.Review;
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

	@GetMapping("/insertReview")
	@ResponseBody

	public Result review(@RequestBody HashMap<String, Object> reviewMap) {
		System.out.println(reviewMap);
		String goodsId = (String) reviewMap.get("goodsId");
		int userId = (int) reviewMap.get("userId");
		List<Review> review = whetherReviewService.getReview(Long.parseLong(goodsId), userId);
		// 判断可不可以插入数据
		if (review.size() == 0) {
			return ResultGenerator.genFailResult("failed");
		} else {
			return ResultGenerator.genSuccessResult(whetherReviewService.insertReview(reviewMap));
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
