package com.jmrchelani;

public class BinaryTree {
    Object root;
    BinaryTree left, right;
    BinaryTree(Object root) {
        this.root = root;
    }
    BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }
    public String toString() {
        StringBuilder str = new StringBuilder();
        if(left != null) str.append(left).append(",");
        str.append(root);
        if(right != null) str.append(",").append(right);
        return str+"";
    }
    public String preOrder() {
        StringBuilder str = new StringBuilder();
        str.append(root);
        if(left != null) str.append(",").append(left.preOrder());
        if(right != null) str.append(",").append(right.preOrder());
        return str+"";
    }
    public String postOrder() {
        StringBuilder str = new StringBuilder();
        if(left != null) str.append(left.postOrder()).append(",");
        if(right != null) str.append(right.postOrder()).append(",");
        str.append(root);
        return str+"";
    }
}

class Ezpz {
    public static void main(String[] args) {
        BinaryTree G = new BinaryTree("G");
        BinaryTree F = new BinaryTree("F");
        BinaryTree E = new BinaryTree("E");
        BinaryTree D = new BinaryTree("D");
        BinaryTree C = new BinaryTree("C", F, G);
        BinaryTree B = new BinaryTree("B", D, E);
        BinaryTree A = new BinaryTree("A", B, C);
        System.out.println(A);
        System.out.println(A.preOrder());
        System.out.println(A.postOrder());
        System.out.println(G.root.getClass());
    }
}
