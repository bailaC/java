import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int N = sc.nextInt();
        	int temp = b;

        	while (N-- > 0) {
        		System.out.print (a + b + " ");
        		b = temp + b * 2;
        	}
        	System.out.println();
        }
    }
}