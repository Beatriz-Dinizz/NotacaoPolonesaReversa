package controller;

import br.edu.fateczl.pilhaIntString.PilhaInt;

public class NPRController {
	
	public NPRController() {
		super();
	}

	public void inserirValor(PilhaInt pilhaInt, int valor) {
		pilhaInt.push(valor);
	}
	
	public double npr(PilhaInt pilhaInt, String opc) {
		int resultado = 0;
		int valor1 = 0;
		int valor2 = 0;
		
		switch (opc) {
			case "+": 
				try {
					resultado = pilhaInt.pop() + pilhaInt.pop();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			break;
			
			case "-":
				try {
					valor2 = pilhaInt.pop();
					valor1 = pilhaInt.pop();
					resultado = valor1 - valor2;
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			break;
			
			case "*":
				try {
					resultado = pilhaInt.pop() * pilhaInt.pop();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			break;
			
			case "/":
				try {
					valor2 = pilhaInt.pop();
					valor1 = pilhaInt.pop();
					return valor1 / valor2;
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			break;
		}
		
		return resultado;
	}
}	
