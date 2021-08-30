package am.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import am.dto.OrdersDto;
import am.dto.ProductDto;
import am.dto.ProductInfoDto;
import am.dto.QnaDto;
import am.dto.ReviewDto;
import am.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cusService;
	
//	메인페이지 불러오기
	@RequestMapping(value="/productMain", method=RequestMethod.GET)
	public Object productMainPage() throws Exception {
		List<ProductInfoDto> dataList = cusService.productInfoMainPage();
		
		return dataList;
	}


	
//	상품 상세페이지 불러오기
	@RequestMapping(value="/productDetail", method=RequestMethod.GET)
	public Object productDetail(@RequestParam("productPk") int productPk) throws Exception {
		ProductDto product = cusService.productDetail(productPk);
				
		return product;
	}
	
//	리뷰 보기
	@RequestMapping(value="/reviewRead", method=RequestMethod.GET)
	public Object reviewRead(@RequestParam("productPk") int productPk) throws Exception {
		List<ReviewDto> dataList = cusService.reviewRead(productPk);
		
		return dataList;
	}
	
//	문의 보기
	@RequestMapping(value="/qnaRead", method=RequestMethod.GET)
	public Object qnaRead(@RequestParam("productPk") int productPk) throws Exception {
		List<QnaDto> dataList = cusService.qnaRead(productPk);
		
		return dataList;
	}
	
//	문의 등록하기
	@RequestMapping(value="/qnaInsert", method=RequestMethod.POST)
	public void qnaInsert(@RequestBody QnaDto qna) throws Exception {
		cusService.qnaInsert(qna);
	}
	
//	주문하기 - 상품정보 불러오기
	@RequestMapping(value="/orderProduct", method=RequestMethod.GET)
	public Object orderProduct(@RequestParam("orderPk") int orderPk) throws Exception {
		List<ProductDto> dataList = cusService.orderProduct(orderPk);
		
		return dataList;
	}
	
//	주문하기 - 주문입력
	@RequestMapping(value="/orderInsert", method=RequestMethod.POST)
	public void orderInsert(@RequestBody OrdersDto order) throws Exception {
		cusService.orderInsert(order);

	}

}
