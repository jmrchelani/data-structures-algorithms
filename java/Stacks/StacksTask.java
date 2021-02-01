package com.jmrchelani;

// Code by 19SW27 - Mahtab / Milton

// A lot of improvements possible and needed

public class StacksTask {
    public static void main(String[] args) {
        // ArrayStack
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("Mahtab");
        arrayStack.push("19SW27");
        arrayStack.push("Milton");
        arrayStack.push(27);
        System.out.println("arrayStack.toString(): "+arrayStack.toString());
        System.out.println("arrayStack.pop(): "+arrayStack.pop());
        System.out.println("arrayStack.toString(): "+arrayStack.toString());
        System.out.println("arrayStack.length(): "+arrayStack.length());
        System.out.println("arrayStack.peek(): "+arrayStack.peek());
        ArrayStack clone = arrayStack.clone();
        System.out.println("clone.equals(arrayStack): "+clone.equals(arrayStack));
        System.out.println("clone.toString(): "+clone.toString());
        System.out.println("clone.findLast(): "+clone.findLast());
        System.out.println("clone.toString(): "+clone.toString());
        System.out.println("clone.toLinkedStack().toString(): "+clone.toLinkedStack().toString());

        // LinkedStack
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push("Github");
        linkedStack.push("Teams");
        linkedStack.push("Medium");
        linkedStack.push("Gitlab");
        linkedStack.push(27.0);
        System.out.println("linkedStack.toString(): "+linkedStack.toString());
        System.out.println("linkedStack.pop(): "+linkedStack.pop());
        System.out.println("linkedStack.toString(): "+linkedStack.toString());
        System.out.println("linkedStack.length(): "+linkedStack.length());
        System.out.println("linkedStack.peek(): "+linkedStack.peek());
        LinkedStack linkedClone = linkedStack.clone();
        System.out.println("linkedClone.equals(linkedStack): "+linkedClone.equals(linkedStack));
        System.out.println("linkedClone.toString(): "+linkedClone.toString());
        System.out.println("linkedClone.findLast(): "+linkedClone.findLast());
        System.out.println("linkedClone.toString(): "+linkedClone.toString());
        System.out.println("linkedClone.toArrayStack().toString():" + linkedClone.toArrayStack().toString());
    }
}
