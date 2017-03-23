/*
*	Program Name: Family.java
*	Author: Alex Vaughan
*  Date Modified: 02/27/2017
*  this class provides methods and constructors for use in other programs 
*/

//Family class
   public class Family
{

//delcaring some private variables, only accessible through the Family class
   private static int numDependents;
   private static double annualIncome;

//Family class with no arguments 
   public Family()
   {
   numDependents = 1;
   annualIncome = 0;
   }

//Family class with one arguement 
   public Family(double income)
   {
   annualIncome = income;
   numDependents = 1;
   }

//Family class with two arguements 
   public Family (double income, int dependents)
   {
   annualIncome = income;
   numDependents = dependents;
   }

//getter method, gets and returns the number of dependents
   public int getDependents()
   {
   return numDependents;
   }
   
//getter method, gets and returns income
   public double getIncome()
   {
   return annualIncome;
   }
   
//setter method, sets the number of dependents 
   public void setDependents(int aDependent)
   {
   numDependents = aDependent;
   }
   
//setter method, sets the income 
   public void setIncome(double aIncome)
   {
   annualIncome = aIncome;
   }
   
//calculates and returns insurance based on entered rate 
   public static double calcInsurance(double insuranceRate)
   {
   double realRate;
   double finalRate;
   realRate = insuranceRate/100;
   finalRate = numDependents * annualIncome * realRate;
   return finalRate;
   }
   
//calculates and returns insurance with no arguments, amount is fixed to 10%
   public static double calcInsurance()
   {
   double noArgRate;
   noArgRate = numDependents * annualIncome * .10;
   return noArgRate;
   }
   
//calculates and returns withholding based on two arguments 
   public static double calcWithhold(int bDependent, double bIncome)
   {
   numDependents = bDependent;
   annualIncome = bIncome;
   double withholdPercent;
   double withholdAmount;
   withholdPercent = (annualIncome * .22) - 500;
   withholdAmount = withholdPercent * numDependents;
   
   return withholdAmount;
   }
}