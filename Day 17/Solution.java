// Find the category to which Chef’s problem belongs.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++){
		    int x = sc.nextInt();
		    if(1 <= x && x < 100){
		        System.out.println("Easy");
		    }
		    else if(100 <= x && x < 200){
		        System.out.println("Medium");
		    }
		    else{
		        System.out.println("Hard");
		    }
		}
	}
}
