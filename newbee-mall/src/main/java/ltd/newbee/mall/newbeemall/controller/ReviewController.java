package ltd.newbee.mall.newbeemall.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.Review;
import ltd.newbee.mall.newbeemall.service.WhetherReviewService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class ReviewController {
	@Resource
	WhetherReviewService whetherReviewService;

	@GetMapping("/insertReview")
	@ResponseBody
	public Result insertReview(long goodsId, int userId) {
		List<Review> list = whetherReviewService.getReview(goodsId, userId);
		for (Review r : list) {

			r.setNickName("Frank");
			list.add(r);
		}
		int count = whetherReviewService.insertReview(list);
		if (count == 0) {
			return ResultGenerator.genFailResult("failed");

		} else {
			return ResultGenerator.genSuccessResult("success");
		}
	}
}
