package am.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.dto.ProductDto;
import am.mapper.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper cusMapper;
	
	public List<ProductDto> productMainPage() throws Exception {
		return cusMapper.productMainPage();
	}
}
