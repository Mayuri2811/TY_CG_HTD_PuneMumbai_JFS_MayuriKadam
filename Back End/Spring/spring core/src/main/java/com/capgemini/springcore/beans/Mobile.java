package com.capgemini.springcore.beans;

public class Mobile {
private String brandName;
private String modelName;
private double price;
private MobileDisplay mobileDisplay;

public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public MobileDisplay getMobileDisplay() {
	return mobileDisplay;
}
public void setMobileDisplay(MobileDisplay mobileDisplay) {
	this.mobileDisplay = mobileDisplay;
}

}
