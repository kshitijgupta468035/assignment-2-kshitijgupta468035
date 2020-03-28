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
        tree.add(100);
        tree.add(50);
        tree.add(200);
        tree.add(25);
        tree.add(75);
        tree.add(150);
        tree.add(300);
        tree.add(40);
        tree.add(60);
        tree.add(110);
        tree.add(250);
        tree.add(275);

        tree.print();


    }
}
