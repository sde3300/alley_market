package am.dto;

import lombok.Data;

@Data
public class ProductFileDto {
	private int productPk;
	private String originalFileName;
	private String storedFilePath;

}
