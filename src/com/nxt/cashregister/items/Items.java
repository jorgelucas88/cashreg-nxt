package com.nxt.cashregister.items;

public enum Items {

	VOUCHER("VOUCHER", "Gift card", 5d),
	TSHIRT("TSHIRT", "Summer T-Shirt", 20d),
	PANTS("PANTS", "Summer pants", 7.5d)
	;
	
	private String code;
	private String name;
	private Double price;
	private String currency;
	
	private Items(String code, String name, Double price) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.currency = "EUR";
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public String getCurrency() {
		return this.currency;
	}
	
}
