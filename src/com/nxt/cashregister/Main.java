package com.nxt.cashregister;

import com.nxt.cashregister.implementation.Cashier;
import com.nxt.cashregister.implementation.Item;
import com.nxt.cashregister.implementation.PricingRules;
import com.nxt.cashregister.interfaces.ICheckout;
import com.nxt.cashregister.interfaces.IPricingRules;
import com.nxt.cashregister.items.Items;

public class Main {

	public static void main(String[] args) {
		IPricingRules p = new PricingRules();
		ICheckout cashier = new Cashier(p);
		String testMessage = null;

		//
		testMessage = "1 panty checkout: ";
		cashier.scanItem(new Item(Items.PANTS));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();

		//
		testMessage = "2 panty checkout: ";
		cashier.scanItem(new Item(Items.PANTS));
		cashier.scanItem(new Item(Items.PANTS));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();

		//
		testMessage = "1 T-Shirt checkout: ";
		cashier.scanItem(new Item(Items.TSHIRT));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();
		
		//
		testMessage = "2 T-Shirt checkout: ";
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.TSHIRT));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();

		//
		testMessage = "3 T-Shirt checkout: ";
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.TSHIRT));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();

		//
		testMessage = "4 T-Shirt checkout: ";
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.TSHIRT));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();

		
		//
		testMessage = "1 voucher checkout: ";
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();
		

		//
		testMessage = "2 vouchers checkout: ";
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();
		
		//
		testMessage = "3 Voucher checkout: ";
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();

		//
		testMessage = "5 Voucher checkout: ";
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();
		
		//
		testMessage = "1 Voucher, 1 tshirt, 1 pants checkout: ";
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.PANTS));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();
		
		//
		testMessage = "2 Voucher, 3 tshirt, 1 pants checkout: ";
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.PANTS));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();
		
		//
		testMessage = "3 Voucher, 3 tshirt, 1 pants checkout: ";
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.TSHIRT));
		cashier.scanItem(new Item(Items.PANTS));
		System.out.println(testMessage + cashier.getTotal());
		cashier.finishCheckout();

	}

}
