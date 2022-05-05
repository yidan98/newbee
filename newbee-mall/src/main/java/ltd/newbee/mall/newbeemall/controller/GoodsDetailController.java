package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.service.GoodsInfoService;
import ltd.newbee.mall.newbeemall.service.QAService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class GoodsDetailController {

	@Resource
	GoodsDetailService goodsDetailService;
	@Resource
	GoodsInfoService goodsInfoService;
	@Resource
	QAService qaService;

	@GetMapping("/goodsDetail")
	@ResponseBody

	public Result getGoodsDetail(long goodsId) {
		return ResultGenerator.genSuccessResult(goodsDetailService.selectDetail(goodsId));
	}

	@PostMapping("/goodsInfo")
	@ResponseBody
	public Result getGoodsInfo() {
		return ResultGenerator.genSuccessResult(goodsInfoService.selectInfo());
	}

	@GetMapping("/questionAndAnswer")
	@ResponseBody
	public Result getQA(int goodsId, int pageNo, int number, String columnName) {
		return ResultGenerator.genSuccessResult(qaService.selectQA(goodsId, pageNo, number, columnName));

	}

	@GetMapping("/qaLikeClick")
	@ResponseBody
	public Result qaLike(@RequestBody HashMap<String, Object> likeMap) {
		int answerId = (int) likeMap.get("answerId");
		int userId = (int) likeMap.get("userId");
		int like = qaService.getLikeQA(answerId, userId);
		if (like != 0) {
			return ResultGenerator.genFailResult("您已经点击过了，不要重复点赞");
		} else {
			int r = qaService.insertQALike(likeMap);
			if (r == 1) {
				return ResultGenerator.genSuccessResult("谢谢评价");
			} else {
				return ResultGenerator.genSuccessResult("点赞失败");
			}

		}

	}
}
