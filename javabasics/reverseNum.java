import java.util.Scanner;
public class reverseNum {
//ques:- reverse the number
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rev =0 ;
        while(num >=0){
            int lastDigit = num%10 ;
            rev = rev*10 +lastDigit;
            num = num/10;
        }
        System.out.println(rev);
    }
}
}
