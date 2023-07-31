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
		
		//Retorna os dados atualizados da classe Employee após input
		employee.showEmployeeData();
		
		//Input que atribui a porcentagem de aumento do salário
		System.out.println("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		employee.showEmployeeData();
		
		sc.close();

	}

}
