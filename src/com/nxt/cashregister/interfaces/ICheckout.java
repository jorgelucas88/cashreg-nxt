package com.nxt.cashregister.interfaces;

import java.util.ArrayList;

public interface ICheckout {
	/**
	 * Gets the current pricing rules
	 * @return
	 */
	public IPricingRules getPricingRules();
	/**
	 * Scan an item, calculates the total and returns the current list of items
	 * @param i
	 * @return
	 */
	public ArrayList<IItem> scanItem(IItem i);
	/**
	 * Gets the current total amount of the scanned items given the pricing rules
	 * @return
	 */
	public Double getTotal();
	/**
	 * Finishes operation
	 */
	public void finishCheckout();
}
