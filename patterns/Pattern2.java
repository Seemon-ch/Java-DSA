package patterns;

import java.util.Scanner;

public class Pattern2 {
//     *
//    ***
//   *****
//  *******
// *********
    public void pattern2a(int n){
        for(int i=0 ; i<n ;i++){
            for(int k=0 ; k<=n-i-1 ;k++){
                System.out.print(" ");
            }
            for(int j=0 ; j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

// *********
//  *******
//   *****
//    ***
//     *

    public void pattern2b(int n){
        int value=n;
        for(int i=0 ; i<n ;i++){
            for(int k=0 ; k<=i;k++){
                System.out.print(" ");
            }
            
            for(int j=0 ; j<2*value-1;j++){
                System.out.print("*");
            }
            System.out.println();
            value--;
        }
        

    }

    public static void main(String arg[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            Pattern2 obj = new Pattern2();
            // obj.pattern2a(n);
            obj.pattern2b(n);

        }

    }
}