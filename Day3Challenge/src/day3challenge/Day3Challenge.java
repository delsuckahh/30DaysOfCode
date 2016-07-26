
//logic works in python - not sure why it won't work in java
//

package day3challenge;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day3Challenge {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans;
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n % 2 == 1){
         ans = "Weird";
      // if 'n' is even and between 2 and 5
      } else if(n%2==0 && (n>=2 && n<=5)) {
         ans = "Not Weird";
      // if 'n' is even and between 6 and 20
      } else if(n%2==0 && (n>=6 && n<=20)) {
         ans = "Weird";
      // all other 'n'
      } else{
         ans = "Not Weird";
      } 
      System.out.println(ans);
    }
}
    

