import java.util.Scanner;

/**
   This program demonstrates static methods
   
   // Sushant Khatri
   
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;        // The user's choice
      double value = 0;  // The method's return value
      char letter;       // The user's Y or N decision
      double radius;     // The radius of the circle
      double length;     // The length of the rectangle
      double width;      // The width of the rectangle
      double height;     // The height of the triangle
      double base;       // The base of the triangle
      double side1;      // The first side of the triangle
      double side2;      // The second side of the triangle
      double side3;      // The third side of the triangle

      // Create a scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first.
      do
      {
         // TASK #1 Call the printMenu method
         printMenu();

         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // Store the result in the variable named value.
               value = circleArea(radius);

               System.out.println("The area of the circle is " + value);
               break;
            case 2:
               System.out.print("Enter the radius of the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleCircumference method and
               // Store the result in the variable named value.
               value = circleCircumference(radius);

               System.out.println("The circumference of the circle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // Store the result in the variable named value.
               value = triangleArea(base, height);

               System.out.println("The area of the triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the length of side 1 of the triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of side 2 of the triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of side 3 of the triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the trianglePerimeter method and
               // Store the result in the variable named value.
               value = trianglePerimeter(side1, side2, side3);

               System.out.println("The perimeter of the triangle is " + value);
               break;
            case 5:
               System.out.print("Enter the length of the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // Store the result in the variable named value.
               value = rectangleArea(length, width);

               System.out.println("The area of the rectangle is " + value);
               break;
            case 6:
               System.out.print("Enter the length of the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectanglePerimeter method and
               // Store the result in the variable named value.
               value = rectanglePerimeter(length, width);

               System.out.println("The perimeter of the rectangle is " + value);
               break;
            default:
               System.out.println("You did not enter a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line.

         System.out.println("Do you want to exit the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here

   /**
      Prints the geometry calculator's menu of options to the console.
      This method takes no input and displays the six calculation
      choices along with a prompt asking the user to enter a choice.
   */
   public static void printMenu()
   {
      System.out.println("This is a geometry calculator");
      System.out.println("Choose what you would like to calculate");
      System.out.println("1. Find the area of a circle");
      System.out.println("2. Find the circumference of a circle");
      System.out.println("3. Find the area of a triangle");
      System.out.println("4. Find the perimeter of a triangle");
      System.out.println("5. Find the area of a rectangle");
      System.out.println("6. Find the perimeter of a rectangle");
      System.out.print("Enter the number of your choice: ");
   }

   // TASK #2 Create the value-returning methods here

   /**
      Calculates the area of a circle.
      This method requires the radius of a circle and calculates
      the area of that circle using the formula A = pi * r^2.
      @param radius The radius of the circle.
      @return The area of the circle.
   */
   public static double circleArea(double radius)
   {
      double area = Math.PI * Math.pow(radius, 2);
      return area;
   }

   /**
      Calculates the circumference of a circle.
      This method requires the radius of a circle and calculates
      the circumference of that circle using the formula C = 2 * pi * r.
      @param radius The radius of the circle.
      @return The circumference of the circle.
   */
   public static double circleCircumference(double radius)
   {
      double circumference = 2 * Math.PI * radius;
      return circumference;
   }

   /**
      Calculates the area of a triangle.
      This method requires the base and height of a triangle and
      calculates the area of that triangle using the formula A = 1/2 * b * h.
      @param base The base of the triangle.
      @param height The height of the triangle.
      @return The area of the triangle.
   */
   public static double triangleArea(double base, double height)
   {
      double area = 0.5 * base * height;
      return area;
   }

   /**
      Calculates the perimeter of a triangle.
      This method requires the lengths of the three sides of a triangle
      and calculates the perimeter by adding the three sides together.
      @param side1 The length of the first side of the triangle.
      @param side2 The length of the second side of the triangle.
      @param side3 The length of the third side of the triangle.
      @return The perimeter of the triangle.
   */
   public static double trianglePerimeter(double side1, double side2, double side3)
   {
      double perimeter = side1 + side2 + side3;
      return perimeter;
   }

   /**
      Calculates the area of a rectangle.
      This method requires the length and width of a rectangle and
      calculates the area of that rectangle using the formula A = l * w.
      @param length The length of the rectangle.
      @param width The width of the rectangle.
      @return The area of the rectangle.
   */
   public static double rectangleArea(double length, double width)
   {
      double area = length * width;
      return area;
   }

   /**
      Calculates the perimeter of a rectangle.
      This method requires the length and width of a rectangle and
      calculates the perimeter of that rectangle using the formula
      P = 2 * l + 2 * w.
      @param length The length of the rectangle.
      @param width The width of the rectangle.
      @return The perimeter of the rectangle.
   */
   public static double rectanglePerimeter(double length, double width)
   {
      double perimeter = 2 * length + 2 * width;
      return perimeter;
   }
}
