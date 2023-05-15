import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (phoneBook.containsKey(s)) { // .containsKey() searched weather it exists in the phoneBook or not
                System.out.println(s + "=" + phoneBook.get(s)); // .get gets the value of the key
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}