package com.jmrchelani;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayStack implements Stack {

    public int size = 0;
    public Object[] array;

    ArrayStack() {
        this.array = new Object[2];
    }

    @Override
    public Object pop() { // O(1)
        if(this.size < 1) throw new NoSuchElementException();
        return this.array[--this.size];
    }

    @Override
    public void push(Object object) { // O(N)
        if(this.size == this.array.length) {
            this.array = Arrays.copyOf(this.array, this.array.length*2);
        }
        this.array[this.size++] = object;
    }

    @Override
    public Object peek() { // O(1)
        return this.array[this.size-1];
    }

    @Override
    public int length() { // O(1)
        return this.size;
    }

    public boolean equals(ArrayStack stack) { // O(n)
        if(this.size != stack.size) return false;
        for(int i = 0; i < this.size; ++i) {
            if (this.array[i] != stack.array[i]) {
                return false;
            }
        }
        return true;
    }

    public Object findLast() { // O(1)
        if(this.size < 1) throw new NoSuchElementException();
        return this.array[0];
    }

    public ArrayStack clone() { // O(n)
        ArrayStack cloneArrayStack = new ArrayStack();
        for(int i = 0; i < size; i++) {
            cloneArrayStack.push(this.array[i]);
        }
        return cloneArrayStack;
    }

    public LinkedStack toLinkedStack() { // O(n)
        LinkedStack toLinkedStack = new LinkedStack();
        for(int i = 0; i < size; i++) {
            toLinkedStack.push(this.array[i]);
        }
        return toLinkedStack;
    }

    @Override
    public String toString() { // O(n)
        String full = "[ ";
        for(int i = 0; i < size; i++) {
            full += this.array[i];
            full += ", ";
        }
        full = full.substring(0, full.length()-2);
        full += " ]";
        return full;
    }
}
