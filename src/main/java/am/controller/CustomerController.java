package am.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import am.dto.ProductDto;
import am.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cusService;
	
//	메인페이지 불러오기
	@RequestMapping(value="/productMain", method=RequestMethod.GET)
	public Object productMainPage() throws Exception {
		List<ProductDto> dataList = cusService.productMainPage();
		
		return dataList;
	}
	

	//지정한 게시판 글 확인하기
	// 이 아래로는 수정해야됨
	
	@RequestMapping(value="/productDetail", method=RequestMethod.GET)
	public Object vueSelectBoardDetail(@RequestParam("productPk") int productPk) throws Exception {
		ProductDto board = cusService.vueSelectDetailBoard(productPk);
			
		return board;
	}
	

}
