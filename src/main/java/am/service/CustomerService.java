package am.service;

import java.util.List;

import am.dto.OrdersDto;
import am.dto.ProductDto;
import am.dto.ProductInfoDto;
import am.dto.QnaDto;
import am.dto.ReviewDto;


public interface CustomerService {

//	메인페이지 불러오기
//	List<ProductDto> productMainPage() throws Exception;
	List<ProductInfoDto> productInfoMainPage() throws Exception;
	
//	데이터에 DB저장	
	void vueInsertBoard(ProductDto board) throws Exception;
	

	

//	상품 상세페이지 불러오기
//	ProductDto productDetail(int productPk) throws Exception;

//	상품 상세페이지 불러오기
	ProductInfoDto productDetail(int productPk) throws Exception;
	
//	리뷰 보기
	List<ReviewDto> reviewRead(int productPk) throws Exception;
	
//	문의 보기
	List<QnaDto> qnaRead(int productPk) throws Exception;
	
//	문의 등록
	void qnaInsert(QnaDto qna) throws Exception;
	
//	주문하기 - 상품정보 불러오기
	List<ProductDto> orderProduct(int orderPk) throws Exception;
	
//	주문하기 - 주문입력

	void orderInsert(OrdersDto order) throws Exception;
	
//	장바구니에 담기
	void cartInsert(OrdersDto cart) throws Exception;
	
//	상단 카테고리별 페이지 조회
	// 밀키트
	List<ProductInfoDto> p1BoardDetail() throws Exception;
	// 농수산물
	List<ProductInfoDto> p2BoardDetail() throws Exception;
	// 축산물
	List<ProductInfoDto> p3BoardDetail() throws Exception;
	// 식품
	List<ProductInfoDto> p4BoardDetail() throws Exception;
	// 기타
	List<ProductInfoDto> p5BoardDetail() throws Exception;
}
