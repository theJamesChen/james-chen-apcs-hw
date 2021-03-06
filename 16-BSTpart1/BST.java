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
    
    
    
    
}
