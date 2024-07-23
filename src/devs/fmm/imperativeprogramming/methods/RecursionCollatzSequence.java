package devs.fmm.imperativeprogramming.methods;

public class RecursionCollatzSequence {

    static int collatz(long n){
        if(n==1){
            return 1;
        }

        if(n%2==0){
            System.out.print(n/2);
            return collatz(n/2);
        } else{
            System.out.print(3*n+1);
            return collatz(3*n+1);
        }

    }
    public static void main(String[] args) {

        System.out.println("Enter a number");

        long n = new java.util.Scanner(System.in).nextLong();

        collatz(n);
    }
}
