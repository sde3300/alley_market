package am.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import am.dto.CustomersDto;
import am.dto.NoticeDto;
import am.dto.OrdersDto;
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
	
//	회원관리 게시판 글 확인하기
	@RequestMapping(value="/cusManage", method=RequestMethod.GET)
	public Object SelectCustomerList() throws Exception {
		List<CustomersDto> cusdataList = adService.SelectCustomerList();
		
		return cusdataList;
	}
	
//	공지사항 게시판 목록 확인하기
	@RequestMapping(value="/noticeList", method=RequestMethod.GET)
	public Object SelectNoticeBoardList() throws Exception {
		List<NoticeDto> noticedataList = adService.SelectNoticeBoardList();
		
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
	
}
