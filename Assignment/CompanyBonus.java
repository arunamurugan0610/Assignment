/**
 * 
 */
package Assignment;

import java.util.Scanner;

public class CompanyBonus {
	int salary;
	int experience;
	
public void bonusForEmloyee(){
	Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter your Salary");
	 int salary = scanner.nextInt();
	 System.out.println("Enter your Year of experience");
	 int experience = scanner.nextInt();
	 if (experience>5){
		 System.out.println("You have an 5% of Bonus");	 
		 int netBonus = salary+(salary*5/100);
		 System.out.println("Your netBonus amount will be "+ netBonus);
	 }else{
		 System.out.println("No Bonus");
	 }
	
}
	public static void main(String[] args) {
		CompanyBonus obj = new CompanyBonus();
		obj.bonusForEmloyee();

	}

}
