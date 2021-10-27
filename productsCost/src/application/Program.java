package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import services.CalculationService;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        sc.nextLine();
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                String[] fileds = line.split(",");
                list.add(new Product(fileds[0], Double.parseDouble(fileds[1]));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most Expensive: ");
            System.out.println(x);
        }

        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }




    }
    
}
