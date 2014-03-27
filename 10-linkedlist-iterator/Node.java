// Worked with Lise Ho
// had a hard time understanding E
// It is just standard that one calls a linked list a node
import java.util.*;
public class Node<E> {
    private E data; // previously we used String for easy testing
    private Node<E> next; // any node has to ability to refer to any other node 

    public Node(E d){
	data = d;
	next = null; // not really necessary as this is automatic in java
    }

    public void setData(E d){
	data = d;
    }
    public E getData(){
	return data;
    }
    public void setNext (Node n){
	next = n;
    }
    public Node<E> getNext(){
	return next;
    }

    public String toString (){
	return "" + data;
    }

}