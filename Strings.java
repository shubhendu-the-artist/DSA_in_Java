import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // String Declaration
        String actor = "Tony Stark";
        System.out.println(actor);


        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Your name is : " + name);
        sc.close();

        // concatination
        String firstName = "Peter";
        String lastName = "Parker";
        String fullName = firstName + " " + lastName;

        int length= fullName.length(); // length function on string
        System.out.println(length);

        for(int i=0; i<length; i++){
            System.out.println(fullName.charAt(i)); // charAt function on string
        }

        /*
            compareTo() function

            s1 > s2 : +ve value
            s1 = s2 : 0
            s1 < s2 : -ve value

        */
        String sentence = "Good Day";
        String word = sentence.substring(5);  // substring(start index, end index)
        System.out.println(word);

    }
}
