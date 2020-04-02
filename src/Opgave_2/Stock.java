package Opgave_2;

public class Stock {

    String symbol = " ";
    String name = " ";
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName, double newPreClosingprice, double newCurrentPrice){
        symbol = newSymbol;
        name = newName;
        previousClosingPrice = newPreClosingprice;
        currentPrice = newCurrentPrice;

    }

    double getChangePercent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }



}
