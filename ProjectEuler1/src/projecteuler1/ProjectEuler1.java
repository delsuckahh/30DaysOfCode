//Find the sum of all the multiples of 3 or 5 below N.

package projecteuler1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectEuler1 {

    public static void main(String[] args) {
        
        //initialize input. first number T is number of test cases.
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        //gather T number of inputs -> n
        for (int q = 1; q < T + 1; q++) {
            int n = in.nextInt();
            
            //sum placeholder for multiple sums
            int sum=0;
            //increment x by 3 -> add to sum
            for(int i =3; i<n; i+=3){
                    sum+=i;
            }
            //increment x by 5 -> add to sum if not also divisble by 3
            //this is to prevent duplicate sums (i.e. 15)
            for(int j=5; j<n; j+=5){
                   if(j%3!=0) sum+=j;
            }
            System.out.println("for loop answer: " + sum); 
        } 
    }
}
