/*
*	Program Name: TestFamily.java
*	Author: Alex Vaughan
*  Date Modified: 02/27/2017
*  this program calcluates values for 3 different families
*  some of the families have default values and some call for values 
*  the program ends by printing number of dependents, annual income, insurance rate, and withholding amount for each family. 
*/

//allows access to classes in java
   import java.text.NumberFormat;
   import java.util.Scanner;
   
//TestFamily class
   public class TestFamily
{

	public static void main(String [] args)
   {

//declaring some variables
   double firstFamIncome;
   double firstFamInsurance;
   double firstFamWithholding;
   
//creating an object of the Family class
   Family firstFam = new Family();

//using the setIncome method to set the income amount 
   firstFam.setIncome(12000);
   firstFamIncome = firstFam.getIncome();

//calculating the insurance rate based on a 6.5% rate 
   firstFamInsurance = Family.calcInsurance(6.5);

//calculating the withholding amount for the first family 
   firstFamWithholding = Family.calcWithhold(1,firstFamIncome);

   System.out.println("FIRST FAMILY: \n");
   
//printing all the information
   printInfo(1,firstFamIncome,firstFamInsurance,firstFamWithholding);

//declaring variables for the second family
   double secondFamInsurance;
   int secondFamDependents;
   double secondFamWithholding;
   
//creating another object of the Family class
   Family secondFam = new Family(25000);
   
//using the setDependent method to set the number of dependents
   secondFam.setDependents(3);
   secondFamDependents = secondFam.getDependents();

//using the calcInsurance method of the Family class to calculate the insurance rate 
   secondFamInsurance = Family.calcInsurance();
   
//calculating the withholding amount of the second family 
   secondFamWithholding = Family.calcWithhold(secondFamDependents,25000);
  
   System.out.println("\nSECOND FAMILY: \n");
   
//printing all of the information
   printInfo(secondFamDependents,25000,secondFamInsurance,secondFamWithholding);
  
//promting user input
   Scanner keyboard = new Scanner(System.in);

//declaring variables that will used as the user input 
   int thirdDependents;
   double thirdAnnual;
   
//prompts user to input the number of dependents
   System.out.println("\nEnter the number of dependents for the third family: ");

//stored as variable thirdDependents
   thirdDependents = keyboard.nextInt();
  
//prompts user to input the annual income
   System.out.println("Enter the annual income of the third family: ");

//stores as thirdAnnual
   thirdAnnual = keyboard.nextInt();
      
//creating another object 
   Family thirdFam = new Family (thirdAnnual,thirdDependents);
   
//declaring variables 
   double thirdFamInsurance;
   double thirdFamWithholding;
   
//calculating the insurance rate of the third family 
   thirdFamInsurance = Family.calcInsurance(7);
   
//calculating the withholding for the third family
   thirdFamWithholding = Family.calcWithhold(thirdDependents,thirdAnnual);
  
   System.out.println("\nTHIRD FAMILY: \n");
   
//printing the information gathered
   printInfo(thirdDependents,thirdAnnual,thirdFamInsurance,thirdFamWithholding);
  }
  
//printInfo method used to print the info for each family
//calls for 4 arguments 
  static void printInfo(int numDep,double numIncome,double numInsurance, double numWithholding)
  {
  
//proper output formatting
  NumberFormat money = NumberFormat.getCurrencyInstance();
  
//declaring variables 
  int numDep1 = numDep;
  double numIncome1 = numIncome;
  double numInsurance1 = numInsurance;
  double numWithholding1 = numWithholding;
  
//output of all finalized values 
  System.out.println("The number of depedents is: " + numDep1); 
  System.out.println("The annual income is: " + money.format(numIncome1));
  System.out.println("The insurance rate is: " + money.format(numInsurance1));
  System.out.println("The amount withholding is: " + money.format(numWithholding1));
  }
  }