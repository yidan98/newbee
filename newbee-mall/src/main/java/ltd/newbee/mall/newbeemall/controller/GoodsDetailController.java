package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.service.GoodsInfoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class GoodsDetailController {

	@Resource
	GoodsDetailService goodsDetailService;
	@Resource
	GoodsInfoService goodsInfoService;

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

}