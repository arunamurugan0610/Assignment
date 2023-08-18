/**
 * 
 */
package Assignment;

import java.util.Scanner;

public class WorkArea {
int age;
int maritalStatus;
int gender;
public void workAreaAllotment(){
	Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter your Gender");
	 int gender = scanner.next().charAt(0);
	 System.out.println("Enter your Marital Status");
	 int maritalStatus = scanner.next().charAt(0);
	 System.out.println("Enter your Age");
	 int age = scanner.nextInt();
	 if (gender=='F'){
			System.out.println("You may work urban area");
		}
if (gender=='M'){
	if(age>=20 && age<40){
		System.out.println("You may work anywhere");
	}else if(age>=40 && age<60){
		System.out.println("You may work urban area");
	}else{
		System.out.println("Error");
	}
}

    }
	public static void main(String[] args) {
		WorkArea obj = new WorkArea();
		obj.workAreaAllotment();
	}

}
