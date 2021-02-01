package com.jmrchelani;

import java.util.Arrays;

public class LinkedCollection extends AbstractCollection {
    int size = 0;
    Node start, end;

    static class Node {
        Node next, prev;
        Object data;
        Node() {
            this.next = this.prev = this;
            this.data = null;
        }
        Node(Object data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    LinkedCollection() {
        this.start = new Node();
        this.end = this.start;
        this.size = 0;
    }

    @Override
    public boolean add(Object object) {
        if(this.start.data == null) {
            this.start.data = object;
            this.end = this.start;
        } else {
            this.end.next = new Node(object, null, this.end);
            this.end = this.end.next;
        }
        this.size++;
        return true;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int i = 0;
            Node tmp;
            Node current = start;
            boolean check = false;
            public boolean hasNext() {
                return i < size;
            }
            public Object next() {
                if(i >= size) throw new IndexOutOfBoundsException();
                check = true;
                Object obj = current.data;
                tmp = current;
                current = current.next;
                i++;
                return obj;
            }
            public boolean remove() throws IllegalAccessException {
                if(!check) throw new IllegalAccessException();
                if(current == null) current = tmp;
                else current = current.prev;
                if(current == start) {
                    start = start.next;
                    if(start == null) {
                        start = new Node();
                    }
                } else if(current == end) {
                    end = current.prev;
                    end.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                i--;
                size--;
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
