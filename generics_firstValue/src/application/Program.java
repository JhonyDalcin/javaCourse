package application;

import java.util.Scanner;

import model.PrintService;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How Many Values? ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            Integer value = sc.nextInt();
            ps.addValue(value);
        }
        
        ps.print();
        Integer first = ps.first();
        System.out.println("First: "+ first);

        sc.close();
    }
    
}
