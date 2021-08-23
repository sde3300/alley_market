package am.dto;

import lombok.Data;

@Data
public class ReviewDto {
	private int reviewPk;
	private int boardCategoryPk;
	private String reviewTitle;
	private String reviewContents;
	private String createId;
	private String createDate;
	private String updateDate;
	private int reviewscore;
	private int productPk;
	private int orderPk;
	
}
