package am.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.dto.CustomersDto;
import am.dto.NoticeDto;
import am.dto.OrdersDto;
import am.mapper.AdminMapper;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminMapper adMapper;
	
//	관리자 메인페이지 불러오기
	public List<OrdersDto> adminMainPage() throws Exception {
		return adMapper.adminMainPage();
	}
	
//	회원관리 페이지 불러오기
	@Override
	public List<CustomersDto> SelectCustomerList() throws Exception {
		return adMapper.SelectCustomerList();
	}
	
//	공지사항 페이지 불러오기
	@Override
	public List<NoticeDto> SelectNoticeBoardList() throws Exception {
		return adMapper.SelectNoticeBoardList();
	}
	
//	공지사항 작성하기
	@Override
	public void NoticeWrite(NoticeDto notice) throws Exception {
		adMapper.NoticeWrite(notice);
	}
	
}
