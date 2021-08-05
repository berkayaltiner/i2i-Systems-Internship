package com.testDrivenDevelopmentExample;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ShoppingBasketTest {

	
	private ShoppingBasket buildBasketWithItems(ArrayList<Item> items) {

		return new ShoppingBasket(items);
	}
	
	
	@Test
	public void totalOfEmptyBasket(){ 
		ShoppingBasket basket = new ShoppingBasket( new ArrayList<Item>() );
		
		assertEquals(0.0, basket.getTotal(), 0.0);

	}
	
	@Test
	public void totalOfSingleBasket() {
		
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item(100.00,1));
		
	    ShoppingBasket basket = buildBasketWithItems(items);
	    
	    assertEquals(100.00, basket.getTotal(),0.0);
	    
	}

	
	@Test
	public void totalOfTwoItems() { 
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item(150.00,2));
		items.add( new Item(100.00, 1));
		
		 ShoppingBasket basket = buildBasketWithItems(items);
		 
		 assertEquals(250.00, basket.getTotal(), 0.0);
		
	}
}