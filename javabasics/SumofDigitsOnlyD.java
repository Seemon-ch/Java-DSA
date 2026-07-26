//question :- Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
import java.util.Scanner;
public class SumofDigitsOnlyD {
    public int sumTillD(int d) {
        int sum=0;
        //As we can see , This question is based on AP: = on caluculating last term = d+ 490 , Hence sum = 50d+12250 (Using AP sum formula);
        //so directly we can do as :- return 5*d +12250 ;
        int i=0;
        while(i<50){
            sum += d + i*10;
            i++;
        }
        return sum;
        
    }

    public static void main (String agrs[]){
        try(Scanner sc = new Scanner(System.in)){
            int d =sc.nextInt();
            SumofDigitsOnlyD obj = new SumofDigitsOnlyD();
            int res = obj.sumTillD(d);
            System.out.println("Result is :" + res) ;
        }
    }
}
