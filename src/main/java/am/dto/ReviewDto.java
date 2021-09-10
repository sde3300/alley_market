package am.dto;

import lombok.Data;

@Data
public class ReviewDto {
	private int reviewPk;
	private String boardCategoryPk;
	private String reviewTitle;
	private String reviewContents;
	private String createId;
	private String createDate;
	private String updateDate;
	private int reviewScore;
	private int productPk;
	private String customerName;
}
