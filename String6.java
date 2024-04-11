
//6. Write a program to check if the letter 'e' is present in the word 'Umbrella'.
package String;

public class String6 {
    public static void main(String[] args) {
        String a = "Umbrella";
        boolean per = false;
        for(int i=0; i<a.length();i++){
            if(a.charAt(i)=='e'){
              per=true;
              break;
            }
        }
        System.out.println(per);
    }
}
