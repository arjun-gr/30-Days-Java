// Problem statement => Chef will have N guests in his house today. He wants to serve at least one dish to each of the N guests. Chef can make two types of dishes. He needs one fruit and one vegetable to make the first type of dish and one vegetable and one fish to make the second type of dish. Now Chef has A fruits, B vegetables, and C fishes in his house. Can he prepare at least N dishes in total?
// Sample output -
// 4
// 2 1 2 1  = YES
// 3 2 2 2  = NO
// 4 2 6 3  = YES
// 3 1 3 1  = NO

/* package codechef; // don't place package name! */
import java.io.*;
import java.lang.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution {

  public static void main(String[] args) throws java.lang.Exception {
    // your code goes here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int N = sc.nextInt(); //num of guests
      int A = sc.nextInt(); //num of fruits
      int B = sc.nextInt(); //num of vegetables
      int C = sc.nextInt(); //num of fishes

      int NumOfDish = 0;

      NumOfDish += A; //all fruits used
      B = B - A; //remaining vegis
      //  System.out.println("vegis B"+B);
      //  System.out.println("NumOfDish"+NumOfDish);

      if (B != 0) {
        int remainingDish = 0;
        if (B <= C) {
          remainingDish += B;
        } else if (B >= C) {
          remainingDish += C;
        }
        NumOfDish += remainingDish;
      }
      if (NumOfDish >= N) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
