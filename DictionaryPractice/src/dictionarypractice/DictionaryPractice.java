package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        // English to Spanish dictionary
        
        Map<String,String>englSpanDictionary = new HashMap<String,String>();
        //Inserting things into dictionary
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday","Martes");
        englSpanDictionary.put("Wednesday","Miercoles");
        englSpanDictionary.put("Thursday","Jueves");
        englSpanDictionary.put("Friday","Viernes");
        englSpanDictionary.put("Saturday","Sabado");
        englSpanDictionary.put("Sunday","Domingo");
        //Retrieve from dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        System.out.println(englSpanDictionary.get("Deez"));
        //print out all keys
        System.out.println(englSpanDictionary.keySet());
        //print out all values
        System.out.println(englSpanDictionary.values());
        //print out size
        System.out.println(englSpanDictionary.size());
        
        System.out.println();
        System.out.println();
        
        Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
        //put some stuff in the dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Oreos", true);
        shoppingList.put("Eggs", false);
        shoppingList.put("Sugar", false);
        //retrieve items
       System.out.println(shoppingList.get("Ham"));
       System.out.println(shoppingList.get("Sugar"));
       //key-value pairs
       System.out.println("to string" + shoppingList.toString());
       //is empty?
       System.out.println(shoppingList.isEmpty());
       //remove things
       shoppingList.remove("Eggs");
       //replace things
       shoppingList.replace("Bread", Boolean.FALSE);
       
       
       shoppingList.clear();
       System.out.println(shoppingList.toString());
       //is empty?
       System.out.println(shoppingList.isEmpty());
      
    }
    
}
