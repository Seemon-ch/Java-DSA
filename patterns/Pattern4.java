package patterns;

import java.util.Scanner;

public class Pattern4 {
    //print hollow rectangle
    public void pattern4a(int t_r ,int t_c){
        for(int i=0;i<t_r ;i++){
            for(int j=0;j<t_r;j++){
                if(i==0 ||i==t_r ||j==0 ||j==t_c){
                    System.out.print("*");
                }
                else{
                    System.out.print("");
                }
            }
        System.out.println();
        }
    }
    public static void main(String arg[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter total number of rows");
            int t_r = sc.nextInt();
            System.out.println("enter total number of column");
            int t_c = sc.nextInt();
            Pattern4 obj = new Pattern4();
            
            obj.pattern4a(t_r ,t_c);

        }

    }
}
