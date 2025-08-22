package view;

import model.Calc;

public class Main {

	public static void main(String[] args) {
		Calc c = new Calc();
		
		System.out.println(c.sum(10, 5));	
		System.out.println(c.sum(20, 10));
		System.out.println(c.sub(30, 5));		
		
		System.out.println(c.mul(10, 5));	
		System.out.println(c.div(20, 10));
		System.out.println(c.div(5, 2));
		

		System.out.println("Histórioco de operações 1");
		
		for (String operation: c.getLastOperations()) {
			System.out.println(operation);
		}
		

	}

}
