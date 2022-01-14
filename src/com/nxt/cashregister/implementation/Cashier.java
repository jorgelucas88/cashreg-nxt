package com.nxt.cashregister.implementation;

import java.util.ArrayList;

import com.nxt.cashregister.interfaces.ICheckout;
import com.nxt.cashregister.interfaces.IItem;
import com.nxt.cashregister.interfaces.IPricingRules;

public class Cashier implements ICheckout {
	
	private double total;
	private ArrayList<IItem> items;
	private IPricingRules pricingRules;
	
	public Cashier(IPricingRules p) {
		this.pricingRules = p;
		this.items = new ArrayList<>();
	}
	
	@Override
	public ArrayList<IItem> scanItem(IItem i) {
		items.add(i);
		total = this.pricingRules.applyPricingRulesAndGetTotal(items);
		return this.items;
	}

	@Override
	public Double getTotal() {
		return this.total;
	}

	@Override
	public IPricingRules getPricingRules() {
		return this.pricingRules;
	}

	@Override
	public void finishCheckout() {
		this.items = new ArrayList<>();
		this.total = 0D;
	}
}
