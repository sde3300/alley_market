package am.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import am.dto.CustomersDto;
import am.dto.NoticeDto;
import am.dto.OrdersDto;

@Mapper
public interface AdminMapper {
	
//	관리자 메인페이지 불러오기
	List<OrdersDto> adminMainPage() throws Exception;
	

//	회원관리 페이지 불러오기
	List<CustomersDto> SelectCustomerList() throws Exception;

//	공지사항 리스트 불러오기
	List<NoticeDto> SelectNoticeBoardList() throws Exception;

//	공지사항 작성하기
	void NoticeWrite(NoticeDto notice) throws Exception;

//	공지사항 상세내용 확인하기
	NoticeDto NoticeDetail(int noticePk) throws Exception;

//	공지사항 상세내용 수정하기
	void noticeUpdate(NoticeDto noticeupdate) throws Exception;
	
//	공지사항 상세내용 삭제하기
	void noticeDelete(int noticePk) throws Exception;

}
