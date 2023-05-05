import java.util.Scanner;
//Day 1 = Data types and taking input from user and then doing concatenationa and simple arthematic operationa and displaying the operation
public class app{
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
    
        int myInt = scan.nextInt();
        double myDoub = scan.nextDouble();
        scan.nextLine();
        String myStr = scan.nextLine();
        
        System.out.println(i + myInt);
        System.out.println(d + myDoub);
        System.out.println(s + myStr);

        scan.close();
    }
}
