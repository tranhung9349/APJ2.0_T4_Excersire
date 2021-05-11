package Equation;

import java.util.Scanner;

public class QuadraticEquation {
    float a;
    float b;
    float c;
    double r;
    double r1;
    double r2;
    double delta;

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = (b*b) -(4*a*c);
    }
    public double getRoot() {
        return r = (-b)/2*a;
    }
    public double getRoot1() {
        return r1 = (-b + Math.sqrt(delta))/a*2;
    }
    public double getRoot2() {
        return r2 = (-b - Math.sqrt(delta))/a*2;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        float a = sc.nextFloat();
        System.out.print("Enter b : ");
        float b = sc.nextFloat();
        System.out.print("Enter c : ");
        float c = sc.nextFloat();

        if(a ==0){
            System.out.println("This is not a quadratic equation");
        } else
        if (a!=0) {
            QuadraticEquation equation = new QuadraticEquation(a, b, c);
            double delta = equation.delta;
            if(delta >0) {
                double root1 = equation.getRoot1();
                System.out.println("Root 1 = " + root1);
                double root2 = equation.getRoot2();
                System.out.println("Root 2 = " + root2);
            } else if (delta==0) {
                double root = equation.getRoot();
                System.out.println("Root1 = Root2 = " + root);
            } else {
                System.out.println("No root");
            }
        }
    }

}

