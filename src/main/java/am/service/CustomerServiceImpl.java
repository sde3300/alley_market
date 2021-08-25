package am.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.dto.CustomersDto;
import am.dto.ProductDto;
import am.mapper.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper cusMapper;
	
	@Override
	public List<ProductDto> productMainPage() throws Exception {
		return cusMapper.productMainPage();
	}
	
	@Override
	public CustomersDto SelectCustomerDetailBoard(int customer_pk) throws Exception {
		return cusMapper.SelectCustomerDetailBoard(customer_pk);
	}
}
