package am.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import am.common.AmFileUtils;
import am.dto.CustomersDto;
import am.dto.NoticeDto;
import am.dto.OrdersDto;
import am.dto.ProductDto;
import am.dto.ProductFileDto;
import am.mapper.AdminMapper;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminMapper adMapper;
	
	@Autowired
	private AmFileUtils amFileUtils;
	
//	관리자 메인페이지 불러오기
	@Override
	public List<OrdersDto> adminMainPage() throws Exception {
		return adMapper.adminMainPage();
	}
	
//	회원관리 페이지 불러오기
	@Override
	public List<CustomersDto> SelectCustomerList() throws Exception {
		return adMapper.SelectCustomerList();
	}
	
//	공지사항 리스트 불러오기
	@Override
	public List<NoticeDto> SelectNoticeBoardList() throws Exception {
		return adMapper.SelectNoticeBoardList();
	}
	
//	공지사항 작성하기
	@Override
	public void NoticeWrite(NoticeDto notice) throws Exception {
		adMapper.NoticeWrite(notice);
	}
	
//	공지사항 상세내용 확인하기
	@Override
	public NoticeDto NoticeDetail(int noticePk) throws Exception {
		return adMapper.NoticeDetail(noticePk);
	}
	
//	공지사항 상세내용 수정하기
	@Override
	public void noticeUpdate(NoticeDto noticeupdate) throws Exception {
		adMapper.noticeUpdate(noticeupdate);
	}
	
//	공지사항 상세내용 삭제하기
	@Override
	   public void noticeDelete(int noticePk) throws Exception {
		adMapper.noticeDelete(noticePk);
	  }
	
//	상품재고 목록 확인하기
	@Override
	public List<ProductDto> SelectStockList(int boardIdx) throws Exception {
		return adMapper.SelectStockList(boardIdx);
	}
	
//	상품정보 + 이미지 등록하기 + 재고에 productPk 추가하기
	@Override
	public void ProductInsert(ProductDto productIn, MultipartHttpServletRequest mhsr) throws Exception {
		adMapper.ProductInsert(productIn);
		adMapper.productStockInsert(productIn);
		List<ProductFileDto> list = amFileUtils.parseFileInfo(productIn.getProductPk(), mhsr);
		
		if (CollectionUtils.isEmpty(list) == false) {
			adMapper.productFileInsert(list);
		}
	}
	
}
