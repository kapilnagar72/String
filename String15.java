
//Write a java program to find the index of a substring.
package String;

public class String15 {
    public static void main(String args[]){  
String s1="this is index of example";  
//passing substring  
int index1=s1.indexOf("is");//returns the index of is substring  
int index2=s1.indexOf("index");//returns the index of index substring  
System.out.println(index1+"  "+index2);//2 8  
  
//passing substring with from index  
int index3=s1.indexOf("is",4);  
System.out.println(index3);  
int index4=s1.indexOf('s');
System.out.println(index4);  
} 
}
