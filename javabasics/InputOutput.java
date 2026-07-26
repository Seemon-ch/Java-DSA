import java.util.Scanner;
class InputOutput{
    public void printNumber(Scanner sc){
        int input = sc.nextInt();
        System.out.println(input);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        InputOutput ip = new InputOutput();
        ip.printNumber(sc);
    }
}