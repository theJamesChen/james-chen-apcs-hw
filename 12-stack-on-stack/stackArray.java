import java.io.*;
import java.util.*;

public class stackArray {

    //isn't top always 0 then?

    private int top;
    private int numElts;
    private String[] array;
    private int arraysize = 2;
    
    public stackArray() {
	
	array = new String[arraysize];
	int top = -1;
	numElts = 0;
    }

    //push
    public void push(String s) {
	if (numElts == 0){
	    array[0]=s;
	    top = 0;
	    numElts++;
	}
	else if (numElts > 0 && numElts < arraysize) {
	    for(int i = numElts - 1; i >= 0; i--) {
		array[i+1] = array[i];
	    }
	    array[0] = s;
	    top = 0;
	    numElts++;
	}
	else {
	    String[] tmp = new String[arraysize + 1];
	    arraysize++;
	    for(int i = numElts;i> 0; i--) {
		tmp[i] = array[i-1];
	    }
	    tmp[0] = s;
	    array = tmp;
	    numElts++;
	    top = 0;

	}
    }

    //pop
    public String pop() {
	String ret = array[top];
	if (numElts == 0) {
            throw new NoSuchElementException("Empty Stack");
        }
	String[] tmp = new String[arraysize-1];
	for ( int i = numElts-1; i>0; i--) {
	    tmp[i-1] = array[i];
	    
	}
	array = tmp;
	numElts--;
	return ret;
	
    }


    //peek
    public String peek(){
	return array[top];
    }

    //isEmpty
    public boolean isEmpty(){
	return numElts == 0;
    }

    //toString
    public String toString() {
	String s = "";
	for(int i = 0;i<numElts; i ++) {
	    s = s +" "+ array[i];
	}
	return s;
    }

   
	public static void main(String[] args){
	stackArray a  = new stackArray();
	a.push("one");
	a.push("two");
	a.push("three");
	a.push("four");
	System.out.println(a);
	System.out.println(a.isEmpty());
	System.out.println(a.pop());
	System.out.println(a);
	
	
    
    }

}
