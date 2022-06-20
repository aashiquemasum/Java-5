import java.util.Scanner;

public class AreaOfTriangle1 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter base of triangle:");
        double base = sn.nextDouble();

        System.out.println("Enter vertical height of triangle:");
        double verticalHeight = sn.nextDouble();

        AreaOfTriangle1 at   = new AreaOfTriangle1();
        double area = at.calculateArea(base,verticalHeight);

        System.out.println("Area = "+area);

    }

   // /**
    // * Calculates area of a triangle using base and vertical height
     //* @param base
    // * @param verticalHeight
    // * @return
   //  */
    private double calculateArea(double base, double verticalHeight) {
        return base*verticalHeight/2;
    }
}
//However if you don't know base and vertical height, you can also calculate area of a triangle using Heron's formula. This requires the length of all three sides of the triangle. According to heron's formula, the area of a triangle with 3 sides a, b and c is,

///        Area = square root of (p*(p-a)*(p-b)*(p-c)) (where p = (a+b+c)/2).

 //       The following sample Java program calculates the area of a triangle given the length of its 3 sides. The following Java program also checks whether the given 3 sides can form part of a triangle. For a triangle, the sum of its 2 sides will always be greater than the third side.

  //      import java.util.Scanner;

///**
 //* Calculates area of triangle in Java given its 3 sides.
 //* @author jj
 //*/



