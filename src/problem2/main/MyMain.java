/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<>();

        tree.add(10);
        tree.add(3);
        tree.add(12);
        tree.add(13);
        tree.add(5);

        System.out.println("Traverse the tree in PreOrder :");
        traversePreOrder(tree.getRoot());

    }

    public static void traversePreOrder(TreeNode<Integer> currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            traversePreOrder(currentNode.getLeftChild());
            traversePreOrder(currentNode.getRightChild());
        }
    }

    public static void traversePostOrder(TreeNode<Integer> currentNode) {
        if (currentNode != null) {
            traversePostOrder(currentNode.getLeftChild());
            traversePostOrder(currentNode.getRightChild());
            System.out.print(currentNode.getData() + " ");
        }
    }
}
