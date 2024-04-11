
//Write a java program to Reverse a string without using the inbuilt method.
package String;

import java.util.Scanner;

public class String11 {
    public static void main(String args[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        s = sc.nextLine();
        System.out.print("After reverse string is: ");
        for (int i = s.length(); i > 0; --i) {
            System.out.print(s.charAt(i - 1));
        }
    }
}
