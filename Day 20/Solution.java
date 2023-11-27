import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++){
		    int w1 = sc.nextInt();
		    int w2 = sc.nextInt();
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int M = sc.nextInt();
		    
		    int weight_Diff = w2 - w1;
		    int min_weight = x1 * M;
		    int max_weight = x2 * M;
		    
		    if((weight_Diff == min_weight || weight_Diff==max_weight) || (weight_Diff >= min_weight && weight_Diff <= max_weight)){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(0);
		    }
		}
		sc.close();
	}
}
