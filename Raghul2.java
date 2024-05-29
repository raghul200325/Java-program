import java.util.*;
public class Raghul2{
  public static void main(String[]args){
  ArrayList<String> c1= new ArrayList<String>();
  c1.add("Red");
  c1.add("Green");
  c1.add("Orange");
  c1.add("White");
  c1.add("Black");
  System.out.println("Original array list:"+c1);
  System.out.println("Let trim to size the above array:");
  c1.trimToSize();
  System.out.println(c1);
 }
}