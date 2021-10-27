import entities.Client;

public class App {
    public static void main(String[] args) {
        
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");
        Client c3 = new Client("Maria", "maria@gmail.com");
        Client c4 = new Client("Maria", "maria02@gmail.com");

        String s1 = "Maria";
        String s2 = "Maria";

        String s3 = new String("Bob");
        String s4 = new String("Bob");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));
        System.out.println(c1 == c3);
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

    }
}
