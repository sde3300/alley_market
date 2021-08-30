package am.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.dto.OrdersDto;
import am.dto.ProductDto;
import am.dto.ProductInfoDto;
<<<<<<< HEAD
=======
import am.dto.QnaDto;
import am.dto.ReviewDto;
>>>>>>> a97a840fffb337cd233a588f74469ea7e4f72b22
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
	
<<<<<<< HEAD
//	상세페이지 데이터 가져오기
	@Override
	public ProductDto productDetailBoard(int productPk) throws Exception{
		return cusMapper.productDetailBoard(productPk);
=======
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
>>>>>>> a97a840fffb337cd233a588f74469ea7e4f72b22
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
