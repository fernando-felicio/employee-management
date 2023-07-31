package entities;

public class Employee {
	
	//Declarando atributos da classe Employee
	public String nameEmployee;
	public double grossSalary;
	public double tax;
	public int ageEmployee;
	public String functionEmployee;
	public String admissionDate;
	
	//Criando método netSalary
	
	public double netSalary() {
		double netSalary = grossSalary - tax;
		return netSalary;
	}
	
	//Criando método increaseSalary
	
	public void increaseSalary(double percentage) {
		percentage =+ (grossSalary * percentage / 100);
		grossSalary += percentage;
	}
	
	public void showEmployeeData() {
		System.out.printf("Employee: %s, "
				+ "Salary: R$%.2f, "
				+ "Age: %d, "
				+ "Function: %s, "
				+ "Admission "
				+ "Date: %s%n", 
				nameEmployee, netSalary(), ageEmployee, functionEmployee, admissionDate);
	}

}
