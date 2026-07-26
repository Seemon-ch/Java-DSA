import java.util.Scanner;

public class PrimeInRange{

    public void primeRange(int num ){
        System.out.println("Prime numbers are:");
        for(int i=2 ; i<=num ; i++ ){
           boolean isPrime = true;
            for(int j=2 ; j<=Math.sqrt(i) ; j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                     System.out.println(i);
                }
        }
        
    }
    public static void main(String args[]){
        try(Scanner sc =new Scanner(System.in)){
            System.out.println("Enter the end of range");
            int endRange =sc.nextInt();

            PrimeInRange pRange = new PrimeInRange();
            pRange.primeRange(endRange);
        }

    }
}