package am.dto;

import lombok.Data;

@Data
public class ProductInfoDto {

	private int productPk;
	private String productCategoryPk;
	private String productName;
	private int productPrice;
	private String originalFileName;
	private String storedFilePath;
	private String productStore;
	private int productStockCnt;
	private String productDetail;

}



