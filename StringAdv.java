
public class StringAdv {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // character at index 0
        System.out.println(sb.charAt(0)); 
        // set charecter at  index 0
        sb.setCharAt(0, 'S');
        System.out.println(sb);
        // insert at index 2
        sb.insert(2, 'n');
        System.out.println(sb);
        // delete a substring
        sb.delete(2, 3);
        System.out.println(sb);
        // append a string
        sb.append(" Live");
        System.out.println(sb);

        System.out.println("Reverse a String");
        StringBuilder word = new StringBuilder("hello");

        for(int i=0; i<word.length()/2;i++ )
        {
            int front = i;
            int back = word.length()-1-i;

            char frontChar = word.charAt(front);
            char backChar = word.charAt(back);

            word.setCharAt(front, backChar);
            word.setCharAt(back, frontChar);
        }
        System.out.println(word);

    }
    
}