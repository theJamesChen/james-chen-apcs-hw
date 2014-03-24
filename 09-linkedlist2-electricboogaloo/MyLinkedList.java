import java.util.*;
import java.io.*;
//fixed up some code
public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
	head = new Node("");
    }

    //add
    public void add(String d) {
	Node tmp = new Node(d);
        tmp.setNext(head.getNext());
        head.setNext(tmp);
        size++;
	
    }
    
    //toString
    public String toString() {
	String s = "";
	Node tmp = head.getNext();
	while (tmp != null) {
	    s = s + tmp + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }
    
    //ADD AT POSITION
    public void add(int i, String s) {
	
	Node tmp = head.getNext();
	Node n = new Node(s);
	for (int j = 0; j < i - 1; j ++) 
	    tmp = tmp.getNext();
	n.setNext(tmp.getNext());
	tmp.setNext(n);
	size++;
    }
    
    //SIZE
    public int size() {
	return size;
    }

    //GET
    public String get(int i) {
	Node tmp = head.getNext();
	for (int j = 0; j < i; j++)
	    tmp = tmp.getNext();
	return "" + tmp;
    }  
    
    //SET
    public String set(int i, String s) {
	Node tmp = head.getNext();
	String old = "";
	for (int j = 0; j < i; j++)
	    tmp = tmp.getNext();
	old = tmp.getData();
	tmp.setData(s);
	return old;
    }    
    
    //REMOVE
    public String remove(int i) {
	Node tmp = head.getNext();
	Node x;
	String returnstring = "";
	for (int j = 0; j < i - 1; j++)
	    tmp = tmp.getNext();
	returnstring = tmp.getNext().getData();
	x = tmp.getNext().getNext();
	tmp.setNext(x);
	return returnstring;
    }
    
    //FIND
    public int find(String s) {
	Node tmp = head.getNext();
	int location = -1;
	for (int j = 0; j < this.size(); j++) {
	    if (tmp.getData() == s) {
		location = j;
		break;
	    }
	    tmp = tmp.getNext();
	}
	return location;
    }
    
}    
