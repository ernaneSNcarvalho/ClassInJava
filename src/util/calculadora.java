package util;

public class calculadora {
	public static double IOF = 0.06;
	
	public static double conversor(double montante, double valor) {
		return montante * valor * (1.0 * IOF); 
	}
}
