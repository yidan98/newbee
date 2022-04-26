package ltd.newbee.mall.newbeemall;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mall.newbeemall.service.GoodsImageService;

@SpringBootTest
class GoodsImageTests {
	@Resource
	GoodsImageService goodsImageService;

	@Test
	void testGoodsImage() {
		goodsImageService.getGoodsImages(10003);
	}

}
