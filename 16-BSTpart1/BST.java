public class BST {
    private Node root;

    public BST() {
        root = null;
    }

    public BST(Node new) {
	root = new;
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

      if (compare(data, current.getData()) == 0)
      	return current;

      if (compare(data, current.getData()) < 0)
         current.setLeft = insert(current.getLeft, data);
      else
         current.setRight = insert(current.getRight, data);

      return current;
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
	    return search(c,x);
	}
    }
    



}
