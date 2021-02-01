package com.jmrchelani;

public interface Iterator {
    boolean hasNext();
    Object next();
    boolean remove() throws IllegalAccessException;
}
