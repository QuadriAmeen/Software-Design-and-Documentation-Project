import java.util.*;
import java.util.Collections;


/**
 * Software Design and Documentation
 * Module 5: Assignment 01 - Project 05 PLANNING AND EXECUTION MAINTENANCE
 * Sorted Stack operations
 * Assignment Description:  Plan and execute a maintenance task to your last project (Project #4) adapting to be now a Stack and not a LinkedList
 *                           Implement a program that reads a list of Integer numbers from the scan input and saves them into a Stack sorted 
 *                          from the smallest to the largest:
 *                           Use Collections Framework;
 *                           Follow code guidelines and document your code accordingly;
 * Due Date: 2/22/2023
 * @author Quadri Ameen
 * @version : 1.
 * @since : Module 5
 */




class SortedStackDemo {
    /**
     * Demonstration of code reuse for implementing a Stack operations
     * @param args default parameter for main
     */
    public static void main(String[] args) {
        //setup scanner for getting user input
        Scanner sc = new Scanner(System.in);
        //setup Stack list to save user input
        Stack<Integer> stack = new Stack<Integer>();
        System.out.print("Enter all the integer numbers with space: ");
        String[] input = sc.nextLine().split(" ");
        sc.close(); //close the scanner after user input is completed e.g, 9 4 5 6 8

        for (String s : input) {
            int numbers = Integer.parseInt(s);

            if (stack.isEmpty() || numbers < stack.peek()) {
                //if the stack is empty or if current number is smaller than the top of stack, just need to push current number onto the stack
                stack.push(numbers);
            } else {

                //  - else, if the number is larger than the top of stack, need to:
                //  - temmppmporatily remove all stack elements that are smaller than current number
                //  - push current number onto the stack, and
                //  - add all numbers that were temmkporarily removed back onto the stack in correct order

                Stack<Integer> entry = new Stack<Integer>();
                while (!stack.isEmpty() && numbers > stack.peek()) {
                    entry.push(stack.pop());
                }
                stack.push(numbers);
                while (!entry.isEmpty()) {
                    stack.push(entry.pop());
                    //System.out.println("The List you entered contains: " + stack);
                   
                }
            }
        }
        
        System.out.println("Sorted Stack: " + stack);
        System.out.println(" 4 is the top of the stack Last in first out (LIFO)  ");
        // 
        
    }
}