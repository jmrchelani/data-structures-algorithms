package com.jmrchelani;

import java.util.Arrays;

public class ArrayCollection extends AbstractCollection {
    int size = 0;
    Object[] array;
    final int MIN_LENGTH = 10;

    ArrayCollection() {
        array = new Object[MIN_LENGTH];
    }

    @Override
    public boolean add(Object object) {
        if(size >= array.length) {
            array = Arrays.copyOf(array, array.length);
        }
        array[size++] = object;
        return true;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int i = 0;
            boolean check = false;
            public boolean hasNext() {
                return i < size;
            }
            public Object next() {
                if(i >= size) throw new IndexOutOfBoundsException();
                check = true;
                return array[i++];
            }
            public boolean remove() throws IllegalAccessException {
                if(!check) throw new IllegalAccessException();
                array[--i] = array[--size];
                array[size] = null;
                check = false;
                return true;
            }
        };
    }

    @Override
    public int size() {
        return size;
    }
}
