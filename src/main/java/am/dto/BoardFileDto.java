package am.dto;

import lombok.Data;

@Data
public class BoardFileDto {
	private int idx;
	private int boardCategoryPk;
	private int boardIdx;
	private String originalFileName;
	private String storedFilePath;
	private String createId;
	private String createDate;
}
