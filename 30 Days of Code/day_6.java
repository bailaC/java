import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = n;
        int i = 1;

        while (n-- > 0) {
        	int space = num - i;
        	int hash = i;
        	while (space-- > 0) {
        		System.out.print (" ");
        	}

        	while (hash-- > 0) {
        		System.out.print ("#");
        	}
        	System.out.println();
        	i++;
        }
    }
}
