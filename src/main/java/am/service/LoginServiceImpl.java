package am.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.dto.CustomersDto;
import am.mapper.LoginMapper;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	public void join(CustomersDto user) throws Exception {
//		user.setUserPw(passwordEncoder.encode(user.getUserPw()));
		
		loginMapper.join(user);
	}
	
	@Override
	public int isUser(CustomersDto user) throws Exception {
//		user.setUserPw(passwordEncoder.encode(user.getUserPw()));
		
		return loginMapper.isUser(user);
	}
	
	@Override
	public CustomersDto login(CustomersDto user) throws Exception {
//		user.setUserPw(passwordEncoder.encode(user.getUserPw()));
		
		return loginMapper.login(user);
	}
}
