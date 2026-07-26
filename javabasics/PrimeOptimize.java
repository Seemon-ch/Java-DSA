//Code to check prime number (optimized one).
import java.util.Scanner;
public class PrimeOptimize {

    //Not optimized code.
    // public boolean isPrime(int num){
    //     if(num <=1){
    //         return false;
    //     }
    //     for(int i=2 ; i <num-1 ;  i++){
    //         if(i%2==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    //optimized code.
    boolean isPrime=true;
    public boolean findPrime(int num){
        for(int i=2 ; i<Math.sqrt(num) ; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(num<=1){
            isPrime=false;
        }
        return isPrime;

    }
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        PrimeOptimize prime = new PrimeOptimize();
        boolean result =prime.findPrime(num);
        if(result==false){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Prime number");
        }

        sc.close();
    }
}
