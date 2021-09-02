package am.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.github.pagehelper.Page;

import am.dto.CustomersDto;
import am.dto.NoticeDto;
import am.dto.OrdersDto;
import am.dto.ProductDto;
import am.dto.ProductFileDto;
import am.dto.QnaDto;

@Mapper
public interface AdminMapper {
	
//	관리자 메인페이지 불러오기
	List<OrdersDto> adminMainPage() throws Exception;
	
//	회원관리 페이지에 페이징 추가 
	Page<CustomersDto> SelectCustomerList() throws Exception;

////	공지사항 리스트 불러오기(수정전)
//	List<NoticeDto> SelectNoticeBoardList() throws Exception;
	
//	공지사항 리스트에 페이징 추가
	Page<NoticeDto> SelectNoticeBoardList() throws Exception;

//	공지사항 작성하기
	void NoticeWrite(NoticeDto notice) throws Exception;

//	공지사항 상세내용 확인하기
	NoticeDto NoticeDetail(int noticePk) throws Exception;

//	공지사항 상세내용 수정하기
	void noticeUpdate(NoticeDto noticeupdate) throws Exception;
	
//	공지사항 상세내용 삭제하기
	void noticeDelete(int noticePk) throws Exception;
	
//	상품재고 목록 확인하기(수정전)
//	List<ProductDto> SelectStockList(@Param("boardIdx") int boardIdx) throws Exception;
	
//	상품재고 목록 확인하기(페이징 추가)
	Page<ProductDto> SelectStockList() throws Exception;	
	
//	상품정보 등록하기
	void ProductInsert(ProductDto productIn) throws Exception;

//	상품재고 ProductPk로 연결하기
	void productStockInsert(ProductDto productIn) throws Exception;

//	상품정보 이미지 넣기
	void productFileInsert(List<ProductFileDto> files) throws Exception;

//	관리자 문의리스트 불러오기 (수정전)
//	List<QnaDto> qnaList() throws Exception;
	
//	관리자 문의리스트 불러오기 + 페이징추가
	Page<QnaDto> SelectqnaList() throws Exception;
	
}
