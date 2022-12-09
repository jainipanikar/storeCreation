package storeCreation;

public class items {
	private String itemName;
	private double itemWeight;
	private float itemValue;
	
	public items( String itemName, double itemWeight, float itemValue) {
		this.itemName = itemName;
		this.itemWeight = itemWeight;
		this.itemValue = itemValue;
	}
    
	private String getItemName() {
		return itemName;
	}
	
	private void setItemName ( String itemName) {
		this.itemName = itemName;
	}
	
	private double itemWeight() {
		return itemWeight;
	}
	
	private void setItemWeight ( double itemWeight) {
		this.itemWeight = itemWeight;
	}
	
	private float getItemValue () {
		return itemValue;
		
	}
	
	private void setItemValue( float itemValue) {
		this.itemValue = itemValue;
		
	}
}
