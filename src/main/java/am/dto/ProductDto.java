package am.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProductDto {
	private int productPk;
	private String productCategoryPk;
	private String productName;
	private int productPrice;
	private int productStockCnt;
	private String productStore;

	//정민 추가
	private String productDetail;
	private int boardIdx;
	private int orderCnt;
	private int orderSum;
	private int customerPk;
//	private String originalFileName;
//	private String storedFilePath;
	private List<ProductFileDto> fileList;

}
