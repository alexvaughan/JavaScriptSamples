/*	FileName: Pay.java
 * Author: Alex Vaughan
 * Date Modified: 02/20/2017
 * Pay class creates constructors and methods for other programs to use
*/

//Pay class
public class Pay
{

//initializing a few variables 
	public double payRate = 9.75;
   public double hoursWorked = 0;
   public double grossPay;
	
//instance method
//gets hours worked and returns the amount 
	public double getHours()		
	{
		return hoursWorked;
	}
	
//sets hours worked 
	public void setHours(double hours)
	{
		 hoursWorked = hours;
	}

//gets pay rate and returns that amount
	public double getPayRate()
	{
		return payRate;
	}
   
//set pay rate 
	public void setPayRate(double pay)
	{
		payRate = pay;
	}
   
//gets gross pay and returns that amount 
   	public double getGrossPay()
	{
		return grossPay;
	}
	
//calculates gross pay (hours * pay)
	public double calcGrossPay()
	{
		return grossPay = hoursWorked * payRate;
	}
}

