package am.dto;

import lombok.Data;

@Data
public class NoticeDto {
	private int noticePk;
	private int boardCategoryPk;
	private String noticeTitle;
	private String noticeContents;
	private String createId;
	private String createDate;
	private String updateDate;
	
}
