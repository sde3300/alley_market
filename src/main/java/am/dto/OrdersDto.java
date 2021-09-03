package am.dto;

import lombok.Data;

@Data
public class OrdersDto {
	private int orderPk;
	private int orderDetailPk;
	private int customerPk;
	private String orderName;
	private String orderPhone;
	private String zip;
	private String addr1;
	private String addr2;
	private String orderDate;
	private int productPk;
	private int orderCnt;
	private int orderSum;
	private String orderCmp;
	private String orderAsk;
	private String productName;
	private String productStore;
	private int productPrice;
	private int totalPrice;
	private int totalPriceDelivery;
	private String originalFileName;
	private String storedFilePath;

}
