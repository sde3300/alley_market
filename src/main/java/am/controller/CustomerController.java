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
	
////	상품 상세페이지 불러오기
//	@RequestMapping(value="/productDetail", method=RequestMethod.GET)
//	public Object productDetail(@RequestParam("productPk") int productPk) throws Exception {
//		ProductDto product = cusService.productDetail(productPk);
//				
//		return product;
//	}
//	
//	상품 상세페이지 불러오기 + 사진 

	@RequestMapping(value="/productDetail", method=RequestMethod.GET)
	public Object productDetail(@RequestParam("productPk") int productPk) throws Exception {
		ProductInfoDto product = cusService.productDetail(productPk);
				
		return product;
	}
	
//	리뷰작성하기
	@RequestMapping(value="/reviewWrite", method=RequestMethod.POST)
	public void ReviewWrite(@RequestBody ReviewDto reviewWri) throws Exception {
		cusService.reviewWrite(reviewWri);
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
	
//	문의 상세 보기
	@RequestMapping(value="/qnaDetail", method=RequestMethod.GET)
	public Object qnaDetail(@RequestParam("qnaPk") int qnaPk) throws Exception {
		QnaDto qna = cusService.qnaDetail(qnaPk);
				
		return qna;
	}
	
//	문의 등록하기
	@RequestMapping(value="/qnaInsert", method=RequestMethod.POST)
	public void qnaInsert(@RequestBody QnaDto qna) throws Exception {
		cusService.qnaInsert(qna);
	}
	
//	문의 답변하기(관리자)
	@RequestMapping(value="/answerUpdate", method=RequestMethod.PUT)
	public void answerUpdate(@RequestBody QnaDto qna) throws Exception {
		cusService.answerUpdate(qna);
	}
	
//	주문하기 - 상품정보 불러오기
	@RequestMapping(value="/orderProduct", method=RequestMethod.GET)
	public Object orderProduct(@RequestParam("customerPk") int customerPk) throws Exception {
		List<ProductDto> dataList = cusService.orderProduct(customerPk);
		
		return dataList;
	}
	
//	주문하기 - 주문입력
	@RequestMapping(value="/orderInsert", method=RequestMethod.POST)
	public void orderInsert(@RequestBody OrdersDto order) throws Exception {
		cusService.orderInsert(order);
	}

	
//	장바구니에 담기
	@RequestMapping(value="/cartInsert", method=RequestMethod.POST)
	public void cartInsert(@RequestBody OrdersDto cart) throws Exception {
		cusService.cartInsert(cart);
	}
	
//	장바구니 불러오기
	@RequestMapping(value="/cartList", method=RequestMethod.GET)
	public Object cartList(@RequestParam("customerPk") int customerPk) throws Exception {
		List<ProductDto> dataList = cusService.cartList(customerPk);
		
		return dataList;
	}

//	장바구니 목록 삭제하기
	@RequestMapping(value="/cartDelete", method=RequestMethod.DELETE)
	public void cartDelete(@RequestParam("orderDetailPk") int orderDetailPk) throws Exception {
		cusService.cartDelete(orderDetailPk);
	}
	
//	마이페이지 - 주문내역
	@RequestMapping(value="/myPageOrder", method=RequestMethod.GET)
	public Object myPageOrder(@RequestParam("customerPk") int customerPk) throws Exception {
		List<OrdersDto> dataList = cusService.myPageOrder(customerPk);
		
		return dataList;
	}
		

//	상단 카테고리별 페이지 조회
	// 밀키트
	@RequestMapping(value="/productb1", method=RequestMethod.GET)
	public Object p1MainPage() throws Exception {
		List<ProductInfoDto> dataList = cusService.p1BoardDetail();
				
		return dataList;
	}
	
	// 농수산물
	@RequestMapping(value="/productb2", method=RequestMethod.GET)
	public Object p2MainPage() throws Exception {
		List<ProductInfoDto> dataList = cusService.p2BoardDetail();
				
		return dataList;
	}
	
	// 축산물
	@RequestMapping(value="/productb3", method=RequestMethod.GET)
	public Object p3MainPage() throws Exception {
		List<ProductInfoDto> dataList = cusService.p3BoardDetail();
				
		return dataList;
	}
	
	// 식품
	@RequestMapping(value="/productb4", method=RequestMethod.GET)
	public Object p4MainPage() throws Exception {
		List<ProductInfoDto> dataList = cusService.p4BoardDetail();
				
		return dataList;
	}
	
	// 기타
	@RequestMapping(value="/productb5", method=RequestMethod.GET)
	public Object p5MainPage() throws Exception {
		List<ProductInfoDto> dataList = cusService.p5BoardDetail();
				
		return dataList;
	}
	
}

