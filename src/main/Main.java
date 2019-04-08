package main;
import entity.Bank;
public class Main {

    public static void main(String[] args) {
        double balance;
        double rate;
        Bank bank = new Bank(1000,  10);
        System.out.println("results: "+bank.calculateInterest());
    }
}
