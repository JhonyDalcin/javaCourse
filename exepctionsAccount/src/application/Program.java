package application;

import model.entities.Account;
import model.exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        try{
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.printf("New Balance: %.2f",acc.getBalance());
        }
        catch (DomainException e){
            System.out.println("Withdraw Error: " +e.getMessage());
        }
        sc.close();
    }

}
