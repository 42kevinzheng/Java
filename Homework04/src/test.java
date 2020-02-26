/**
 * Written By Kevin Zheng 
 */
import java.util.*;
import java.io.*;
public class test {
    static Hw4 <Integer>stack= new Hw4<Integer>(); // intialize the object 
   static Scanner keyboard= new Scanner(System.in);

    private static void takeInput(String user) {
        String numOrOperand = " ";
        while (!numOrOperand.equals("x")) {
            System.out.println("Enter next input: ");
            numOrOperand = keyboard.next();
            try 
            {
                int intNumOrOperand = Integer.valueOf(numOrOperand);
                stack.push(intNumOrOperand);
            } 
            catch (Exception e) 
            {
                if (numOrOperand.equals("*")) {
                    stack.push(stack.pop() * stack.pop());
                } else if (numOrOperand.equals("/")) {
                    stack.push((int) stack.pop() / stack.pop());
                } else if (numOrOperand.equals("+")) {
                    stack.push(stack.pop() + stack.pop());
                } else if (numOrOperand.equals("-")) {
                    stack.push(stack.pop() - stack.pop());
                } else if (numOrOperand.equals("/")||numOrOperand.equals("+")||numOrOperand.equals("-")||numOrOperand.equals("*")) {
                    System.out.println("okkk");
                } else if (numOrOperand.equals("w")) 
                {      
                        System.out.println("Result is:"); stack.print();     
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        try {
            takeInput();
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }

    }
}