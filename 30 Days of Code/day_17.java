import java.util.*;
import java.io.*;

class Calculator {

	int power (int b, int p) throws Exception {
		if (b < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		} else {
			return ((int)java.lang.Math.pow(b, p));
		}
	}
}

class day_17 {

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
