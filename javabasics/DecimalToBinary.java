//convert decimal to binary number

import java.util.Scanner;

public class DecimalToBinary {
    public void convertToBinary(int binNum){
        int sum=0;
        int pow =0;
        while(binNum > 0){
            int lastDigit = binNum % 2;
            sum = sum + (lastDigit *(int)Math.pow(10,pow));
            pow++;
            binNum =binNum/2;
        }
        System.out.println("Binary number is: "+ sum);
        
    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter decimal number");
            int binNum = sc.nextInt();

            DecimalToBinary obj = new DecimalToBinary();
            obj.convertToBinary(binNum);
        }
    }
}
