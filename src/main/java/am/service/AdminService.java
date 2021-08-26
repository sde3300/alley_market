package am.service;

import java.util.List;

import am.dto.CustomersDto;
import am.dto.NoticeDto;
import am.dto.OrdersDto;

public interface AdminService {

//	관리자 메인페이지 불러오기
	List<OrdersDto> adminMainPage() throws Exception;

//	회원관리 페이지 불러오기
	List<CustomersDto> SelectCustomerList() throws Exception;

//	공지사항 페이지 불러오기
	List<NoticeDto> SelectNoticeBoardList() throws Exception;

//	공지사항 작성하기
	void NoticeWrite(NoticeDto notice) throws Exception;
	
}
