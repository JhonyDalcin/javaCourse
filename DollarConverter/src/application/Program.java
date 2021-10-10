package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double exchange = sc.nextDouble();
        System.out.print("How many dollar wil be bought: ");
        double amount = sc.nextDouble();

        double reais = CurrencyConverter.calculator(exchange, amount);
        System.out.println();
        System.out.printf("Amount to be paid in reais: %.2f\n", reais);

        sc.close();
    }



}
