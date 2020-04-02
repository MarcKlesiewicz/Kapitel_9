package Opgave_9;

public class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int numberOfSides, double lengthOnSides){
        n = numberOfSides;
        side = lengthOnSides;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int numberOfSides, double lengthOnSides, double xCoordinates, double yCoordinates){
        n = numberOfSides;
        side = lengthOnSides;
        x = xCoordinates;
        y = yCoordinates;
    }

    public int getN(){
        return n;
    }

    public void setN(int newN){
        n = newN;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double newSide){
        side = newSide;
    }

    public double getX(){
        return x;
    }

    public void setX (double newX){
        x = newX;
    }

    public double getY(){
        return y;
    }

    public void setY (double newY){
        y = newY;
    }

    public void getPerimeter(){
        System.out.println("Perimeter: " + n * side);
    }

    public void getArea(){
        System.out.println("Area: " + (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)));
    }

}
