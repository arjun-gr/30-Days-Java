import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] arr) {
        this.elements = arr;
    }

    public void computeDifference() {
        int small = elements[0];
        int big = elements[0];
        int i = 0;
        while (i < elements.length) {
            if (elements[i] < small) {
                small = elements[i];
            }
            if (elements[i] > big) {
                big = elements[i];
            }
            i++;
        }
        maximumDifference = big - small;
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}