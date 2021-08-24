package am.dto;

import lombok.Data;

@Data
public class ProductDto {
	private int productPk;
	private String productCategoryPk;
	private String productName;
	private int productPrice;
	private int productStockCnt;
	private String productStore;

}
