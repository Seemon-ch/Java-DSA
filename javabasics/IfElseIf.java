import java.util.Scanner;
public class IfElseIf {

    public void studentGrade(int marks) {

        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 70) {
            System.out.println("Grade B");
        }
        else if (marks >= 50) {
            System.out.println("Grade C");
        }
        else if (marks >= 35) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
    //used try with resources
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("marks = ");
        int marks = sc.nextInt();

        IfElseIf obj = new IfElseIf();
        obj.studentGrade(marks);

        sc.close();
        }
    }
}

