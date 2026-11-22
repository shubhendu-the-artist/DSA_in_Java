public class Array {
    public static void main(String[] args) {
        
        // List of items of the same type

        //Defining an array (1) -> type[] arrayName = new type[size];
        
        int[] marks = new int[3];
        marks[0] = 97; // physics
        marks[1] = 98; // chemistry
        marks[2] = 95; // english

        System.out.println(marks); // prints an address [I@3e77a1ed
        for(int i=0; i<3; i++)
            System.out.println(marks[i]);


        //Defining an array (2) -> type[] arrayName = {1, 2, 3, 4, 5, 6};
        
        int score[] = {70, 75, 78};

        for (int index = 0; index < score.length; index++) {
            System.out.println(score[index]);
        }

    }
}
