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
	private String productDetail;
	private int boardIdx;
//	private String originalFileName;
//	private String storedFilePath;
//	파일경로 가져오는 부분
	private List<ProductFileDto> fileList;
}
