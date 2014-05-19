public class BST {
    private Node root;
    
    public BST() {
        root = null;
    }
    
    public BST (Node x) {
	root = x;
    }
    
    //insert
    
    public void insert(int data)
    {
	insert(root, data);
    }
   public void insert(Node current, int data)
    {
        if (current == null)
            current = new Node(data);
        else if ( data < current.getData() )
            insert( current.getLeft(), data );
        else if ( data > current.getData() )
            insert( current.getRight(), data );
    }
    
    
    
    //search
    public Node search(int x){
	Node current = root;
	while(current != null && current.getData()!= x){
	    if (current.getData()<x)
		current= current.getRight();
	    else
		current= current.getLeft();
	}
	return current;
    }
    
    //rsearch
    
    public Node search (Node current, int x){
	if (current == null || current.getData() == x)
	    return current;
	else{
	    if (current.getData() > x)
		current=current.getLeft();
	    else
		current = current.getRight();
	    return search(current,x);
	}
    }
    
    //delete - took tasmiur's code for now, I was absent, going to review.
    public Node delete(Node root, int k){
	Node s, s2, n;
	if(root.getData() == k){
	    Node lt, rt;
	    lt = root.getLeft();
	    rt = root.getRight();
	    
	    if(lt == null && rt == null){
		return null;
	    }
	    else if (lt == null){
		s = rt;
		return s;
	    }
	    else if (rt == null){
		s = lt;
		return s;
	    }
	    else{
		s2 = rt;
		s = rt;
		while(s.getLeft() != null){
		    s = s.getLeft();
		    s.setLeft(lt);
		    return s2;
		}
	    }
	}
	if(k < root.getData()){
	    n = delete(root.getLeft(), k);
	    root.setLeft(n);
	}
	else{
	    n = delete(root.getRight(), k);
	    root.setRight(n);
	}
	return root;
    }

    public void traverse (Node n) {
	if (n== null) 
	    System.out.print("");
	else {
	    //prints it in order
	    traverse(n.getLeft());
	    System.out.println(n.getData());
	    traverse(n.getRight());
	}

    }
    public static void main (String[] args) {
	BST x = new BST(new Node(15));
	for (int i = 1; i<40; i+=2) {
	    x.insert(new Node(i));
	    System.out.println(new Node(i));

	}

    }
    
    
    
    
    
    
}
