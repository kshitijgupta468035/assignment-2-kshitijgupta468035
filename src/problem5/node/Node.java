/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;
// to define node properties
public class Node<E> {
    private E data;
    private Node<E> next;

    public Node(E data) {
        this.data = data;
    }


}
