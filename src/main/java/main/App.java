package main;

import restaurants.GetRestaurants;

public class App {

	public static void main(String[] args) {
		
		GetRestaurants rst = new GetRestaurants();
		rst.printRestaurants("Italian");
	}
}