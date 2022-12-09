package storeCreation;

public class orders {
	
	private double orderId;
	private double orderLineItem;
	private String billName;
	private String Address1;
	private String Address2;
	private float orderDate;
	private String billToStore;
	private String orderStatus;
	
	public orders ( double orderID, double orderLineItem, String billName, String Address1, String Address2, 
			float orderDate, String billToStrore, String orderStatus ) {
		super();
		this.orderId = orderId;
		this.orderLineItem = orderLineItem;
		this.billName = billName;
		this.Address1 = Address1;
		this.Address2 = Address2;
		this.orderDate = orderDate;
		this.billToStore = billToStore;
		this.orderStatus = orderStatus;
		
	}
     
	private double getOrderId() {
		return orderId;
		
	}
	
	private void setOrderId(double orderId) {
		this.orderId = orderId;
		
	}
	
    private double getOrderLineItem() {
    	return orderLineItem;
    	
    }
    
    private void setOrderLineItem ( double orderLineItem) {
    	this.orderLineItem = orderLineItem;
    	
    }
    
    
	public String getBillName() {
		return billName;
	}

	public String getAddress1() {
		return Address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String address2) {
		Address2 = address2;
	}

	public float getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(float orderDate) {
		this.orderDate = orderDate;
	}

	public String getBillToStore() {
		return billToStore;
	}

	public void setBillToStore(String billToStore) {
		this.billToStore = billToStore;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

	public void setAddress1(String address1) {
		Address1 = address1;
	}
    
    
}