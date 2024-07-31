package Application;

import java.util.Scanner;

import entities.Notas;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Notas nota = new Notas();
		
		nota.nome = sc.nextLine();
		nota.nota1 = sc.nextDouble();
		nota.nota2 = sc.nextDouble();
		nota.nota3 = sc.nextDouble();	
		
		if(nota.notaFinal() > 60.0) {
			System.out.printf("FINAL GRADE %.2f%n", nota.notaFinal());
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f%n POINTS", nota.passou());
		}
		
		sc.close();
	}

}
