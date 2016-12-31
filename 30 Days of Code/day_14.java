import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

  	Difference(int[] arr) {
  		elements = arr;
  	}

  	void computeDifference() {
  		java.util.Arrays.sort(elements);
  		maximumDifference = elements[elements.length - 1] - elements[0];
  	}

  	int maximumDifference() {
  		return maximumDifference;
  	}
}

public class day_14 {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int[] a = new int[N];
                for (int i = 0; i < N; i++) {
                    a[i] = sc.nextInt();
                }

                Difference D = new Difference(a);

                D.computeDifference();

              	System.out.print(D.maximumDifference);
            }
        }