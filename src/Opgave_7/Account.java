package Opgave_7;

import java.util.Date;

public class Account {

    protected int Id;
    protected double Balance;
    protected double annualInterestRate;
    protected Date dateCreated;


    public Account(int newId, double newBalance) {
        Id = newId;
        Balance = newBalance;
    }



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return Balance * (annualInterestRate / 12) / 100;
    }

    public void withdraw(double amount) {
        Balance -= amount;
    }

    public void deposit(double amount) {
        Balance += amount;
    }

}