package am.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.github.pagehelper.PageInfo;

import am.dto.CustomersDto;
import am.dto.NoticeDto;
import am.dto.OrdersDto;
import am.dto.ProductDto;
import am.dto.QnaDto;
import am.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adService;
	
//	관리자 메인페이지 불러오기
	@RequestMapping(value="/adminMain", method=RequestMethod.GET)
	public Object adminMainPage() throws Exception {
		List<OrdersDto> dataList = adService.adminMainPage();
		
		return dataList;
	}
	
	//회원관리 게시판 글 확인하기 수정전
//	@RequestMapping(value="/cusManage", method=RequestMethod.GET)
//	public Object SelectCustomerList() throws Exception {
//		List<CustomersDto> cusdataList = adService.SelectCustomerList();
//		
//		return cusdataList;
//	}
	
	
	//0902 혜수 : 회원관리 게시판 글 확인 + 페이징 추가 
	    @RequestMapping(value="/cusManage", method=RequestMethod.GET)
	    public Object page(@RequestParam(required = false, defaultValue = "1") int pageNum) throws Exception {
	        PageInfo<CustomersDto> cusdataList = new PageInfo<CustomersDto>(adService.getCusList(pageNum), 3);
	        return cusdataList;
	    }
	
	    
//	공지사항 게시판 목록 확인하기 수정전
//	@RequestMapping(value="/noticeList", method=RequestMethod.GET)
//	public Object SelectNoticeBoardList() throws Exception {
//		List<NoticeDto> noticedataList = adService.SelectNoticeBoardList();
//		
//		return noticedataList;
//	}
	
	//0902 혜수 : 공지사항 게시판 목록 확인 + 페이징 추가 
	@RequestMapping(value="/noticeList", method=RequestMethod.GET)
	public Object SelectNoticeBoardList(@RequestParam(required = false, defaultValue = "1") int pageNum) throws Exception {
		PageInfo<NoticeDto> noticedataList = new PageInfo<NoticeDto>(adService.getNotiList(pageNum), 3);
		return noticedataList;
	}
	
//	공지사항 작성하기
	@RequestMapping(value="/noticeWrite", method=RequestMethod.POST)
	public void NoticeWrite(@RequestBody NoticeDto notice) throws Exception {
		adService.NoticeWrite(notice);
	}
	
//	지정한 게시판 글 확인하기
	@RequestMapping(value="/noticeDetail", method=RequestMethod.GET)
	public Object NoticeDetail(@RequestParam("noticePk") int noticePk) throws Exception {
		NoticeDto noticedetaillist = adService.NoticeDetail(noticePk);
		return noticedetaillist;
	}
	
//	공지사항 수정하기
	@RequestMapping(value="/noticeUpdate", method=RequestMethod.PUT)
	public void noticeUpdateDetail(@RequestBody NoticeDto noticeupdate) throws Exception {
		adService.noticeUpdate(noticeupdate);
	}
	
//	공지사항 삭제하기
	@RequestMapping(value="/noticeDelete", method=RequestMethod.DELETE)
	public void noticeDeleteDetail(@RequestParam("noticePk") int noticePk) throws Exception {
		adService.noticeDelete(noticePk);
	}
	
////	상품재고 목록 확인하기 (수정전)
//	@RequestMapping(value="/stockList", method=RequestMethod.GET)
//	public Object StockList(@RequestParam("boardIdx") int boardIdx) throws Exception {
//		List<ProductDto> stockdataList = adService.SelectStockList(boardIdx);
//		
//		return stockdataList;
//	}
	
//	상품재고 목록 확인하기 + 페이징추가
	@RequestMapping(value="/stockList", method=RequestMethod.GET)
	public Object StockList(@RequestParam(required = false, defaultValue = "1") int pageNum) throws Exception {
		PageInfo<ProductDto> stockdataList = new PageInfo<ProductDto>(adService.SelectStockList(pageNum), 3);
		return stockdataList;
	}
	

	
//	주문하기 - 상품정보 + 이미지 입력하기
	@RequestMapping(value="/productInsert", method=RequestMethod.POST)
	public void ProductInsert(ProductDto productIn, MultipartHttpServletRequest mhsr) throws Exception {
		adService.ProductInsert(productIn, mhsr);
	}
	
//	관리자 문의리스트 불러오기(수정전)
//	@RequestMapping(value="/qnaList", method=RequestMethod.GET)
//	public Object qnaList() throws Exception {
//		List<QnaDto> list = adService.qnaList();
//		
//		return list;
//	}
	
//	관리자 문의리스트 불러오기 + 페이징추가
	@RequestMapping(value="/qnaList", method=RequestMethod.GET)
	public Object QnaList(@RequestParam(required = false, defaultValue = "1") int pageNum) throws Exception {
		PageInfo<QnaDto> qnaList = new PageInfo<QnaDto>(adService.getqnaList(pageNum), 3);
		
		return qnaList;
	}

}
