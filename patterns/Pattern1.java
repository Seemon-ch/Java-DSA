package patterns;
import java.util.Scanner;

public class Pattern1 {
    //*****
    //*****
    //*****
    //*****
    //*****
    public void pattern1A(int n){
        for(int i= 0 ; i<n ;i++){
            for(int j=0 ; j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // *
    // **
    // ***
    // ****
    // *****
     public void pattern1B(int n){
        for(int i= 0 ; i<n ;i++){
            for(int j=0 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // 1
    // 12
    // 123
    // 1234
    // 
    public void pattern1C(int n){
        for(int i=1 ; i<=n ;i++){
            for(int j=1 ; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    // 1
    // 22
    // 333
    // 4444
    // 55555
    public void pattern1D(int n){
        int printValue =1;
        for(int i=1 ; i<=n ;i++){
            for(int j=1 ; j<=i;j++){
                System.out.print(printValue);
            }
            System.out.println();
            printValue++;
        }

    }

    // *****
    // ****
    // ***
    // **
    // *
    public void pattern1E(int n){
        for(int i=0; i<n ; i++){
            for(int j=1 ; j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // 12345
    // 1234
    // 123
    // 12
    // 1
    public void pattern1F(int n){
        for(int i=0; i<n ; i++){
            for(int j=1 ; j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String arg[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            Pattern1 obj = new Pattern1();
            // obj.pattern1A(n);
            // obj.pattern1B(n);
            // obj.pattern1C(n);
            // obj.pattern1D(n);
            obj.pattern1E(n);
            obj.pattern1F(n);

        }

    }
}
