//Task
//
//Given N names and phone numbers, assemble a phone book that maps friends' names
//to their respective phone numbers.  You will then be given an unknown number
//of names to query your phone book for; for each name queried, print the associated
//entry from your phonebook (in the form name=phoneNumber) or Not Found if there
//is no entry for name.
//
//Input Format
//
//The first line contains an integer, N, denoting the number of entries in the phone
//phone book.  Each of the N subsequent lines describes an entry in the form of 2
//space-separated values on a single line.  The first value is a friend's name, 
//and the second value is an 8-digit phone number.  After the N lines of phone book
//entries, there are an unknown number of lines of queries.  Each line (query) contains
//a name to look up, and you must continue reading lines until there is no more input.



package day8challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8Challenge {

    public static void main(String[] args) {
        //initialized dictionary phoneBook before hackerrank template code
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        
        //template at hackerrank
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            //Write code here
            phoneBook.put(name, phone);
        }
        
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneBook.get(s) == null) {
                System.out.println("Not Found");
            } else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
        }
        in.close();
    }
    
}
