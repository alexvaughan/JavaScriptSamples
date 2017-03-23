/*FileName: TestPay.java
 *Author: Alex Vaughan
 *Date Modified: 02/20/2017
 *Description: This program sets some variables to different amounts than the Pay class that is used 
 *It outputs the amounts for each employee involved 
*/

//import proper money format on output 
import java.text.NumberFormat;

//TestPay class
public class TestPay
{

//main method
	public static void main(String[] args)
	{

//declares and allocates new Pay class instances
		Pay emp1 = new Pay();		
		Pay emp2 = new Pay();	

//sets some of the constructors to different amounts 
      emp2.setHours(36);
		emp1.setHours(48);			
		emp2.setPayRate(15.6);			
		
//calls for getter/calculation methods
      emp1.getHours();
      emp2.getHours();
      emp1.getPayRate();
      emp2.getPayRate();
      emp1.calcGrossPay();
		emp2.calcGrossPay();

//sets the output to a proper format 
      NumberFormat money = NumberFormat.getCurrencyInstance();

//output of both employee's hours worked
		System.out.println("Employee 1 hours worked = " + emp1.getHours() + "/week");
		System.out.println("Employee 2 hours worked = " + emp2.getHours() + "/week");
      
//output of both employee's pay rate 
      System.out.println("\nEmployee 1 pay rate = " + money.format(emp1.getPayRate()) + "/hr");
		System.out.println("Employee 2 pay rate = " + money.format(emp2.getPayRate()) + "/hr");

//output of both employee's gross pay 
		System.out.println("\nEmployee 1 gross pay = " + money.format(emp1.calcGrossPay()) + "/week");
		System.out.println("Employee 2 gross pay = " + money.format(emp2.calcGrossPay()) + "/week");
	}
}