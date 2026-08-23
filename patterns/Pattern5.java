package patterns;

import java.util.Scanner;

public class Pattern5{
    //0-1 TRIANGLE 
    public void pattern5a(int n){

        for(int i=0 ;i<n ;i++){
            for(int j=0;j<=i ;j++){
                if((i+j)%2==0){
                System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter total number of rows");
            int t_r = sc.nextInt();
            Pattern5 obj = new Pattern5();
            obj.pattern5a(t_r);

        }

    }
}

