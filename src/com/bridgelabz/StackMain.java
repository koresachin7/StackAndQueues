package com.bridgelabz;
/**
 * Purpose - To create a Stack and push elements to the stack
 * Final sequence to be printed - 56 - 30 - 70
 * @author - Sachin kore
 * @version - 16.0
 */
public class StackMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack And Queues ");
        MyStack stack = new MyStack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
        //To perform peak and pop till the list is empty
        stack.peak();
        stack.pop();
        stack.display();
        stack.peak();
        stack.pop();
        stack.display();
        stack.peak();
        stack.pop();
        stack.display();

    }
}