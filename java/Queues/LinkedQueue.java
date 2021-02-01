package com.jmrchelani;

import java.util.NoSuchElementException;

public class LinkedQueue {
    static class Node {
        Object data;
        Node next;
        Node prev;
        Node() {
            this.data = null;
            this.next = null;
            this.prev = null;
        }
        Node(Object data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
        Node(Object data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    Node main;
    int length;

    LinkedQueue() {
        main = null;
        length = 0;
    }

    public void insert(Object object) { // O(1)
        Node objNode = new Node(object);
        if(this.main == null) {
            this.main = new Node(null, objNode, null);
        } else {
            if(this.main.prev == null) {
                this.main.next.next = objNode;
                objNode.prev = this.main.next;
            } else {
                this.main.prev.next = objNode;
                objNode.prev = this.main.prev;
            }
            this.main.prev = objNode;

        }
        length++;
    }

    public Object remove() { // O(1)
        if(this.main.next == null) throw new NoSuchElementException();
        Node temp = this.main.next;
        this.main.next = this.main.next.next;
        length--;
        return temp.data;
    }

    public Object check() { // O(1)
        if(this.main.next == null) throw new NoSuchElementException();
        return this.main.next.data;
    }

    public int size() { // O(1)
        return length;
    }
}