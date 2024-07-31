package entities;

public class Notas {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double passou() {
		if(notaFinal() >= 60.0) {
			return notaFinal();
		}else {
			return 60.0 - notaFinal();
		}
	}
}
