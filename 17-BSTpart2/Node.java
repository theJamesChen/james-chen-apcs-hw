public class Node {
    private int data;
    private Node left, right;

    public Node (int data){
	this.data = data;
    }
    public Node getLeft(){
	return left;
    }
    public Node getRight(){
	return right;
    }
    public void setLeft(Node left){
	this.left = left;
    }
    public void setRight(Node n){
	this.right = right;
    }
    public int getData(){
	return data;
    }
    public String toString(){
	return data + "";
    }
}
