package com.testDrivenDevelopmentExample;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import com.testDrivenDevelopmentExample.Item;

public class ShoppingBasket {

    private final ArrayList<Item> items;

	

	public ShoppingBasket(ArrayList<Item> items) {
		this.items = items;
	}

	public double getTotal() {
		double total = 0;
		
		if(!items.isEmpty())
		{
		  for(Item item : items){
			total += item.getUnitPrice();
		}
		return total;
		}
		else 
		{
			return 0.0;
		}
	}

}
