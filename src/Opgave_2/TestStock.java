package Opgave_2;

public class TestStock {
    public static void main(String[] args) {

        Stock stock1 = new Stock("ORCL", "Oracle Corporation", 34.05, 34.35);

        System.out.println("The previous closing price for " + stock1.name + " was " + stock1.previousClosingPrice + " and the current price is " + stock1.currentPrice);
        System.out.println("The price-change in percentage is " + stock1.getChangePercent() + " %");




    }
}
