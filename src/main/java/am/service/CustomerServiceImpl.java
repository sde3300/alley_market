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
	
	@Override
	public List<ProductDto> productMainPage() throws Exception {
		return cusMapper.productMainPage();
	}
	
	
//	
	@Override
	public void vueInsertBoard(ProductDto board) throws Exception {
		cusMapper.vueInsertBoard(board);
	}
//	
	@Override
	public ProductDto vueSelectDetailBoard(int productPk) throws Exception{
		return cusMapper.vueSelectDetailBoard(productPk);
	}
	

}
