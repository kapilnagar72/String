
//WAP to sort a String Alphabetically
package String;

import java.util.Arrays;

public class String10 {

    static void sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }

    public static void main(String[] args) {
        String s = "aabbzzncedt";
        sortString(s);
    }
}
