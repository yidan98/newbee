package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.MallUser;
import ltd.newbee.mall.newbeemall.service.CheckUserExistsService;
import ltd.newbee.mall.newbeemall.service.RescentCheckService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class RescentController {
	@Resource
	private CheckUserExistsService checkUserExistsService;
	@Resource
	private RescentCheckService rescentCheckService;

	@GetMapping("/user")
	@ResponseBody
	public Result user(long userId) {
		// MallUser user = checkUserExistsService.checkUserExists(userId);
//		int count = checkUserExistsService.checkUserExistsReturnCount(userId);
//		if (count == 0) {
//			return ResultGenerator.genFailResult("failed");
//		} else {
//			return ResultGenerator.genSuccessResult("success");
//			// List<vo> = xxxService.xxxMethod();
//			// return List
//		}

		MallUser user = checkUserExistsService.checkUserExists(userId);
		if (user == null) {
			return ResultGenerator.genFailResult("failed");

		}
		return ResultGenerator.genSuccessResult(rescentCheckService.getGoods(1, 2));

	}

}
