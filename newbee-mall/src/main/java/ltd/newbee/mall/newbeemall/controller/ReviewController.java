package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.WhetherReviewService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class ReviewController {
	@Resource
	WhetherReviewService whetherReviewService;

	@GetMapping("/insertReview")
	@ResponseBody

	public Result review(@RequestBody HashMap<String, Object> reviewMap) {
		System.out.println(reviewMap);
		return ResultGenerator.genSuccessResult(whetherReviewService.insertReview(reviewMap));
	}
}
