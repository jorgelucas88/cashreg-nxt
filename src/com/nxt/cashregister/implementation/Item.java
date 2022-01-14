package com.nxt.cashregister.implementation;

import com.nxt.cashregister.interfaces.IItem;
import com.nxt.cashregister.items.Items;

public class Item implements IItem {
	
	private String code;

	public Item(Items i) {
		this.code = i.getCode();				
	}
	
	
	@Override
	public String getItemCode() {
		return this.code;
	}

}
