package Application;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Product #" +i +" data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char c = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (c == 'i'){
                System.out.print("Customs Fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);
            }
            else {
                if (c == 'u'){
                    System.out.print("Manufacture Date (DD/MM/YYYY): ");
                    Date manufactureDate = sdf.parse(sc.next());
                    Product product = new UsedProduct(name, price, manufactureDate);
                    products.add(product);
                }
                else {
                    Product product = new Product(name, price);
                    products.add(product);
                }
            }
        }

        System.out.println("Price TAG:");
        for (Product product : products){
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}
