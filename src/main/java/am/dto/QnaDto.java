package am.dto;

import lombok.Data;

@Data
public class QnaDto {
	private int qnaPk;
	private String boardCategoryPk;
	private String qnaTitle;
	private String qnaContents;
	private String createId;
	private String createDate;
	private int productPk;
	private String productName;
	private String answerContents;
	private String answerYn;
}
