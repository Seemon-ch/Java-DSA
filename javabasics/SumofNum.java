import java.util.Scanner;
//ques:- print the sum of n natural number
public class SumofNum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n =sc.nextInt();
            int sum =0 ;
            int i =1;
            while(i<=n){
                sum+=i;
                i++;
            }
            System.out.println("SUM is:" + sum);
        }
    }
}
