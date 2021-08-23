package am.dto;

import lombok.Data;

@Data
public class QnaDto {
	private int qnaPk;
	private int boardCategoryPk;
	private String qnaTitle;
	private String qnaContents;
	private String createId;
	private String createDate;
	private int productPk;
	private String answerContents;
	private String answerYn;
}
