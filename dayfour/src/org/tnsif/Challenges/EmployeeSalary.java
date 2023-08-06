package org.tnsif.Challenges;
import java.util.Scanner;
public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter salary between 4500 to 6500");
		double BasicSalary=S.nextDouble();
		if(BasicSalary<4500  || BasicSalary>6500)
		{
		System.out.println("Enter the payment");
		
		}
		double pf=0.02*BasicSalary;
		double ta=0.01*BasicSalary;
		double hra=0.03*BasicSalary;
		double Salary=BasicSalary+pf+ta+hra;
		System.out.println("basic payment:"+BasicSalary);
		System.out.println("pf(2%):"+pf);
		System.out.println("ta(1%):"+ta);
		System.out.println("hra(3%):"+hra);
		System.out.println("Total Salary :"+Salary);
		if (BasicSalary>10000)
		{
			System.out.println((BasicSalary*0.12)-1000+"1000 rs deducted");
		}
	}

}
