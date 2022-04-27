package ltd.newbee.mall.newbeemall;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mall.newbeemall.service.QAService;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@SpringBootTest
class NewbeeMallApplicationTests {
//
//	@Resource
//	RunRecommendApiHistoryService runRecommendApiHistoryService;
//
//	@Test
//	void contextLoads() {
//		List<RunRecommendApiHistory> list = new ArrayList<RunRecommendApiHistory>();
//		RunRecommendApiHistory h1 = new RunRecommendApiHistory();
//		h1.setCategoryId(0);
//		h1.setRunDate(new Date());
//		list.add(h1);
//		int cnt = runRecommendApiHistoryService.insertRunRecommendApiHistory(list);
//		assertEquals(1, cnt);
//	}

//	@Resource
//	GoodsImageService goodsImageService;
//
//	@Test
//	void testGoodsImage() {
//		goodsImageService.getGoodsImages(10003);
//	}

	@Resource

	QAService qaService;

	@Test

	void testqa() {
		ResultGenerator.genSuccessResult(qaService.selectQA(10063, 2, 3));

	}

}

//	@Test
//	void testSelectRecCat() {
//		List<Long> list = runRecommendApiHistoryService.selectRecCat(6l);
//		assertEquals(2, list.size());
//		assertTrue(list.contains(51l));
//		assertTrue(list.contains(47l));
//	}
