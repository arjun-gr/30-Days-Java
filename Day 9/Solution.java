import java.io.*;

class Result {
    public static int factorial(int n) {
        // Write your code here
        if (n > 0) {
            int result = n * factorial(n - 1);
            return result;
        } else {
            return 1;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        // Result myResult = new Result(); //creating object or just directly acess the
        // method because its a static method you dont need to make object for it to
        // acess.
        int recResult = Result.factorial(5);
        System.out.println(recResult);
    }
}
