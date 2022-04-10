import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //write your code here
    int ans = 0;
    while(n>0){
        int mask = ~(n & -n);
        n = (n & mask);
        ans++;
    }
    
    System.out.println(ans);
  }