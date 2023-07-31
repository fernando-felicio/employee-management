package entities;

public class Employee {
	
	//Declarando atributos da classe Employee
	String name;
	double grossSalary;
	double tax;
	
	//Criando método netSalary
	
	public double netSalary() {
		double netSalary = grossSalary - tax;
		return netSalary;
	}
	
	//Criando método increaseSalary
	
	public void increaseSalary(double percentage) {
		this.grossSalary =+ percentage;
	}

}
