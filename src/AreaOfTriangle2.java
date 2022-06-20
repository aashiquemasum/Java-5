import java.util.Scanner;

public class AreaOfTriangle2 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter length of first side of triangle:");
        double a = sn.nextDouble();

        System.out.println("Enter length of second side of triangle:");
        double b = sn.nextDouble();

        System.out.println("Enter length of third side of triangle:");
        double c = sn.nextDouble();

        AreaOfTriangle2 at   = new AreaOfTriangle2();
        if(at.isTriangleValid(a, b, c)) {
            double area = at.calculateArea(a,b,c);
            System.out.println("Area = "+area);
        }else {
            System.out.println("Sides entered cannot form a triangle!");
        }

    }

    ///**
    //* Calculates area of a triangle using length of its 3 sides
    //*/
    private double calculateArea(double a, double b, double c) {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    // /**
    // * Checks whether the 3 sides can form a triangle
    //* The sum of any two sides must be greater than the other side
    //* @param a
    //* @param b
    //* @param c
    // * @return
    //*/
    private boolean isTriangleValid(double a, double b, double c) {
        if((a+b)>c && (a+c)>b && (b+c)>a) {
            return true;
        }else {
            return false;
        }
    }
}