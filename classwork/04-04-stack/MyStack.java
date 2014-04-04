public class MyStack {

    private Node top;
    private int numElts;
   
    //constructor 1

   
    public MyStack(){
	top = null;
	numElts = 0;
    }

    //push 2
    public void push(String s){
	Node n = new Node(s);
	n.setNext(top);
	top = n;
	//numElts = numElts+1;
	
    }

    //pop
    public String pop() {
    	String ret = top.getData();
	top = top.getNext();
	numElts = numElts-1;
	return ret;
    }

    //peek
    public String peek() {
	return top.getData();
    }
    

    //isEmpty
    public boolean isEmpty() {
     return top == null;
    }

    public int getSize() {
	return numElts;
    }

    //toString 3
    public String toString(){
	String s = "";
	Node tmp =  top;
	// can also do with for loop
	//	for( Node tmp = top; tmp != null; tmp = tmp.getNext()) {
	//  s += tmp.getData() + ", ";
	//}
	while (tmp != null ) {
	    s += tmp.getData() + ", ";
	    tmp = tmp.getNext();
	}
	return s.substring(0,s.length()-2);
    }


}