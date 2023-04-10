import java.util.*;
interface Salary
{	double calculate();
	void show();
}

class Manager implements Salary
{
	String managerName;
	String deptName;
	double basicSalary; 
	double hra;
	double pf;
	
	Manager(String name, String dept, double salary)
	{
	this.managerName=name;
	this.deptName=dept;
	this.basicSalary=salary;
	hra=basicSalary*0.08;
	pf=basicSalary*0.1;
	}
	
	public double calculate()
	{
	return((basicSalary+hra)-pf);
	}
	
	public void show()
	{
	System.out.println("Manager");
	System.out.println("Name: " + managerName);
	System.out.println("Department: " + deptName);
	System.out.println("Total salary: " + (float) calculate()); 
	}
}

class Employee implements Salary
{
	String name;
	String deptName;
	double basicSal; 
	double hra;
	double pf;
	
	Employee(String name, String dept, double sal)
	{
	this.name=name;
	this.deptName=dept;
	this.basicSal=sal;
	hra=basicSal*0.05;
	pf=basicSal*0.07;
	}
	
	public double calculate()
	{
	return((basicSal+hra)-pf);
	}
	
	public void show()
	{
	System.out.println("Employee");
	System.out.println("Name: " + name);
	System.out.println("Department: " + deptName);
	System.out.println("Total salary: " + (float) calculate()); 
	}
}

public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name= in.nextLine();
		System.out.print("Enter Dept name: ");
		String dept= in.nextLine();
		System.out.print("Enter your basic salary: ");
		int salary= in.nextInt();
		System.out.print("Are you Manager?(true/false): ");
		boolean isManager= in.nextBoolean();
		if(isManager)
		{
			Manager obj=new Manager(name, dept, salary);
			System.out.println();
			obj.show();
			
		}
		else
		{
			Employee obj=new Employee(name, dept, salary);
			System.out.println();
			obj.show();
		}
		in.close();
	}
}
