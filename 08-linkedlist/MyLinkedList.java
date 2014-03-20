import java.util.*;
import java.io.*;
//got stuck on adding to the last element
//code mostly works, but the exceptions need work.
public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
	head = null;
    }

    public void add(String d) {
	Node tmp = new Node(d);
	//head = tmp;
	tmp.setNext(head);
	head=tmp;
    }
    
    public String toString() {

	//can't get next from null
	Node tmp = head;
	
	String s = " "+tmp.getData();
	//	s = "" + head + head.getNext() + head.getNext().getNext();
	while(tmp.getNext()!=null) {
	    tmp = tmp.getNext();
	    s = s + ",  " + tmp.getData();
	      
	}
	return s;
    }
    
    public void add(int i, String s) {
	int counter = 0;
	Node tmp = head;
	Node last = new Node(s);
	try{
	    if(i == 0)
		add(s);
	    else {
		while(tmp.getNext()!=null) {
		   
		    if(counter == i - 1) {
				if(counter == length() - 2){
				    tmp.getNext().setNext(last);
				}
			Node tmp2 = head;
			head = tmp.getNext();
			add(s);
			tmp2.setNext(head);
			head = tmp2;
		    }
		    
		    
		    
		    tmp = tmp.getNext();
		    counter++;    
		}
	    	if(tmp.getNext() == null) 
		    throw new IndexOutOfBoundsException("Index " + i + " is out of bounds!");
	    }
	}
	catch (IndexOutOfBoundsException e) {
	    System.out.println(e.getMessage());
	}
    }

    public int length() {
	int count = 0;
	Node tmp = head;
	while(tmp.getNext() != null)
	    {
		tmp = tmp.getNext();
		count++;     
	    }
	return count + 1;
	
    }

    public String get(int i) {
	int counter = 0;
	Node tmp = head;
	try{
	while(tmp.getNext() != null) {
	     if(counter == i) {
		 return tmp.getData();
	     }
	     if(counter == i - 1 && counter == length() - 2){
		 return tmp.getNext().getData();
	     }
	     tmp=tmp.getNext();
	     counter++;
	}
	if(tmp.getNext() == null) 
		    throw new IndexOutOfBoundsException("Index " + i + " is out of bounds!");
	}
	catch (IndexOutOfBoundsException e) {
	    System.out.println(e.getMessage());
	}

	return null;
    }  

    public String set(int i, String s) {
	int counter = 0;
	String old = "";
	Node tmp = head;
	try{
	    
		while(tmp.getNext()!=null) {
		    
		    if(counter == i) {
			old = tmp.getData();
			tmp.setData(s);
		    }
		    if(counter == i - 1 && counter == length() - 2){
			old = tmp.getNext().getData();
			tmp.getNext().setData(s);
		    }
		    tmp = tmp.getNext();
		    counter++;    
		}
	    	if(tmp.getNext() == null) 
		    throw new IndexOutOfBoundsException("Index " + i + " is out of bounds!");
	    
	}
	catch (IndexOutOfBoundsException e) {
	    System.out.println(e.getMessage());
	}
	return old;

    }
    
}    


