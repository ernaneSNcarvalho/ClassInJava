package Application;

import java.util.Scanner;

import util.calculadora;

public class programing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotação do dolar? ");
		double valor = sc.nextDouble();
		System.out.print("Quantos dolares vai comprar? ");
		double montante = sc.nextDouble();
		double resultado = calculadora.conversor(montante, valor);
		System.out.printf("Montante a ser pago em reais = %.2f%n", resultado);
		
		sc.close();
	}

}
