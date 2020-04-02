package Opgave_10;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value a:");
        double a = input.nextDouble();

        System.out.println("Enter value b:");
        double b = input.nextDouble();

        System.out.println("Enter value c:");
        double c = input.nextDouble();



        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (quadraticEquation.getDiscriminant() > 0){

            System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());

        }else if (quadraticEquation.getDiscriminant() == 0){

            System.out.println("The equation has one root " + quadraticEquation.getRoot1());

        }else {
            System.out.println("The equation has no roots");
        }

    }
}
