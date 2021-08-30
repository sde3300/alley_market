package am.service;

import java.util.List;

import am.dto.ProductDto;
import am.dto.ProductInfoDto;

public interface CustomerService {

//	메인페이지 불러오기
//	List<ProductDto> productMainPage() throws Exception;
	List<ProductInfoDto> productInfoMainPage() throws Exception;
	
	//데이터에 DB저장	
	void vueInsertBoard(ProductDto board) throws Exception;
	
	//상세페이지 데이터 확인
	ProductDto productDetailBoard(int productPk) throws Exception;
	
	
}
