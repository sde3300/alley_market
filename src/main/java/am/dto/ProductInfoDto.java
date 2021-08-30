package am.dto;

import lombok.Data;

@Data
public class ProductInfoDto {

	private int productpk;
	private String productCategoryPk;
	private String productName;
	private int productPrice;
	private String originalFileName;
	private String storedFilePath;
}