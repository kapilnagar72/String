
// WAP to reverse a String
package String;

public class String8 {
    public static void main(String[] args) {
        String str = "PWSKILLS";
        String result = reverseString(str);
        System.out.println("The original string is: " + str);
        System.out.println("The reversed string is: " + result);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}