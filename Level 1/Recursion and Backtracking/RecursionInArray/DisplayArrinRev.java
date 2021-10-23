import java.util.Scanner;

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print the elements of array from end to beginning each in a separate line.
// 4. For the above purpose complete the body of displayArrReverse function. Don't change the signature.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A number n
// n1
// n2
// .. n number of elements
// Output Format
// n1
// n2
// .. n elements

public class DisplayArrinRev {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=scn.nextInt();
        
        displayArrReverse(arr, 0);
        scn.close();
    }

    public static void displayArrReverse(int[] arr, int idx) {

        if(idx == arr.length)
            return ;
        
        displayArrReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }

}
