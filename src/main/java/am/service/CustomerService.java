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
	ProductDto productDetail(int productPk) throws Exception;
	
//	리뷰 보기
	List<ReviewDto> reviewRead(int productPk) throws Exception;
	
//	문의 보기
	List<QnaDto> qnaRead(int productPk) throws Exception;
	
//	문의 상세 보기
	QnaDto qnaDetail(int qnaPk) throws Exception;
	
//	문의 등록
	void qnaInsert(QnaDto qna) throws Exception;
	
//	문의 답변하기(관리자)
	void answerUpdate(QnaDto qna) throws Exception;
	
//	주문하기 - 상품정보 불러오기
	List<ProductDto> orderProduct(int customerPk) throws Exception;
	
//	주문하기 - 주문입력
	void orderInsert(OrdersDto order) throws Exception;
	
//	장바구니에 담기
	void cartInsert(OrdersDto cart) throws Exception;
	
//	장바구니 불러오기
	List<ProductDto> cartList(int cumtomerPk) throws Exception;
	
//	마이페이지 - 주문내역
	List<OrdersDto> myPageOrder(int customerPk) throws Exception;
	
}
