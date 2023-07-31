package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter employee data: ");
		
		//Recebe input e atribui ao nameEmployee name da classe Employee
		System.out.println("Name: ");
		employee.nameEmployee = sc.nextLine();
		
		//Recebe input e atribui ao grossSalary da classe Employee
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		//Recebe input e atribui ao tax da classe Employee
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		sc.nextLine();
		
		//Recebe input e atribui ao ageEmployee da classe Employee 
		System.out.println("Age: ");
		employee.ageEmployee = sc.nextInt();
		sc.nextLine();
		
		//Recebe input e atribui ao functionEmployee da classe Employee
		System.out.println("Function: ");
		employee.functionEmployee = sc.nextLine();
		
		//Recebe input e atribui ao admissionDate da classe Employee
		System.out.println("Admission Date: ");
		employee.admissionDate = sc.nextLine();
		
		//Retorna os dados atualizados da classe Employee após input
		employee.showEmployeeData();
		
		//Input que atribui a porcentagem de aumento do salário
		System.out.println("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		//Retorna os dados atualizados após aumento do salário bruto
		System.out.printf("Updated Data: ");
		employee.showEmployeeData();
		
		sc.close();

	}

}
