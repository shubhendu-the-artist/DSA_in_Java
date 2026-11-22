import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello world\nI have my own world !!\n");
        // Input
        Scanner sc = new Scanner(System.in); 
        String name1 = sc.next();      // takes a single token as input
        String name2 = sc.nextLine();  // takes complete line as input
        /*
        nextInt()
        nextFloat()
        */

        System.out.println(name1);
        System.out.println(name2);

        sc.close();
    }
}