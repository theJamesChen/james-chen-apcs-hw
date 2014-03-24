import java.util.*;
import java.io.*;
//fixed up some code
public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
	head = null;
    }

    //add
    public void add(String d) {
	Node tmp = new Node(d);
	//head = tmp;
	tmp.setNext(head);
	head=tmp;
    size++;
    }
    
    //toString
    public String toString() {
	String s = "";
	Node temp = head;
	while (temp != null) {
	    s = s + temp + " ";
	    temp = temp.getNext();
	}
	return s;
    }
    
    //ADD AT POSITION
    public void add(int i, String s) {
	if (i == 0) {
	    this.add(s);
	    return;
	}
	Node tmp = head;
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
	Node tmp = head;
	for (int j = 0; j < i; j++)
	    tmp = tmp.getNext();
	return "" + tmp;
    }  
    
    //SET
    public String set(int i, String s) {
	Node tmp = head;
	String old = "";
	for (int j = 0; j < i; j++)
	    tmp = tmp.getNext();
	old = tmp.getData();
	tmp.setData(s);
	return old;
    }    

    //REMOVE
    public String remove(int i) {
	Node tmp = head;
	Node x;
	String returnstring = "";
	for (int j = 0; j < i - 1; j++)
	    tmp = tmp.getNext();
	returnstring = tmp.getNext().getData();
	x = tmp.getNext().getNext();
	tmp.setNext(x);
    size--;
	return returnstring;
    }

    //FIND
    public int find(String s) {
	Node tmp = head;
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
