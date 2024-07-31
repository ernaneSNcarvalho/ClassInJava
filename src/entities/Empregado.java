package entities;

public class Empregado {
	public String name;
	public double GrossSalary;
	public double tax;
	
	public double netSalary() {
		return GrossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage /100.00;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f%n", netSalary());
	}
}
