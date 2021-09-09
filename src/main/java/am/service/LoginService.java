package am.service;

import am.dto.CustomersDto;

public interface LoginService {

	void join(CustomersDto user) throws Exception;
	
	int isUser(CustomersDto user) throws Exception;
	
	CustomersDto login(CustomersDto user) throws Exception;
}
