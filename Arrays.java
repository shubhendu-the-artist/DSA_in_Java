
// 2D Arrays in Java
import java.util.*;

public class Arrays {
    public static void main(String[] args) {

        // Declaration 1 -> type[][] arrayName = new type[rows][columns];

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                numbers[i][j] = sc.nextInt();
        }
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(numbers[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
