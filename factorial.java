import java.io.*;
import java.util.*;
public class factorial{
  public static int find_factorial(int n){
    if(n == 1)return 1;
    return n * find_factorial(n-1);
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = in.nextInt();
    int ans = find_factorial(n);
    System.out.println("Factorial = "+ans);
  }
}
