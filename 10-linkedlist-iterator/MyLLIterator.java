// Worked with Lise Ho
// had a hard time understanding E

//review classcode, for z's version
import java.io.*;
import java.util.*;

public class MyLLIterator<E> implements Iterator<E>{
    private Node<E> currentNode;
    //we need a constructor so that the Iterator receives the list of iterable it needs to go through

    public MyLLIterator(Node n){
	currentNode= n;
    }
 
    public boolean hasNext(){
	return currentNode.getNext() != null;
    }
    public E next(){
	currentNode= currentNode.getNext();
	return currentNode.getData();
    }
    public void remove(){
	//will be completed later
	return;
    }
}


