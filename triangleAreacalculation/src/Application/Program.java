package Application;

import Entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y; //instanciando novos objetos na classe
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measure 'a' of triangle X: ");
        x.a = sc.nextDouble();
        System.out.println("Enter the measure 'b' of triangle X: ");
        x.b = sc.nextDouble();
        System.out.println("Enter the measure 'c' of triangle X: ");
        x.c = sc.nextDouble();

        System.out.println("Enter the measure 'a' of triangle Y: ");
        y.a = sc.nextDouble();
        System.out.println("Enter the measure 'b' of triangle Y: ");
        y.b = sc.nextDouble();
        System.out.println("Enter the measure 'c' of triangle Y: ");
        y.c = sc.nextDouble();

        sc.close();

        double areaX = x.calcArea();
        double areaY = y.calcArea();

        if (areaX > areaY)
        {
            System.out.printf("Triangle X area: %.2f, bigger than Triangle Y area: %.2f", areaX, areaY);
        }
        else
        {
            System.out.printf("Triangle Y area: %.2f, bigger than Triangle X area: %.2f", areaY, areaX);
        }
    }
}
