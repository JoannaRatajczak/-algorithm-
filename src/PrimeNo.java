import java.util.Scanner;

public class PrimeNo {

    public static boolean isPrime (int x){

        if (x<2) return false;
        else {
            for(int i=2;(i*i)<=x;i++) //wszystkie z przedziału od 2 ... x^(-0,5)
            {
                if(x%i==0) return false;
            }
            return true;}
    }

    public static void main(String[] args){

        System.out.println("Number 1");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Number 2");
        int m = scanner.nextInt();

        for (int i = n; i <= m; i++) {
            if (isPrime(i)) System.out.println(i);
        }
        System.out.println();
    }
}
