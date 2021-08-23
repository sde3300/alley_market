package am.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import am.dto.OrdersDto;
import am.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adService;
	
//	관리자 메인페이지 불러오기
	@RequestMapping(value="/adminMain", method=RequestMethod.GET)
	public Object adminMainPage() throws Exception {
		List<OrdersDto> dataList = adService.adminMainPage();
		
		return dataList;
	}
}
