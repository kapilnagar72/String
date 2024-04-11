
// WAP to reverse a sentence while preserving the position
package String;

public class String9 {
    public static void main(String[] args) {
        String str1 = "Think Twice";
        String str2 = "";
        String sarr[] = str1.split(" ");
        for (String elem : sarr) {
            for (int i = elem.length() - 1; i >= 0; i--) {
                str2 = str2 + elem.charAt(i);
            }
            str2 = str2 + " ";
        }
        System.out.println(str2);
    }
}
