package Opgave_11;

public class LinearEquation {

    private double a, b, c, d, e, f;

    public LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF){
        this.a = newA;
        this.b = newB;
        this.c = newC;
        this.d = newD;
        this.e = newE;
        this.f = newF;
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

    public double getD(){
        return d;
    }

    public double getE(){
        return e;
    }

    public double getF(){
        return f;
    }


    public boolean isSolvable(){


        return ((a * d) - (b * c) != 0);

    }

    public double getX(){

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));

        return x;
    }

    public double getY(){

        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        return y;
    }



}
