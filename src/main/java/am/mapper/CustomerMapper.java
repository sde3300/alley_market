package am.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import am.dto.ProductDto;
import am.dto.ProductFileDto;

@Mapper
public interface CustomerMapper {
	
	//	메인페이지 불러오기
	List<ProductDto> productMainPage() throws Exception;
	
	//사진파일 불러오기 
	List<ProductFileDto> productFileMainPage() throws Exception;
	
	void vueInsertBoard(ProductDto board) throws Exception;

	//상세페이지 확인하기
	ProductDto productDetailBoard(int productPk) throws Exception;

}
