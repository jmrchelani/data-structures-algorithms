package com.jmrchelani;

public class BinarySearchTree {
    int root;
    boolean isRootSet = false;
    BinarySearchTree left, right;
    BinarySearchTree() {
        left = right = null;
    }
    BinarySearchTree(int obj) {
        root = obj;
        isRootSet = true;
        left = right = null;
    }
    BinarySearchTree(int obj, BinarySearchTree l, BinarySearchTree r) {
        root = obj;
        isRootSet = true;
        left = l;
        right = r;
    }
    boolean insert(int obj) {
        if(!isRootSet) {
            root = obj;
            isRootSet = true;
            return true;
        } else {
            if(obj < root) {
                if(left == null) {
                    left = new BinarySearchTree(obj);
                    return true;
                }
                else return left.insert(obj);
            } else if(obj > root) {
                if(right == null) {
                    right = new BinarySearchTree(obj);
                    return true;
                }
                else return right.insert(obj);
            }
        }
        return false;
    }

    boolean contains(int obj) {
        if(root == obj && isRootSet) return true;
        if(obj > root && right != null)
            return right.contains(obj);
        if(obj < root && left != null)
            return left.contains(obj);
        return false;
    }

    boolean remove(int obj) {
        deleteRec(this, obj);
        return true;
    }

    BinarySearchTree deleteRec(BinarySearchTree tree, int obj)
    {
        if (tree == null)
            return null;
        if (obj < tree.root)
            tree.left = deleteRec(tree.left, obj);
        else if (obj > tree.root)
            tree.right = deleteRec(tree.right, obj);
        else {
            if (tree.left == null)
                return tree.right;
            else if (tree.right == null)
                return tree.left;

            tree.root = minValue(tree.right);

            tree.right = deleteRec(tree.right, tree.root);
        }

        return tree;
    }

    int minValue(BinarySearchTree tree) {
        int minv = tree.root;
        while (tree.left != null) {
            minv = tree.left.root;
            tree = tree.left;
        }
        return minv;
    }

    boolean isLeaf() {
        return left == null && right == null && isRootSet;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(0);
        bst.insert(-2);
        bst.insert(-1);
        System.out.println(bst.contains(3));
        System.out.println(bst.contains(4));
        System.out.println(bst.contains(-1));
        System.out.println(bst.contains(-3));
        System.out.println("Inserting 0 again: " + bst.insert(0));
        System.out.println("Inserting new number 5: " + bst.insert(5));
        System.out.println(bst.remove(5));
    }
}
