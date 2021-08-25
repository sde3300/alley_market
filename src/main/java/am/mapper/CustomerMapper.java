package am.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import am.dto.CustomersDto;
import am.dto.ProductDto;

@Mapper
public interface CustomerMapper {
	
//	메인페이지 불러오기
	List<ProductDto> productMainPage() throws Exception;

//	회원관리 페이지 불러오기
	CustomersDto SelectCustomerDetailBoard(int customer_pk) throws Exception;

}
