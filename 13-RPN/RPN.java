public class RPN {
    //oops i messed up. +/-/// on strings instead of the actual number.

    public class MyStack {

	private Node top;
	private int numElts;
	
	public MyStack(){
	    top = null;
	    numElts = 0;
	}
	
	public void push(String s){
	    Node n = new Node(s);
	    n.setNext(top);
	    top = n;
	    numElts = numElts+1;
	}
	
	public String pop() {
	    String ret = top.getData();
	    top = top.getNext();
	    numElts = numElts-1;
	    return ret;
	}
	
	public String peek() {
	    return top.getData();
	    
	}
	
	public int size() {
	    return numElts;
	}
	
	public boolean isEmpty() {
	    return top==null;
	}
	
	public String toString() {
	    String s="";
	    
	    for (Node tmp = top; tmp != null; tmp = tmp.getNext()){
		s = s + tmp.getData()+", ";
	    }
	    /*
	      Node tmp = top;
	      while(tmp!=null) {
	      s = s + tmp.getData()+", ";
	      tmp = tmp.getNext();
	      }
	    */
	    return s.substring(0,s.length()-2);
	}
    }
    
    MyStack stack = new MyStack();
    
    public String calculator(String x) {
	String ans = "";
	for (int i = 0; i<x.length(); i++) {
	    if(x.charAt(i) == '*') {
		String j = stack.peek();
		stack.pop();
		j = j * stack.peek();
		stack.pop();
		stack.push(j);
	    }
	    else if(x.charAt(i) == '/') {
		String j = stack.peek();
		stack.pop();
		j = j / stack.peek();
		stack.pop();
		stack.push(j);
	    }
	    else if(x.charAt(i) == '+') {
		String j = stack.peek();
		stack.pop();
		j = j + stack.peek();
		stack.pop();
		stack.push(j);
	     }
	     else if(x.charAt(i) == '-') {
		String j = stack.peek();
		stack.pop();
		j = j - stack.peek();
		stack.pop();
		stack.push(j);
	    }
	     else if(x.charAt(i) == ' ') {
		 if (ans != "") {
		     String j = ans;
		     stack.push(j);
		     ans = "";
		 }
	     }
	     else {
		 ans = ans + x.charAt(i);
	     }
	    
	    
	}
	String result = stack.peek();
	return result;
	
	
    }
    public static void main(String[] args){
	String s = args[0];
        RPN a = new RPN();
        System.out.println(a.calculator(s));
        
    }
    
}
