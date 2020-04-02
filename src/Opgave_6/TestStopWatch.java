package Opgave_6;

public class TestStopWatch {

    public static void main(String[] args) {


        int[] randomArray = new int[100000];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        selectionSort(randomArray);
        stopWatch.stop();
        System.out.println("Time  elapsed storting 100000 random integers: " + stopWatch.getElapsedTime() + " milliseconds ");

        for (int i = 0; i < randomArray.length; i++) {

            System.out.printf("%6d ", randomArray[i]);
            if ((i + 1) % 10 == 0) System.out.printf("\n");

        }
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int currentMin = array[i];
            int currentIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                array[currentIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }
}
