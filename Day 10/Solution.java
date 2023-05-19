import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usrInp = sc.nextInt();

        // converting usrInp to binary
        String binStr = Integer.toBinaryString(usrInp);

        //
        int maxOne = 0;
        int currOne = 0;

        for (char bit : binStr.toCharArray()) {
            if (bit == '1') {
                currOne++;
            } else {
                maxOne = Math.max(currOne, maxOne);
                currOne = 0;
            }
        }
        maxOne = Math.max(currOne, maxOne);
        System.out.println(maxOne);
        sc.close();
    }
}