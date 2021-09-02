package am.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProductDto {
	private int productPk;
	private int orderDetailPk;
	private String productCategoryPk;
	private String productName;
	private int productPrice;
	private int productStockCnt;
	private String productStore;
	

//	정민 추가
	private String productDetail;
	private int boardIdx;
//	파일경로 가져오는 부분(originalFileName, storedFilePath포함하는 리스트)
	private List<ProductFileDto> fileList;
	
//	다은추가
	private int orderCnt;
	private int orderSum;
	private int customerPk;
	
//혜수추가(장바구니, 마이페이지용)
	
	private String originalFileName;
	private String storedFilePath;
	
	

}
