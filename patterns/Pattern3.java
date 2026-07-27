package patterns;

import java.util.Scanner;

public class Pattern3 {
//     * 
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     * 

public void pattern3(int n){
        
        for(int i=0; i<=n ;i++){
            for(int k=0 ; k<=n-i-1;k++){
                System.out.print(" ");
            }
            
            for(int j=0 ; j<2*i+1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=n ; i>=0 ; i--){
            for(int k=0 ; k<=n-i-1;k++){
                System.out.print(" ");
            }
            
            for(int j=0 ; j<2*i+1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        
    }
    public static void main(String arg[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            Pattern3 obj = new Pattern3();
            // obj.pattern2A(n);
            obj.pattern3(n);

        }

    }
}
