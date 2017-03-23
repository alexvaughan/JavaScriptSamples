/*
*  Program Name: TestFrame.java
*  Author: Alex Vaughan
*  Date Modified: 03/15/2017
*  this program calculates the cost of having a framed picture for customers 
*  after user input, the program will calculate the cost of the framing  
*  the user will be allowed to order a second frame if desired 
*/

//Allows access to classes in java
   import java.text.NumberFormat;
   import java.util.Scanner;
   import java.io.*;
   
//TestFrame class
   public class TestFrame
{

//Main method
   public static void main(String [] args)
   {
   
//Declaring variables and objects used in the program
      double frameType;
      Frame one;
   
//Allows user input
      Scanner scan = new Scanner(System.in);
   
//Assigning the object the makeFrame() method which prompts user to introduce attributes to the specific frame 
      one = makeFrame();
  
//Allowing the return of the total cost of the frame based on attributes when the object is called through the calcCost() method
      frameType = calcCost(one);

//Asks the user if he/she would like to order a second frame 
//If yes, the program will prompt the same questions and return the values
//If no, the program will end 
		System.out.print("\n\n\nDo you want to order another frame? (Y/N)");
		String ans = scan.nextLine();
		char answer = ans.charAt(0);
		if (answer == 'Y'  ||  answer == 'y')
		{
			one = makeFrame();
         frameType = calcCost(one);					
		}
   }
   
//makeFrame() method
//This method prompts the user for attribute input and stores the values through the Frame class where they can be used in the TestFrame class
   public static Frame makeFrame()
   {

//Scanners for input, allows for char input 
      Scanner scan = new Scanner(System.in);
      Scanner inputDevice = new Scanner(System.in);

//Variables that will store values 
//Values will be passed to and from the Frame and TestFrame classes
      float length;
      float width;
      char type;
      int matte;
      String inputString;
      Frame one;
   
//Prompts user for input 
      System.out.print("Enter, in inches, the lenth of the frame: ");
      length = scan.nextFloat();
      System.out.print("Enter, in inches, the width of the frame: ");
      width = scan.nextFloat();
      System.out.print("Enter the type of frame (W)ood, (P)lastic, (M)etal: ");
      inputString = inputDevice.nextLine();
      type = inputString.charAt(0);
      System.out.print("Enter the desired number of mattes: ");
      matte = scan.nextInt();

//Instantation of a new Frame object with the attributes drawn from user input
      one = new Frame(length,width,type,matte);
      
//Output of the properties of the new Frame (optional)
      System.out.print(one);

//Returns the object to main
      return one; 
   }   

//calcCost method
//Determines price of frame based on user input 
   public static double calcCost(Frame one1)
   {
   
//Allows for proper output of currency values 
      NumberFormat money = NumberFormat.getCurrencyInstance();

//Price variable
      double price;

//Variable that uses the getType() method from the Frame class to determine the price of the frame 
      char zip = one1.getType();

//If statement
//Depending on the type of frame, the price differs
//The price will be stored for later use and the type will be printed 
      if (zip == 'w'||zip =='W')
      {
         price = 22;
         System.out.print("\n\nFrame type: Wood");
      }
         else
         {
            if (zip == 'm'||zip == 'M')
            {
               System.out.print("\n\nFrame type: Metal");
               price = 33;
            }
               else
               {
                  if (zip == 'p'||zip =='P')
                  {
                     System.out.print("\n\nFrame type: Plastic");
                     price = 10;
                  }
                     else
                     {
                        System.out.print("\n\nFrame type: Plastic");
                        price = 10;
                     }
               }
         }

//Variable that uses the getArea() method to determine the area and if the price will be increased if the frame is considered large 
      float are = one1.getArea();

//Output of the area
      System.out.print("\nArea of this frame: " + are + " square inches");

//If statement
//If the area is greater than 100 square inches there is an additional $12.50 added to the price of the frame 
//If the area is less than 100 square inches the price remains the same as the original 
      if (are > 100)
      {
         System.out.print("\nThere is an extra $12.50 charge for large frames (area exceeding 100 inches) !");
         price = price + 12.50;
         System.out.print("\nFrame price: " + money.format(price));
      }
      else
         System.out.print("\nFrame price: " + money.format(price));

//Variable that uses the getMatte() method of the Frame class to determine the number of mattes desired by the user
//The first matte is free, any additional matte is a charge of $7.50 for each matte up to 5 mattes
//After the fifth matte, the price stays at the rate of 5 mattes
      int matt = one1.getMatte();
      double total= 0;

      System.out.print("\nNumber of mattes purchased for this frame: " + matt);

//If else statement 
//Caculates the price of the mattes

      if (matt > 1 && matt < 6)
      {
         total = matt * 7.25;
         System.out.print("\nCost of additional mattes: " + money.format(total));
      }
         else if (matt < 2)
         {
            System.out.print("\nNo charge for matte!");
         }
            else
            {
               total = 5 * 7.25;
               System.out.print("\nCost of additional mattes: " + money.format(total));
            }

//Variable declaration
//Determines the total price of the sale with the price of the frame, area of the frame, and the number of mattes purchased
      double totalSale;
      totalSale = price + total;
      
//Output of the total sale
      System.out.print("\n\nTotal price of the sale: " + money.format(totalSale));

//Returns total sale with all conditions considered
      return totalSale;

   }
}








