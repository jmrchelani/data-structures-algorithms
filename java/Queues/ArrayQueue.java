package com.jmrchelani;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {
    Object[] array;
    int length;
    ArrayQueue() {
        array = new Object[2];
        length = 0;
    }

    public void insert(Object data) { // O(n) because of copy
        if(length == 0) {
            this.array[0] = data;
        } else {
            if(length >= array.length) {
                array = Arrays.copyOf(array, array.length*2);
            }
            this.array[length] = data;
        }
        length++;
    }

    public Object remove() { // O(n) because copy
        if(length == 0) throw new NoSuchElementException();
        Object temp = array[0];
        if(length == 1) {
            array = null;
            length--;
            return temp;
        }
        if(length == 2) {
            array[0] = array[1];
            length--;
            return temp;
        }
        array = Arrays.copyOfRange(array, 1, array.length-1);
        length--;
        return temp;
    }

    public Object check() { // O(1)
        if(length == 0) throw new NoSuchElementException();
        return array[0];
    }

    public int size() { // O(1)
        return length;
    }

}
