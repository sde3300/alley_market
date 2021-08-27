package am.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.dto.OrdersDto;
import am.dto.ProductDto;
import am.dto.QnaDto;
import am.dto.ReviewDto;
import am.mapper.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper cusMapper;
	
	@Override
	public List<ProductDto> productMainPage() throws Exception {
		return cusMapper.productMainPage();
	}
	
////	
//	@Override
//	public void vueInsertBoard(ProductDto board) throws Exception {
//		cusMapper.vueInsertBoard(board);
//	}
////	
//	@Override
//	public ProductDto vueSelectDetailBoard(int productPk) throws Exception{
//		return cusMapper.vueSelectDetailBoard(productPk);
//	}
	
//	리뷰 보기
	@Override
	public List<ReviewDto> reviewRead(int productPk) throws Exception {
		List<ReviewDto> list = cusMapper.reviewRead(productPk);
		
		return list;
	}
	
//	문의 보기
	@Override
	public List<QnaDto> qnaRead(int productPk) throws Exception {
		List<QnaDto> list = cusMapper.qnaRead(productPk);
		
		return list;
	}
	
//	문의 등록
	@Override
	public void qnaInsert(QnaDto qna) throws Exception {
		cusMapper.qnaInsert(qna);
	}
	
//	주문하기 - 상품정보 불러오기
	@Override
	public List<ProductDto> orderProduct(int orderPk) throws Exception {
		List<ProductDto> list = cusMapper.orderProduct(orderPk);
		
		return list;
	}
	
//	주문하기 - 주문입력
	@Override
	public void orderInsert(OrdersDto order) throws Exception {
		cusMapper.orderInsert(order);
	}
	

}
