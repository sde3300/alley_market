package am.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import am.dto.ProductDto;
import am.dto.ProductInfoDto;
import am.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cusService;
	
//	메인페이지 불러오기
	@RequestMapping(value="/productMain", method=RequestMethod.GET)
	public Object productMainPage() throws Exception {
		List<ProductInfoDto> dataList = cusService.productInfoMainPage();
		
		return dataList;
	}


	//0827 : 상세페이지 데이터 불러오기
	
	@RequestMapping(value="/productDetail", method=RequestMethod.GET)
	public Object productBoardDetail(@RequestParam("productPk") int productPk) throws Exception {
		ProductDto board = cusService.productDetailBoard(productPk);
				
	return board;
	}

}
