package am.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import am.dto.OrdersDto;

@Mapper
public interface AdminMapper {
	
//	관리자 메인페이지 불러오기
	List<OrdersDto> adminMainPage() throws Exception;

}
