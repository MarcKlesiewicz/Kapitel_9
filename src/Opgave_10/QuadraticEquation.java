package Opgave_10;

public class QuadraticEquation {

    private double a, b, c;

    public QuadraticEquation(double newA, double newB, double newC){
        a = newA;
        b = newB;
        c = newC;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        double discriminant = Math.pow(b,2) - (4 * a * c);

        return discriminant;
    }

    public double getRoot1(){
        double root1 = (-b + Math.sqrt(Math.pow(b,2) - (4 * a * c)) / (2 * a));

        return root1;
    }

    public double getRoot2(){
        double root2 = (-b - Math.sqrt(Math.pow(b,2) - (4 * a * c)) / (2 * a));

        return root2;
    }

}
