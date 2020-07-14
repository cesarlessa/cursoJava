package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		
		System.out.println("GROSS SALARY: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.println("TAX: ");
		emp.tax= sc.nextDouble();
		
		System.out.println("Employee: " + emp);
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		emp.IncreaseSalary(percentage);
		
		System.out.println("Updated Data: " + emp);
		
		sc.close();
		
		
		
		
	}

}
