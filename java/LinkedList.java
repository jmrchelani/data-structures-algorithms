package com.jmrchelani;

public class LinkedList {
    static class Node {
        Object data;
        Node prev, next;
        Node() {
            data = null;
            prev = next = null;
        }
        Node(Object data) {
            this.data = data;
            prev = next = null;
        }
        Node(Object data, Node prev, Node next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    Node first, last;
    int size;
    LinkedList() {
        first = last = null;
        size = 0;
    }
    boolean add(Object obj) {
        if(first == null) {
            first = last = new Node(obj);
        } else {
            last = new Node(obj, last, null);
            last.prev.next = last;
        }
        size++;
        return true;
    }
    boolean remove(Object obj) {
        for(Node i = first; i != null; i = i.next) {
            if(i.data.equals(obj)) {
                if(i.prev == null) {
                    first = i.next;
                    if(first != null) first.prev = null;
                } else if (i.next == null) {
                    last = i.prev;
                    if(last != null) last.next = null;
                } else {
                    i.prev.next = i.next;
                    i.next.prev = i.prev;
                }
                size--;
                return true;
            }
        }
        return false;
    }
    Object peek() {
        return (first == null) ? null : first.data;
    }
    Object peekLast() {
        return (last == null) ? null : last.data;
    }
    int size() {
        return size;
    }


}
