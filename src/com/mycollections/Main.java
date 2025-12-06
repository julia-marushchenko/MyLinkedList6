/**
 * Java program to illustrate LinkedList and its methods.
 */

package com.mycollections;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating LinkedList ll
        LinkedList<String> ll = new LinkedList<>();

        // Adding elements to the LinkedList ll
        ll.add("White Bag");
        ll.add("Suitcase");
        ll.add("Backpack");

        // Printing elements of LinkedList to console
        System.out.println("Elements of the list are: " + ll);

        // Adding element to the beginning of the LinkedList ll
        ll.addFirst("Teddy Bag");

        // Printing elements of LinkedList to console
        System.out.println("Elements of the list are: " + ll);

        // Printing the value of the first element to console
        System.out.println("First element is: " + ll.getFirst());

        // Printing the value of the last element to console
        System.out.println("Last element is: " + ll.getLast());

        // Creating an array of strings
        String [] arr = {"Transport Bag", "Plastic Bag", "Paper Bag"};

        // Adding collection to a LinkedList ll
        ll.addAll(Arrays.asList(arr));

        // Printing elements of LinkedList to console
        System.out.println("Elements of the list are: " + ll);

    }
}