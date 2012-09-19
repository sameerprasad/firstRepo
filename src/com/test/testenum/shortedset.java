/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.testenum;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Administrator
 */
public class shortedset {

    public static void main(String[] args) {

        // Create the sorted set
        SortedSet set = new TreeSet(); 

        // Add elements to the set
        set.add("b");
        set.add("c");
        set.add("a");

        // Iterating over the elements in the set
        Iterator it = set.iterator();
        //System.out.println("Iteerator is:" +it);
        while (it.hasNext()) {
            // Get element
            Object element = it.next();
            System.out.println(element.toString());
        }
    }
}