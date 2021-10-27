package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

    public static void main(String[] args) {
        
        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(new Circle(2.0));
        shapeList.add(new Rectangle(3.0, 2.0));

        List<Circle> cList = new ArrayList<>();
        cList.add(new Circle(2.0));
        cList.add(new Circle(3.0));

        System.out.println();
        System.out.println("Total Area: " + totalArea(shapeList));
        System.out.println();

        System.out.println();
        System.out.println("Total Area: " + totalArea2(cList));
        System.out.println();
    }

    /*para o método abaixo pode ser instaciada apenas listas do tipo Shape,
    subtipos de shape não podem ser instanciados, para isso deve ser feito 
    um generics extendendo aos subtipos de shape <? extends Shape>. Se for
    feito apenas o generic<?>, caso tente adicionar uma lista de Circle,
    teremos problema de compilação em "Shape s : list*/
    
    public static double totalArea(List<Shape> list){
        double sum = 0.0;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
    }

    public static double totalArea2(List<? extends Shape> list){
        double sum = 0.0;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
