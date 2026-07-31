import java.util.Scanner;
//convert binary number to decimal number
public class BinarytoDecimal {
    public void convertToDecimal(int binNum){
        int sum=0;
        int pow =0;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            sum = sum + (lastDigit *(int)Math.pow(2,pow));
            pow++;
            binNum =binNum/10;
        }
        System.out.println("Decimal number is: "+ sum);
        
    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter binary number");
            int binNum = sc.nextInt();

            BinarytoDecimal obj = new BinarytoDecimal();
            obj.convertToDecimal(binNum);
        }
    }

}
