package Opgave_1;

public class Firkant {
    double width = 1;
    double height = 1;

    Firkant(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    double getArea(){
        return height * width;
    }

    double getPerimeter() {
        return (height * 2) + (width * 2);
    }


}
