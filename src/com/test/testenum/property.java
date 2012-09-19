/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.testenum;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author Administrator
 */
//mport java.util.*;

class property {
   public static void main(String args[]) {
      Properties capitals = new Properties();
      Set states;
      String str;
      
      capitals.put("Illinois", "Springfield");
      capitals.put("Missouri", "Jefferson City");
      capitals.put("Washington", "Olympia");
      capitals.put("California", "Sacramento");
      capitals.put("Indiana", "Indianapolis");
      System.out.println("Capiatasl:"+capitals);
      // Show all states and capitals in hashtable.
      states = capitals.keySet(); // get set-view of keys
      System.out.println("states are:" +states);
      Iterator itr = states.iterator();
      System.out.println("iterator is:" +itr);
      while(itr.hasNext())
      {
         str = (String) itr.next();
          System.out.println("str is:" +str);
         System.out.println("The capital of " +
            str + " is " + capitals.getProperty(str) + ".");
      }
      System.out.println();

      // look for state not in list -- specify default
      str = capitals.getProperty("Florida", "Not Found");
      System.out.println("The capital of Florida is "
          + str + ".");
   }
}