import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String S = sc.nextLine();
            evenOddChars(S);
        }
        sc.close();
    }

    public static void evenOddChars(String S) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0 || i == 0) {
                even.append(S.charAt(i));
            } else {
                odd.append(S.charAt(i));
            }
        }
        System.out.println(even.toString() + " " + odd.toString());
    }
}