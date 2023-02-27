import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Collections;

/**
 * Software Design and Documentation
 * Module 4: Assignment 01 - Project 04
 * Sorted LinkedList
 * Assignment Description:  Implement a program that reads a list of Integer numbers from the scanned input and saves them into a 
 *                          Linked List sorted from the smallest to the largest. 
 *                          Be sure to use the Collections Framework and follow code guidelines and document your code accordingly;
 * Due Date: 2/15/2023
 * @author Quadri Ameen
 * @version : 1.
 * @since : Module 4
 */

class LinkedListDemo{
    /**
     * Demonstration of code reuse for implementing a LinkedList and Sorting
     * @param args default parameter for main
     */
    public static void main(String[] args){
        //setup scanner for getting user input
        Scanner sc = new Scanner(System.in);
        //setup linked list to save user input
        LinkedList<Integer> listOfNumbers = new LinkedList<>();
       
        //get a list of numbers from the user
        System.out.print("Enter a list of integers separated with space e.g: ");
        String inputString = sc.nextLine();
        sc.close(); //close the scanner after user input is completed

        //initialize a string tokenizer to retrive one number at a time
        StringTokenizer st = new StringTokenizer(inputString);
        while (st.hasMoreTokens()){
            //add next number to the linked list
            listOfNumbers.add(Integer.parseInt(st.nextToken()));
           
        }

        System.out.println("The List you entered contains: " + listOfNumbers);

        Collections.sort(listOfNumbers);

        System.out.println("The new sorted List contains: " + listOfNumbers);

    }



}