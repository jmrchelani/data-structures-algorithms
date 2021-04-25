package com.jmrchelani;

import java.util.Scanner;
import java.util.Stack;

public class UndoRedo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        int lel = 1;
        Scanner scan = new Scanner(System.in);
        String tempo;
        String lastRedo = "";
        while(lel > 0) {
            if(lel == 1) {
                System.out.println("Press T to perform task");
                System.out.println("Press U to undo task");
                System.out.println("Press R to redo task");
                System.out.println("Press E to exit");
            }
            if(lel == 2) {
                System.out.println("Enter the task to perform:");
                tempo = scan.nextLine();
                if(!tempo.isEmpty()) stack.push(tempo);
                System.out.println("Added task \""+tempo+"\" into the history");
            }
            if(lel == 3) {
                if(stack.isEmpty()) System.out.println("You havent done anything yet.");
                else {
                    lastRedo = stack.pop();
                    System.out.println("Undone task: "+lastRedo);
                }
            }
            if(lel == 4) {
                if(lastRedo.isEmpty()) System.out.println("You havent undone anything yet.");
                else {
                    System.out.println("Redone task: "+lastRedo);
                    stack.push(lastRedo);
                    lastRedo = "";
                }
            }

            System.out.println("Type the command: ");
            tempo = scan.nextLine();
            if(tempo.equalsIgnoreCase("T")) lel = 2;
            else if(tempo.equalsIgnoreCase("U")) lel = 3;
            else if(tempo.equalsIgnoreCase("R")) lel = 4;
            else lel = -1;
        }
    }
}
