import java.util.Scanner;

public class binomialCoff {
    public int factorial(int n){
        int fact=1;
        for(int i=1 ;i<=n ;i++){
            fact=fact*i;
        }
        return fact;
    }

    public int bincoff(int n  ,int r)
    {

        int n_ =factorial(n) ;
        int r_ =factorial(r);
        int n_minus_r = factorial(n-r);

        int ans = n/(r * n_minus_r);
        return ans;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        binomialCoff bcoff = new binomialCoff();
        int result= bcoff.bincoff(n,r);
        System.out.println("binomial cofficient is " + result);

        sc.close();
    }
}

