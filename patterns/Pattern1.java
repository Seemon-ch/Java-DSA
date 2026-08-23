package patterns;
import java.util.Scanner;

public class Pattern1 {
    //*****
    //*****
    //*****
    //*****
    //*****
    public void pattern1a(int n){
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
     public void pattern1b(int n){
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
    public void pattern1c(int n){
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
    public void pattern1d(int n){
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
    public void pattern1e(int n){
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
    public void pattern1f(int n){
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
            // obj.pattern1a(n);
            // obj.pattern1b(n);
            // obj.pattern1c(n);
            // obj.pattern1d(n);
            obj.pattern1e(n);
            obj.pattern1f(n);

        }

    }
}
