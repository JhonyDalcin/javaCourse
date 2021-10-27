import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        /*criar uma lista de inteiros: 1, 2, 3, 4. Criar uma lista de Double: 3.14, 6,28.
        Criar uma lista de objects para serem copiados ambas as listas dentro dessa lista.
        Imprimi lista de object depois de cada cópia. */

        List<Integer> iList = Arrays.asList(1, 2, 3, 4);
        List<Double> dList = Arrays.asList(3.14, 4.28);
        List<Object> oList = new ArrayList<Object>();

        copyList(iList, oList);
        System.out.println();
        printList(oList);
        System.out.println();
        copyList(dList, oList);
        printList(oList);
    }

    public static void copyList(List<? extends Number> sourceList, List<? super Number> destinyList){
        for(Number n : sourceList){
            destinyList.add(n);
        }
    }

    public static void printList(List<? super Number> list){
        for(Object obj : list){
            System.out.print(obj + " ,");
        }
    }

}
