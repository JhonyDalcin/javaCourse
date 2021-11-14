package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;


public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.5));
        list.add(new Product("HD Case", 80.9));

        double pricefilter = 100.00; /*can done by user input too*/
        
        Predicate<Product> pred = p -> p.getPrice() >= pricefilter;

        list.removeIf(pred);

        for (Product p : list){
            System.out.println(p);
        }



    }   
    
}
