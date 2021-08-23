package am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import am.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cusService;
	
//	메인페이지 불러오기
//	@RequestMapping(value="/productMain", method=RequestMethod.GET)
//	public Object productMainPage() throws Exception {
//		List<ProductDto> dataList = cusService.productMainPage();
//		
//		return dataList;
//	}
}
