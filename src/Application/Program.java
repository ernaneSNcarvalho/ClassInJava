package Application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rectangle rect = new Rectangle();
			
		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.heigth = sc.nextDouble();
		
		System.out.printf("AREA = " + String.format("%.2f%n", rect.area()));
		System.out.printf("PERIMETER = " + String.format("%.2f%n", rect.perimeter()));
		System.out.printf("DIAGONAL = " + String.format("%.2f%n", rect.diagonal()));
		sc.close();
	}

}
