package am.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import am.dto.ProductDto;

@Mapper
public interface CustomerMapper {
	
	//	메인페이지 불러오기
	List<ProductDto> productMainPage() throws Exception;
	
	void vueInsertBoard(ProductDto board) throws Exception;

	//상세페이지 확인하기
	ProductDto vueSelectDetailBoard(int productPk) throws Exception;

}
