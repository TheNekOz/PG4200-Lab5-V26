package assignment;

import org.junit.jupiter.api.*;
import org.junitpioneer.jupiter.DisableIfTestFails;

import studio.programkode.jatf.java25.BaseAssignment;

//import static assignment.TestTree.testPreorderRecursive;
import java.util.ArrayList;
import java.util.Arrays;

import static studio.programkode.jatf.java25.Framework.*;


@DisableIfTestFails
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Assignment Title")
public class TestAssignment extends BaseAssignment
{
    @DisplayName("Task #01 Title")
    @Test
    @Order(1)
    void task01() {
        // Code that tests assignment goes here
        LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<>();
        int[] temp = {3, 5, 7, 1, 4, 2, 51, 17, 43, 28, 47, 89, 6};
        for (int aTemp : temp) {
            tree.add(aTemp);
        }
        // exercise 01
        tree.startPreorderRecursive();

        ArrayList<Integer> testOrder = new ArrayList<>(Arrays.asList(3, 1, 2, 5, 4, 7, 6, 51, 17, 43, 28, 47, 89));
        Assertions.assertIterableEquals(tree.getOrderedList(), testOrder, "This is not in preorder.");

    }
    @DisplayName("Task #02 Title")
    @Test
    @Order(2)
    void task02() {
        // Code that tests assignment goes here
        LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<>();
        int[] temp = {3, 5, 7, 1, 4, 2, 51, 17, 43, 28, 47, 89, 6};
        for (int aTemp : temp) {
            tree.add(aTemp);
        }
        // exercise 01
        tree.startInorderRecursive();
        ArrayList<Integer> testOrder = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 17, 28, 43, 47, 51, 89));
        Assertions.assertIterableEquals(tree.getOrderedList(), testOrder, "This is not in inorder.");

    }
    @DisplayName("Task #03 Title")
    @Test
    @Order(3)
    void task03() {
        // Code that tests assignment goes here
        LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<>();
        int[] temp = {3, 5, 7, 1, 4, 2, 51, 17, 43, 28, 47, 89, 6};
        for (int aTemp : temp) {
            tree.add(aTemp);
        }
        // exercise 01
        tree.startPostorderRecursive();
        ArrayList<Integer> testOrder = new ArrayList<>(Arrays.asList(2, 1, 4, 6, 28, 47, 43, 17, 89, 51, 7, 5, 3));
        Assertions.assertIterableEquals(tree.getOrderedList(), testOrder, "This is not in postorder.");

    }
}
