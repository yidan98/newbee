package ltd.newbee.mall.newbeemall;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mall.newbeemall.entity.Review;
import ltd.newbee.mall.newbeemall.service.WhetherReviewService;

@SpringBootTest
class NewbeeMallApplicationTests {

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

//	@Resource
//
//	QAService qaService;

//	@Test
//
//	void testqa() {
//		ResultGenerator.genSuccessResult(qaService.selectQA(10063, 2, 3,count));
//
//	}
	@Resource
	WhetherReviewService whetherReviewService;

	@Test
	void contextLoads1() {
//		review_id,order_id,nick_name,contents
		List<Review> list = new ArrayList<Review>();
		Review h1 = new Review();
		h1.setNickName("Frank");
		h1.setOrderId(2);
		h1.setContent("挺好的");
		h1.setReviewId(9);
		list.add(h1);
	}

	@Test
	void testGetReview() {
		List<Review> list2 = whetherReviewService.getReview(10158, 1);

	}
//		int cnt = whetherReviewService.insertReview(list);
//
//		assertEquals(1, cnt);
}

//	@Test
//	void testSelectRecCat() {
//		List<Long> list = runRecommendApiHistoryService.selectRecCat(6l);
//		assertEquals(2, list.size());
//		assertTrue(list.contains(51l));
//		assertTrue(list.contains(47l));
//	}
