import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        while (tc-- > 0) {
	        int num = sc.nextInt();
	        String bin = "";
	        if (num == 0) {
	        	System.out.println ("0");
	        	continue;
	        }
	        while (num > 0) {
	        	if (num > 1 && num % 2 == 0) {
	        		bin += "0";
	        	} else {
	        		bin += "1";
	        	}

	        	num /= 2;
	        }
	        for (int i = bin.length() - 1; i >= 0; i--) {
	        	System.out.print (bin.charAt(i));
	        }
	        System.out.println();
	    }
    }
}
