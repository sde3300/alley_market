package am.dto;

import lombok.Data;

@Data
public class OrdersDto {
	private int orderPk;
	private int customerPk;
	private String orderName;
	private String orderPhone;
	private String orderAddress;
	private String orderDate;
	private int productPk;
	private int orderCnt;
	private int orderSum;
	private String orderAsk;
}
