package am.service;

import java.util.List;

import am.dto.OrdersDto;
import am.dto.ProductDto;
import am.dto.ProductInfoDto;
<<<<<<< HEAD
=======
import am.dto.QnaDto;
import am.dto.ReviewDto;
>>>>>>> a97a840fffb337cd233a588f74469ea7e4f72b22

public interface CustomerService {

//	메인페이지 불러오기
//	List<ProductDto> productMainPage() throws Exception;
	List<ProductInfoDto> productInfoMainPage() throws Exception;
	
	//데이터에 DB저장	
	void vueInsertBoard(ProductDto board) throws Exception;
	
<<<<<<< HEAD
	//상세페이지 데이터 확인
	ProductDto productDetailBoard(int productPk) throws Exception;
	
	
=======
//	상품 상세페이지 불러오기
	ProductDto productDetail(int productPk) throws Exception;
	
//	리뷰 보기
	List<ReviewDto> reviewRead(int productPk) throws Exception;
	
//	문의 보기
	List<QnaDto> qnaRead(int productPk) throws Exception;
	
//	문의 등록
	void qnaInsert(QnaDto qna) throws Exception;
	
//	주문하기 - 상품정보 불러오기
	List<ProductDto> orderProduct(int orderPk) throws Exception;
	
//	주문하기 - 주문입력
	void orderInsert(OrdersDto qna) throws Exception;
>>>>>>> a97a840fffb337cd233a588f74469ea7e4f72b22
}
