package am.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.dto.OrdersDto;
import am.dto.ProductDto;
import am.dto.ProductInfoDto;
import am.dto.QnaDto;
import am.dto.ReviewDto;
import am.mapper.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper cusMapper;
	
//	메인페이지 불러오기
	@Override
	public List<ProductInfoDto> productInfoMainPage() throws Exception {
//		return cusMapper.productMainPage();
		return cusMapper.productInfoMainPage();
	}
	
//	
	@Override
	public void vueInsertBoard(ProductDto board) throws Exception {
		cusMapper.vueInsertBoard(board);
	}
	
//	상품 상세페이지 불러오기
	@Override
	public ProductDto productDetail(int productPk) throws Exception{
		return cusMapper.productDetail(productPk);
	}
	
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
	
//	장바구니에 담기
	@Override
	public void cartInsert(OrdersDto cart) throws Exception {
		cusMapper.cartInsert(cart);
	}
	
//	리뷰작성하기
	@Override
	public void ReviewWrite(ReviewDto reviewWri) throws Exception {
		cusMapper.ReviewWrite(reviewWri);
	}
	

}
