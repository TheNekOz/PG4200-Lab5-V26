# Lab 5: Binary Tree Traversals and Iterators

> All tasks are completed within this `assignment`-package

## Binary tree traversals

During lectures, we have discussed binary tree traversals. Your first task is to implement recursive methods to do preorder, inorder and postorder traversals. This should be a simple task, based on pseudocodes seen in lecture, and take only a few minutes to code and test. More specifically complete the following methods inside LinkedBinarySearchTree class:

>task01 

Inside class _LinkedBinarySearchTree_ complete the code for 

_void preorderRecursive(Node)_

>task02

Inside class _LinkedBinarySearchTree_ complete the code for

_void inorderRecursive(Node)_

>task03

Inside class _LinkedBinarySearchTree_ complete the code for

_void postorderRecursive(Node)_

## Extra task : Binary tree iterators

In PGR112, you have studied the concept of an iterator for a class; you might have studied in more detail list iterators.
In this lab you will apply the concept of an iterator for a binary tree. While a list iterator is a way to move through elements of a list from beginning to end, for a tree there are many ways to move from node to node.
For this part you will implement two types of iterators: a preorder and an order iterator.

You may need to review [information about the Interface Iterator<E>](https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html) provided in package java.util. Your iterators will implement this interface, so you need to provide the constructor plus methods _hasNext()_ and _next()_ for each iterator implemented.

The hardest method to implement for class _InorderIterator implements Iterator_ is _next()_ as it entails to figure out from the current node of your iterator, who is the next node to be visited in an inorder traversal of the tree. The same is true for class _PreorderIterator implements Iterator_.

The pseudocode of the algorithms to do these tasks can be found in the file _DGD5-traversalNext.txt_.

## Task details:

- Review class LinkedBinaryTree and class TestTree.
- Implement the traversal algorithms; test them using TestTree class.
- **HARD**: Implement preorderNext and inorderNext iterators; based on pseudocodes given. These are nontrivial algorithms.
Test them with TestTree class.