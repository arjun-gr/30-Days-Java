public class Solution{
    public static void main(String[] args){
        String str = "Welcome   to Coding Ninjas";

        String regex = "\s+";

        String noExtrSpaceString = str.replaceAll(regex," ");

        String arr[] = noExtrSpaceString.split(" ");

        String revString = "";        
        for(int i = arr.length -1; i >= 0; i--){
            revString += arr[i]+" ";
        }

        String removeSpace = revString.trim();
        System.out.println(removeSpace);
    }
}