package patterns;

import java.util.Scanner;

public class Pattern6 {
    //butterfly pattern

    public void pattern6a(int n){
        for(int i=1; i<=n ;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i) ;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1 ;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i) ;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter total number of rows");
            int t_r = sc.nextInt();
            Pattern6 obj = new Pattern6();
            obj.pattern6a(t_r);
        }

    }
}
