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

    //solid rhombus 
    public void pattern5b(int n){
        for(int i=0 ;i<=n ;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //hollow rhombus
    public void pattern5c(int n){
        for(int i=1 ;i<=n ;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 ||i==n ||j==1 ||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
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
            obj.pattern5c(t_r);

        }

    }
}

