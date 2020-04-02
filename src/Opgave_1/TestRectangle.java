package Opgave_1;

public class TestRectangle {
    public static void main(String[] args) {


        Firkant firkant1 = new Firkant(4, 40);
        System.out.println("This rectangle is " + firkant1.width + " in width " + "and " + firkant1.height + " in height " + "which gives the rectangle an area of " + firkant1.getArea() + " and a perimeter of " + firkant1.getPerimeter());

        Firkant firkant2 = new Firkant(3.5, 35.9);
        System.out.println("This rectangle is " + firkant2.width + " in width " + "and " + firkant2.height + " in height " + "which gives the rectangle an area of " + firkant2.getArea() + " and a perimeter of " + firkant2.getPerimeter());



    }
}
