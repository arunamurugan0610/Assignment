/**
 * 
 */
package Assignment;

import java.util.Scanner;

public class SchoolGradingSystem {
int mark ;
public void gradingsystem(){
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter your mark");
	 int mark = scanner.nextInt();
	 if (mark<25){
		 System.out.println("The grade is F");
	 }else if (mark>=25 && mark<45){
		 System.out.println("The grade is E");
	 }else if (mark>=45 && mark<50){
		 System.out.println("The grade is D");
	 }else if (mark>=50 && mark<60){
		 System.out.println("The grade is C");
	 }else if (mark>=60 && mark<80){
		 System.out.println("The grade is B");
	 }else{
		 System.out.println("The grade is A");
	 }
}
	
	public static void main(String[] args) {
		SchoolGradingSystem obj = new SchoolGradingSystem();
		obj.gradingsystem();
	}

}
