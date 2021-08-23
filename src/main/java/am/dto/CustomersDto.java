package am.dto;

import lombok.Data;

@Data
public class CustomersDto {
	private int customerPk;
	private String customerEmail;
	private String customerPw;
	private String customerName;
	private String customerPhone;
}
