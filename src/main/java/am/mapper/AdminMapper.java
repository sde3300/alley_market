package am.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;

import am.dto.CustomersDto;
import am.dto.NoticeDto;
import am.dto.OrdersDto;
import am.dto.ProductDto;
import am.dto.ProductFileDto;

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
	
//	상품재고 목록 확인하기
	List<ProductDto> SelectStockList(@Param("boardIdx") int boardIdx) throws Exception;
	
//	상품정보 등록하기
	void ProductInsert(ProductDto productIn) throws Exception;

//	void productStockInsert(ProductDto productIn) throws Exception;

//	상품정보 이미지 넣기
	void productFileInsert(List<ProductFileDto> files) throws Exception;

	//페이징 테스트
	
	   Page<CustomersDto> findUser() throws Exception;
	
}
