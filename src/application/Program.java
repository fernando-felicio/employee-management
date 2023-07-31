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
		
		sc.close();

	}

}
