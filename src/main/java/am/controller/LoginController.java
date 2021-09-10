package am.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
//	아이디 중복확인
	@GetMapping("/idCheck")
	public Object idCheck(@RequestParam("customerEmail") String customerEmail) throws Exception {
		
		Map<String, Boolean> result = new HashMap<String, Boolean>();
		int count = loginService.idCheck(customerEmail);
		
		if (count == 0) {
			result.put("result", true);
		}
		else {
			result.put("result", false);
		}
		
		return result;
	}

}
