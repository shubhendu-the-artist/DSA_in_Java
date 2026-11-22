public class Function {
    
    public static void calculateFactorial(int n){
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact= fact*i;
        }
        System.out.println("factorial of " + n + "is " + fact);
    }

    public static void main(String[] args) {
        calculateFactorial(5);
    }
}
