import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class day_4 {
  
    int age;	
	public day_4(int initial_Age) {
		age = initial_Age;
  		if (age < 0) {
  			age = 0;
  			System.out.println ("This person is not valid, setting age to 0.");
  		}
	}

	public void amIOld() {
  		if (age < 13) {
  			System.out.println ("You are young.");
  		} else if (age >= 13 && age < 18 ) {
  			System.out.println ("You are a teenager.");
  		} else {
  			System.out.println ("You are old.");
  		}
	}

	public void yearPasses() {
  		age++;
	}

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int T = sc.nextInt();
      		for (int i = 0; i < T; i++) {
        		int age = sc.nextInt();
          		day_4 p = new day_4(age);
          		p.amIOld();
          		for (int j = 0; j < 3; j++) {
            		p.yearPasses();
          		}
          		p.amIOld();
                System.out.println();
        }
    }
}