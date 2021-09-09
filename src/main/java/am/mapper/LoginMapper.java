package am.mapper;

import org.apache.ibatis.annotations.Mapper;

import am.dto.CustomersDto;

@Mapper
public interface LoginMapper {

	void join(CustomersDto user) throws Exception;
	
	int isUser(CustomersDto user) throws Exception;
	
	CustomersDto login(CustomersDto user) throws Exception;
}
