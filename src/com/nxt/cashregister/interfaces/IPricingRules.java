package com.nxt.cashregister.interfaces;

import java.util.ArrayList;

public interface IPricingRules {
	/**
	 * Apply pricing rules for the given list and return the total price
	 * @param item
	 * @return
	 */
	public Double applyPricingRulesAndGetTotal(ArrayList<IItem> item);
}
