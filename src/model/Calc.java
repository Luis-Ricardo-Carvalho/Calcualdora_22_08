package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Calc {
	
	private List<String> lastOperations;
	
	public Calc() {
		lastOperations = new ArrayList<String>();
	}
	
	public double sum(double n1, double n2) {
		double sum = n1+n2;
		
		saveOperation(n1, "+", n2, sum);;
		
		return sum;
	}
	
	public double sub(double n1, double n2) {
		double sub = n1-n2;
		
		saveOperation(n1, "-", n2, sub);;
		
		return sub;
	}
	
	public double mul(double n1, double n2) {
		double mult = n1*n2;
		
		saveOperation(n1, "*", n2, mult);;
		
		return mult;
	}
	
	public double div(double n1, double n2) {
		if (n1 <= 0)
			throw new IllegalArgumentException("Numerador inválido");
		if (n2 <= 0)
			throw new IllegalArgumentException("Denominador inválido");
		
		double div = n1/n2;
		
		saveOperation(n1, "/", n2, div);;
		
		return div;
	}
	
	public List<String> getLastOperations(){
		List<String> copyLastOperations = new ArrayList<>();
		
		for (String operation : lastOperations) {
			copyLastOperations.add(operation);
			
		}
		
		return copyLastOperations;
	}
	
	private void saveOperation(double n1, String operation, double n2, double result) {
		
		String operationStr = String.format
				("Operação: %.2f %s %.2f = %.2f", n1, operation, n2, result);
		
		lastOperations.add(operationStr);
		
	}
	


}
