package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int nemp = sc.nextInt();

        for (int i=0; i<nemp; i++){
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(employees, id)){
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salay: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This Id does not exist!");
        }
        else {
            System.out.print("Enter the porcentage: ");
            double porcentage = sc.nextDouble();
            emp.increaseSalary(porcentage);
        }
        System.out.println("List of Employees: ");
        for (Employee x : employees){
            System.out.println(x);
        }
        sc.close();
    }

    public static boolean hasId (List<Employee> employees, int id) {
        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return  emp != null;
    }
}
