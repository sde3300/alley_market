package am.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.github.pagehelper.Page;

import am.dto.CustomersDto;
import am.dto.NoticeDto;
import am.dto.OrdersDto;
import am.dto.ProductDto;
import am.dto.QnaDto;

public interface AdminService {

//	관리자 메인페이지 불러오기
	List<OrdersDto> adminMainPage() throws Exception;

//	회원관리 페이지 불러오기 (수정전)
//	List<CustomersDto> SelectCustomerList() throws Exception;

//회원관리 페이지 불러오기에 페이징 추가
	 public Page<CustomersDto> getCusList(int pageNo) throws Exception;

//	공지사항 리스트 불러오기(수정전)
//	List<NoticeDto> SelectNoticeBoardList() throws Exception;
	
//	공지사항 리스트 불러오기에 페이징 추가
	public Page<NoticeDto> getNotiList(int pageNo) throws Exception;

//	공지사항 작성하기
	void NoticeWrite(NoticeDto notice, MultipartHttpServletRequest mgsr) throws Exception;

//	공지사항 상세내용 확인하기
	NoticeDto NoticeDetail(int noticePk) throws Exception;

//	공지사항 상세내용 수정하기
	void noticeUpdate(NoticeDto noticeupdate) throws Exception;

//	공지사항 상세내용 삭제하기
	void noticeDelete(int noticePk) throws Exception;

//	상품재고 목록 확인하기(수정전)
//	List<ProductDto> SelectStockList(int boardIdx) throws Exception;
	
//  상품재고 목록 확인하기 + 페이징추가 
	public Page<ProductDto> SelectStockList(int pageNo) throws Exception;
	
//	상품정보 등록하기
	void ProductInsert(ProductDto productIn, MultipartHttpServletRequest mgsr) throws Exception;

//	상품이미지 등록하기
//	void insertBoardImg(ProductDto imgin, MultipartHttpServletRequest mhsr) throws Exception;

//	관리자 문의리스트 불러오기(수정전)
//	List<QnaDto> qnaList() throws Exception;
	
//	관리자 문의리스트 불러오기 + 페이징추가
	public Page<QnaDto> getqnaList(int pageNo) throws Exception;	

}
