/*
*	Program Name: Frame.java
*	Author: Alex Vaughan
*  Date Modified: 03/15/2017
*  this class provides methods and constructors for use in other programs 
*/

//Frame class
   public class Frame
{

//delcaring instance variables, only accessible through the Frame class
   private float length;
   private float width;
   private float area;
   private char type;
   private int matte;
   private static int count; 
   String typeString;
  
//Frame constructor with no arguments 
   public Frame()
   {
      length = 8;
      width = 10;
      type = 'W';
      matte = 1;
   }

//Frame class with four arguements that set fields appropriately
   public Frame (float inchLength, float inchWidth, char floorType, int layerMatte)
   {
      length = inchLength;
      width = inchWidth;
      type = floorType;
      matte = layerMatte;
   }

//Getter method, returns the area of the frame 
   public float getArea()
   {
      area = length * width;
      return area;
   }

//Getter method, returns the type of frame 
   public char getType()
   {
      return type;
   }

//Getter method, returns number of mattes
   public int getMatte()
   {
     return matte;
   }

//toString method, displays the attributes of the object
   public String toString()
   {

//switch statement
     switch (type)
   {
         case 'w': typeString = "Wood";
         break;
         case 'W': typeString = "Wood";
         break;
         case 'p': typeString = "Plastic";
         break;
         case 'P': typeString = "Plastic";
         break;
         case 'm': typeString = "Metal";
         break;
         case 'M': typeString = "Metal";
         break;
         default: typeString = "Plastic";
         break;
   }

    return "\nLength = " + length + " in." + "\nWidth = " + width +" in." + "\nType = " + typeString + "\nMatte = " + matte;

   }
}
