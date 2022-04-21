package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.CarouselMapper;
import ltd.newbee.mall.newbeemall.entity.Carousel;
import ltd.newbee.mall.newbeemall.service.NewBeeMallCarouselService;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCarouselVO;

@Service
public class NewBeeMallCarouselServiceImpl implements NewBeeMallCarouselService {
	@Resource
	private CarouselMapper carouselMapper;

	@Override
	public List<NewBeeMallIndexCarouselVO> getCarouselsForIndex(int number) {

		// TODO 自動生成されたメソッド・スタブ

		List<NewBeeMallIndexCarouselVO> voList = new ArrayList<>();
		List<Carousel> entityList = carouselMapper.findCarouselsByNum(5);

		for (Carousel entity : entityList) {
			NewBeeMallIndexCarouselVO vo = new NewBeeMallIndexCarouselVO();
			vo.setCarouselUrl(entity.getCarouselUrl());
			vo.setRedirectUrl(entity.getRedirectUrl());
			voList.add(vo);
		}

		return voList;
	}

}
