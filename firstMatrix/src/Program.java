import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Matrix dimensions: " + matrix.length);

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print("Position " + i + "," + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number to check: ");
        int number = sc.nextInt();
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix.length; j++){
                if (matrix[i][j] == number){
                    System.out.println("Position in Matrix: " + i + "," + j);
                    if (j > 0){
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if (i > 0){
                        System.out.println("UP: " + matrix[i-1][j]);
                    }
                    if (j < matrix[i].length-1){
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if (i < matrix.length-1){
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
