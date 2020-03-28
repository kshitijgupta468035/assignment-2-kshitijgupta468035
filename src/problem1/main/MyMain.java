/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<>();
        tree.add(120);
        tree.add(70);
        tree.add(210);
        tree.add(35);
        tree.add(55);
        tree.add(250);
        tree.add(400);
        tree.add(20);
        tree.add(30);
        tree.add(130);
        tree.add(150);
        tree.add(375);

        tree.print();

        System.out.println("Number of nodes who doesn't have a left Child :" + tree.numberOfLeftChild);
    }
}
