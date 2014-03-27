// Worked with Lise Ho
// had a hard time understanding E
import java.util.*;
import java.io.*;
public class MyLinkedList<E> implements Iterable<E>{
    private Node<E> head;
    private int size;
    private Node<E> tail;

    public MyLLIterator iterator(){
	MyLLIterator X = new MyLLIterator(head);
	return X;
    }
    public MyLinkedList(){
	head = new Node("Dummy");
	// the front of this list is this dummy node, but the actual head is actually head.getNext()  
	tail = head;
    }
    /*
    public void add(String d){
	Node tmp = new Node(d);
	tmp.setNext(head.getNext());
	head.setNext(tmp);
	tail = tmp;
	size++;
    }
    */

    // new add function, adds at the end
    public void add(String s){
	Node tmp = new Node (s);
	tail.setNext(tmp);
	tail = tmp;
	size++;
    }
    public void add(int i, E s){
	if (i>=size-1){
	    Node tmp = new Node (s);
	    tail.setNext(tmp);
	    tail = tmp;
	    size++;
	}
	else{
	    int l = -1;
	    Node<E> tmp = head;
	    
	    while (tmp != null & l != i-1){
		tmp=tmp.getNext();
		l++;
	    }
	    if(tmp == null) {
		System.out.println("OUT OF BOUNDS");
	    }
	    else{
		Node<E> n = new Node<E>(s);
		n.setNext(tmp.getNext());
		tmp.setNext(n);
		size++;
	    }	
	}
    }
    public Node<E> get (int i){
	 int l = -1;
	 Node<E> tmp = head;
	 while (tmp != null && l != i){
	     tmp=tmp.getNext(); 
	     l++;
	 }
	 if(tmp != null && l == i ){
	     return tmp;
	 }
	 else{
	     return null;
	 }	
     }

     public Node<E> set (int i, E s){
	 int l = -1;
	 Node<E> tmp = head;
	 while (tmp != null && l != i-1){
	     tmp=tmp.getNext();
	     l++;
	 }
	 if (tmp != null && l==i-1){
	     Node<E> x = new Node<E>(s);
	     // Null Pointer Exception here
	     try{
		 Node<E> y = tmp.getNext().getNext();
		 x.setNext(y);
		 tmp.setNext(x);
		 return x.getNext();
	     }
	     catch (NullPointerException e){
		 return null;
	     }
	 }
	 else{
	     return null;
	 }	

     }
     public Node<E> remove (int i){
	 int l = -1;
	 Node<E> tmp = head;
	 while (tmp != null && l != i-1){
	     tmp=tmp.getNext();
	     l++;
	 }
	 if (tmp != null && l==i-1){
	     Node<E> removed = tmp.getNext();
	     tmp.setNext(tmp.getNext().getNext());
	     size--;
	     return removed;
	 }
	 else{
	     return null;
	 }	
     }
    
    public int find (E s){
	int i = -1;
	Node<E> tmp = head;
	while (tmp != null && !tmp.getData().equals(s)){
	    tmp=tmp.getNext();
	    i++;
	}
	if (tmp != null && tmp.getData().equals(s)){
	    return i;
	}
	else{
	    return -1;
	}	
    }
    public int size(){
	return size;
    }

    public String toString(){
	String s = "";
	int i =0;
	//if you want to see the front dummy node VVV set tmp as head, not head.getNext()
	
	//Node<E> tmp = head;
	Node<E> tmp = head.getNext();
	
	while (tmp != null){
	    s = s + tmp.getData()+" " ;
	    tmp = tmp.getNext();
	    i++;
	}
	return s;
    }
}
