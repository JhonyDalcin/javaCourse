package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("e-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth Date: ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to order: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Enter item #" + i + " data:");
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            OrderItem item = new OrderItem(productQuantity, productPrice, product);
            order.addItem(item);
        }

        System.out.println();
        System.out.println("Order summary:");
        System.out.println(order);
        sc.close();
    }
}
