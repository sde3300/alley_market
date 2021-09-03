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
	
//	인덱스페이지 불러오기
	@Override
	public List<ProductInfoDto> productInfoIndexPage() throws Exception {
		return cusMapper.productInfoIndexPage();
	}
	
//	메인페이지 불러오기
	@Override
	public List<ProductInfoDto> productInfoMainPage() throws Exception {
		return cusMapper.productInfoMainPage();
	}
	
	@Override
	public void vueInsertBoard(ProductDto board) throws Exception {
		cusMapper.vueInsertBoard(board);
	}

//	상품 상세페이지 불러오기
	@Override
	public ProductInfoDto productDetail(int productPk) throws Exception{
		return cusMapper.productDetail(productPk);
	}
	
//	리뷰 보기
	@Override
	public List<ReviewDto> reviewRead(int productPk) throws Exception {
		List<ReviewDto> list = cusMapper.reviewRead(productPk);
		
		return list;
	}
	
//	리뷰작성하기
	@Override
	public void reviewWrite(ReviewDto reviewWri) throws Exception {
		cusMapper.reviewWrite(reviewWri);
	}
	
//	문의 보기
	@Override
	public List<QnaDto> qnaRead(int productPk) throws Exception {
		List<QnaDto> list = cusMapper.qnaRead(productPk);
		
		return list;
	}
	
//	문의 상세 보기
	@Override
	public QnaDto qnaDetail(int qnaPk) throws Exception{
		return cusMapper.qnaDetail(qnaPk);
	}
		
//	문의 등록
	@Override
	public void qnaInsert(QnaDto qna) throws Exception {
		cusMapper.qnaInsert(qna);
	}
	
//	문의 답변하기(관리자)
	@Override
	public void answerUpdate(QnaDto qna) throws Exception {
		cusMapper.answerUpdate(qna);
	}
	
//	주문하기 - 상품정보 불러오기
	@Override
	public List<ProductDto> orderProduct(int customerPk) throws Exception {
		List<ProductDto> list = cusMapper.orderProduct(customerPk);
		
		return list;
	}
	
//	주문하기 - 주문입력
	@Override
	public void orderInsert(OrdersDto order) throws Exception {
		cusMapper.orderInsert(order);
		cusMapper.orderDetailUpdate(order);
	}
		
//	장바구니에 담기
	@Override
	public void cartInsert(OrdersDto cart) throws Exception {
		cusMapper.cartInsert(cart);
	}
	
//	장바구니 불러오기
	@Override
	public List<ProductDto> cartList(int customerPk) throws Exception {
		List<ProductDto> list = cusMapper.cartList(customerPk);
		
		return list;
	}
	
//	장바구니 목록 삭제하기
	@Override
	   public void cartDelete(int orderDetailPk) throws Exception {
		cusMapper.cartDelete(orderDetailPk);
	  }
	
	
//	마이페이지 - 주문내역
	@Override
	public List<OrdersDto> myPageOrder(int customerPk) throws Exception {
		List<OrdersDto> list = cusMapper.myPageOrder(customerPk);
		
		return list;
	}
		
//	상단 카테고리별 페이지 조회
	// 밀키트
	@Override
	public List<ProductInfoDto> p1BoardDetail() throws Exception {
		return cusMapper.p1BoardDetail();
	}
	
	// 농수산물
	@Override
	public List<ProductInfoDto> p2BoardDetail() throws Exception {
		return cusMapper.p2BoardDetail();
	}
	
	// 축산물
	@Override
	public List<ProductInfoDto> p3BoardDetail() throws Exception {
		return cusMapper.p3BoardDetail();
	}
	
	// 식품
	@Override
	public List<ProductInfoDto> p4BoardDetail() throws Exception {
		return cusMapper.p4BoardDetail();
	}
	
	// 기타
	@Override
	public List<ProductInfoDto> p5BoardDetail() throws Exception {
		return cusMapper.p5BoardDetail();
	}
	
}
