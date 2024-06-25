package chapter5_6;

public class Order {
	String orderNum;
	String orderID;
	int orderYear;
	int orderMon;
	int orderDay;
	String orderName;
	String productNum;
	String address;
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public int getOrderYear() {
		return orderYear;
	}
	public void setOrderYear(int orderYear) {
		this.orderYear = orderYear;
	}
	public int getOrderMon() {
		return orderMon;
	}
	public void setOrderMon(int orderMon) {
		this.orderMon = orderMon;
	}
	public int getOrderDay() {
		return orderDay;
	}
	public void setOrderDay(int orderDay) {
		this.orderDay = orderDay;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static void main(String[] args) {
		Order orderer = new Order();
		orderer.orderNum = "201803120001";
		orderer.orderID = "abc123";
		orderer.orderYear = 2018;
		orderer.orderMon = 3;
		orderer.orderDay = 12;
		orderer.orderName = "홍길순";
		orderer.productNum = "PD0345-12";
		orderer.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + orderer.getOrderNum());
		System.out.println("주문자 아이디 : " + orderer.getOrderID());
		System.out.println("주문 날짜 : " + orderer.getOrderYear() + "년 "+orderer.getOrderMon()+"월 " + orderer.getOrderDay()+"일");
		System.out.println("주문자 이름 : " + orderer.getOrderName());
		System.out.println("주문 상품 번호 : " + orderer.getProductNum());
		System.out.println("배송 주소 : " + orderer.getAddress());
	}
	
	
}
