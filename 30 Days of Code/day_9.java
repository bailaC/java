import java.io.*;
import java.util.*;
public class day_9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = MAX (x, y);
        int b = MIN (x, y);
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
   static  int find_gcd(int a,int b){
        if (a % b == 0) {
          return b;
        }
        return find_gcd(b,a%b);
    }

    static int MAX (int x, int y) {
      return (x > y ? x : y);
    }

    static int MIN (int x, int y) {
      return (x < y ? x : y);
    }
}
 
