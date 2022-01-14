package com.nxt.cashregister.implementation;

import java.util.ArrayList;

import com.nxt.cashregister.interfaces.IItem;
import com.nxt.cashregister.interfaces.IPricingRules;
import com.nxt.cashregister.items.Items;

public class PricingRules implements IPricingRules {

	@Override
	public Double applyPricingRulesAndGetTotal(ArrayList<IItem> items) {
		double total = 0D;
		int totalVoucher = this.getTotalItemOfType(items, Items.VOUCHER);
		int totalTShirt = this.getTotalItemOfType(items, Items.TSHIRT);
		int totalPants = this.getTotalItemOfType(items, Items.PANTS);
		
		// 2 for 1 vouchers
		if (totalVoucher > 0) {
			total += (Math.floor(totalVoucher / 2)) * Items.VOUCHER.getPrice();
			total += totalVoucher % 2 > 0 ? Items.VOUCHER.getPrice() : 0;
		}
		
		// if 3 or more t-shirts, each one costs 19
		if (totalTShirt > 0) {
			total += totalTShirt > 0 && totalTShirt >= 3 ? totalTShirt * 19 : totalTShirt * Items.TSHIRT.getPrice();
		}
		
		// pants
		total += totalPants > 0 ? totalPants * Items.PANTS.getPrice() : 0;
		
		return total;
	}
	
	public int getTotalItemOfType(ArrayList<IItem> items, Items item) {
		int total = 0;
		for (IItem i : items) {
			total += i.getItemCode().equals(item.getCode()) ? 1 : 0;
		}
		return total;
	}
}
