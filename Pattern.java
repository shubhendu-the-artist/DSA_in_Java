
public class Pattern {
    public static void main(String[] args) {
        /*
            *****
            *****
            *****
            ***** 
        */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.print('*');
            System.out.print('\n');
        }

        System.out.println();

        /*
         *****
         *   *
         *   *
         *****
         */

        int n = 4, m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m)
                    System.out.print('*');
                else
                    System.out.print(" ");
            }
            System.out.print('\n');
        }

        System.out.println();

        /*
            *
            **
            ***
            ****
        
        */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }

        System.out.println();

        /*
            ****
            ***
            **
            *
        */

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }

        System.out.println();

        /*
               *
              **
             ***
            ****
        */
        n = 4;
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i); k++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }

        System.out.println();

    }
}
