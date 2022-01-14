package com.nxt.cashregister.implementation.test;

import org.junit.jupiter.api.Test;

import com.nxt.cashregister.implementation.Cashier;
import com.nxt.cashregister.implementation.Item;
import com.nxt.cashregister.implementation.PricingRules;
import com.nxt.cashregister.interfaces.ICheckout;
import com.nxt.cashregister.items.Items;

import org.junit.Assert;

class CheckoutTest {

	@Test
	void items1Voucher() {
		ICheckout cashier = new Cashier(new PricingRules());
		cashier.scanItem(new Item(Items.VOUCHER));
		Assert.assertEquals(cashier.getTotal(), 5d, 0);
	}

	@Test
	void items2Vouchers() {
		ICheckout cashier = new Cashier(new PricingRules());
		cashier.scanItem(new Item(Items.VOUCHER));
		cashier.scanItem(new Item(Items.VOUCHER));
		Assert.assertEquals(cashier.getTotal(), 5d, 0);
	}

	@Test
	void items3Vouchers() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 3;
		double expectedTotal = 10d;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.VOUCHER));
		}
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);
	}

	@Test
	void items4Vouchers() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 4;
		double expectedTotal = 10d;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.VOUCHER));
		}
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);
	}

	@Test
	void items5Vouchers() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 5;
		double expectedTotal = 15d;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.VOUCHER));
		}
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);
	}

	@Test
	void items10Vouchers() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 10;
		double expectedTotal = 25d;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.VOUCHER));
		}
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);
	}
	
	@Test
	void items1Tshirt() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 1;
		double expectedTotal = 20d;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.TSHIRT));
		}
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);
	}

	@Test
	void items2Tshirt() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 2;
		double expectedTotal = 40d;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.TSHIRT));
		}
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);
	}

	@Test
	void items3Tshirt() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 3;
		double expectedTotal = 57d;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.TSHIRT));
		}
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);
	}

	@Test
	void items4Tshirt() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 4;
		double expectedTotal = 76d;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.TSHIRT));
		}
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);
	}
	
	@Test
	void items5Tshirt() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 5;
		double expectedTotal = 95d;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.TSHIRT));
		}
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);
	}

	@Test
	void items1Panty() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 1;
		double expectedTotal = 7.5d;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.PANTS));
		}
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);
	}
	

	@Test
	void items2Panty() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 2;
		double expectedTotal = 15d;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.PANTS));
		}
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);
	}
	
	@Test
	void items1Voucher1TShirt1Pants() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 0;
		double expectedTotal = 32.5d;

		// voucher
		totalItems = 1;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.VOUCHER));
		}

		// t-shirt
		totalItems = 1;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.TSHIRT));
		}

		// pants
		totalItems = 1;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.PANTS));
		}
		
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);		
	}
	
	@Test
	void items2Voucher3TShirt1Pants() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 0;
		double expectedTotal = 69.5d;

		// voucher
		totalItems = 2;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.VOUCHER));
		}

		// t-shirt
		totalItems = 3;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.TSHIRT));
		}

		// pants
		totalItems = 1;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.PANTS));
		}
		
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);		
	}
	
	@Test
	void items3Voucher3TShirt1Pants() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 0;
		double expectedTotal = 74.5d;

		// voucher
		totalItems = 3;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.VOUCHER));
		}

		// t-shirt
		totalItems = 3;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.TSHIRT));
		}

		// pants
		totalItems = 1;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.PANTS));
		}
		
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);		
	}
	
	@Test
	void items0Voucher0TShirt0Pants() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 0;
		double expectedTotal = 0d;

		// voucher
		totalItems = 0;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.VOUCHER));
		}

		// t-shirt
		totalItems = 0;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.TSHIRT));
		}

		// pants
		totalItems = 0;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.PANTS));
		}
		
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);		
	}
	
	@Test
	void items0Voucher1TShirt10Pants() {
		ICheckout cashier = new Cashier(new PricingRules());
		int totalItems = 0;
		double expectedTotal = 95d;

		// voucher
		totalItems = 0;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.VOUCHER));
		}

		// t-shirt
		totalItems = 1;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.TSHIRT));
		}

		// pants
		totalItems = 10;
		for (int i = 0; i < totalItems; i ++) {
			cashier.scanItem(new Item(Items.PANTS));
		}
		
		Assert.assertEquals(cashier.getTotal(), expectedTotal, 0);		
	}




}
