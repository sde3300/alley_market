package am.service;

import java.util.List;

import am.dto.CustomersDto;
import am.dto.ProductDto;


public interface CustomerService {

//	메인페이지 불러오기
	List<ProductDto> productMainPage() throws Exception;

//	회원관리 페이지 불러오기
	CustomersDto SelectCustomerDetailBoard(int customer_pk) throws Exception;
}
