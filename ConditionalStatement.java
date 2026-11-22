import java.util.*;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 18) {
            System.err.println("adult");
        } else {
            System.err.println("not adult");
        }

        sc.close();
    }
}
