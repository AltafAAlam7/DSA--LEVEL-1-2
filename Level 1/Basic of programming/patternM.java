// 1. You are given a number n.
// 2. You've to write code to print the pattern given in output format below.
// Input Format
// A number n
// Example n = 3
// Output Format
// *		*	
// *	*	*	
// *		*

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class patternM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==1 || j==n)
                    System.out.print("*\t");
                
                else if((i==j || i+j==n+1) && i<=n/2 + 1)
                    System.out.print("*\t");
                
                else 
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
