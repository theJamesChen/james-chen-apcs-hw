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
	if(i = 0)
	    head.add(s);
	else {
	    
	    while(tmp.getNext()!=null) {
		if(counter = i) {
		    
		}
		tmp = tmp.get
	    }
	}
	
    }
    
    

}
