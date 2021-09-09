package am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import am.dto.CustomersDto;
import am.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/join")
	public void join(@RequestBody CustomersDto user) throws Exception {
		
		loginService.join(user);
	}
	
	@PostMapping("/login")
	public Object login(@RequestBody CustomersDto user) throws Exception {
		CustomersDto loginUser = null;
		if (loginService.isUser(user) == 1) {
			loginUser = loginService.login(user);
		}
		
		return loginUser;
	}

}
