// Yael Moreno, Gael Reyes, Karen Llamas
import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation
{
   public static void main(String[] args)
   {
	   // Input from user
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a value for a: ");
      double a = input.nextDouble();
      if (a<=0){
      	System.out.println("aahh");
      	System.exit(0);
      }
      System.out.println("Enter a value for b: ");
      double b = input.nextDouble();
      System.out.println("Enter a value for c: ");
      double c = input.nextDouble();
      input.close();
      
      // Discriminant
      double disc = (b*b) - (4*a*c);
      // If discriminant is a negative
      if (disc <0) {
    	  System.out.println("Your discriminant is a negative :(");
    	  System.out.println("It's a complex number");
    	  System.exit(0);
      }
      // If discriminant is zero
      if (disc ==0) {
    	  double x1 = (-b + Math.sqrt(disc))/ (2*a);
    	  System.out.println("Single Root!");
    	  System.out.println("X1 = " + x1);
      }
      // If discriminant is a positive
      if (disc >0) {
    	  double x1 = (-b + Math.sqrt(disc))/ (2*a);
    	  double x2 = (-b - Math.sqrt(disc))/ (2*a);
    	  System.out.println("Solutions :)");
    	  System.out.println("X1 = " + x1);
    	  System.out.println("X2 = " + x2);
    	  
      }
   }
}
