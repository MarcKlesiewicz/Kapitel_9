package Opgave_4;
import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {

        Random generator = new Random(1000);

        for (int i = 0; i < 50 ; i++) {
            System.out.println(generator.nextInt(100) + " ");

        }

    }
}
