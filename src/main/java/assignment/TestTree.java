package assignment;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Test class for tree traversal lab
 *
 */
public class TestTree {



    public static void testPreorderIterator(LinkedBinarySearchTree<Integer> tree, String expected) {
        System.out.print("Preorder Printing with Iterator: ");
        Iterator i = tree.preorderIterator();
        while (i.hasNext()) {
            System.out.print(i.next().toString() + ", ");
        }
        System.out.println();
        System.out.println("Expected Result: " + expected);

        System.out.println();
    }

    public static void testInorderIterator(LinkedBinarySearchTree<Integer> tree, String expected) {
        System.out.print("Inorder Printing with Iterator: ");
        Iterator i = tree.inorderIterator();
        while (i.hasNext()) {
            System.out.print(i.next().toString() + ", ");
        }
        System.out.println();
        System.out.println("Expected Result: " + expected);

        System.out.println();
    }

    void main() {
        System.out.println("-----------------------------------");
        System.out.println("Testing binary search tree printing");
        System.out.println("-----------------------------------");
        LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<>();
        int[] temp = {3, 5, 7, 1, 4, 2, 51, 17, 43, 28, 47, 89, 6};
        for (int aTemp : temp) {
            tree.add(aTemp);
        }
        //-----------------------------
        System.out.println("Exercise 1");
        System.out.print("Recursive Preorder: ");
        tree.startPreorderRecursive();
        ArrayList<Integer> preOrderedList = tree.getOrderedList();
        for (int elem : preOrderedList ){
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println("Expected Result: " + "3 1 2 5 4 7 6 51 17 43 28 47 89");
        System.out.println();
        //-----------------------------
        System.out.println("Exercise 2");
        System.out.print("Recursive Inorder: ");
        tree.startInorderRecursive();
        ArrayList<Integer> inOrderedList = tree.getOrderedList();
        for (int elem : inOrderedList ){
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println("Expected Result: " + "1 2 3 4 5 6 7 17 28 43 47 51 89");
        System.out.println();
        //-----------------------------
        System.out.println("Exercise 3");
        System.out.print("Recursive Postorder: ");
        tree.startPostorderRecursive();
        ArrayList<Integer> postOrderedList = tree.getOrderedList();
        for (int elem : postOrderedList ){
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println("Expected Result: " + "2 1 4 6 28 47 43 17 89 51 7 5 3");
        System.out.println();


        // Extra exercise
        testPreorderIterator(tree, "3, 1, 2, 5, 4, 7, 6, 51, 17, 43, 28, 47, 89,");
        testInorderIterator(tree, "1, 2, 3, 4, 5, 6, 7, 17, 28, 43, 47, 51, 89,");

    }
}
