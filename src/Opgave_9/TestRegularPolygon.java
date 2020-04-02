package Opgave_9;

public class TestRegularPolygon {
    public static void main(String[] args) {

        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6,7.8);

        System.out.println("First polygon");
        regularPolygon1.getPerimeter();
        regularPolygon1.getArea();

        System.out.println("\n");

        System.out.println("Second polygon");
        regularPolygon2.getPerimeter();
        regularPolygon2.getArea();

        System.out.println("\n");

        System.out.println("Third polygon");
        regularPolygon3.getPerimeter();
        regularPolygon3.getArea();
    }
}
