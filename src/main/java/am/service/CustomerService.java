package am.service;

import java.util.List;

import am.dto.ProductDto;
import am.dto.QnaDto;
import am.dto.ReviewDto;

public interface CustomerService {

//	메인페이지 불러오기
	List<ProductDto> productMainPage() throws Exception;
	
//	//데이터에 DB저장	
//	void vueInsertBoard(ProductDto board) throws Exception;
//	
//	//게시판 글 확인
//	ProductDto vueSelectDetailBoard(int productPk) throws Exception;
	
//	리뷰 보기
	List<ReviewDto> reviewRead(int productPk) throws Exception;
	
//	문의 보기
	List<QnaDto> qnaRead(int productPk) throws Exception;
	
//	문의 등록
	void qnaInsert(QnaDto qna) throws Exception;
}
