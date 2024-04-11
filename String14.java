
//Write a java program to remove a particular character from a String.
package String;

public class String14 {
    public static void main(String[] args) {
        String str = "India is my country";
        System.out.println(charRemoveAt(str, 7));
    }

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
}
