package am.service;

import java.util.List;

import am.dto.ProductDto;

public interface CustomerService {

//	메인페이지 불러오기
	List<ProductDto> productMainPage() throws Exception;


	
	//데이터에 DB저장	
	void vueInsertBoard(ProductDto board) throws Exception;
	
	//게시판 글 확인
	ProductDto vueSelectDetailBoard(int productPk) throws Exception;
	

}
