//question :- Given two integers low and high, return the sum of all integers from low to high inclusive.
import java.util.Scanner;
class Solution {
    public int forLoop(int low, int high) {
        int sum=0;
        
        while(low <= high){
            sum =sum+low;
            low++;
        }
        return sum;
    }
}

class InsclusiveSum{
    public static void main (String args[]){
        try(Scanner sc = new Scanner(System.in)){
        int low = sc.nextInt();
        int high = sc.nextInt();
        Solution obj = new Solution();
        int res = obj.forLoop(low , high );
        System.out.println("sum is :" + res);
        }

    }
}