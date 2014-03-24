public class LLDriver {

    public static void main(String[] args) {
	MyLinkedList L = new MyLinkedList();

	L.add("Sully");
	System.out.println(L);
	//	L.add("mike");
	L.add(2,"tommy");
	System.out.println(L);
	//L.add("randall");
	//System.out.println(L);
	//L.add("boo");
	//System.out.println(L);
	
	//System.out.println(L);
	/*
	System.out.println("<-----ADDING TO LINKED LIST INDEX----->");
	L.add(3,"indexzero");
	System.out.println(L.size());
	System.out.println(L);
	System.out.println("<-----ADDING TO LINKED LISTINDEX :OUT OF BOUNDS----->");
	L.add(5,"indexzero");
	System.out.println(L);

	System.out.println();
	System.out.println();
	System.out.println("<-----GET INDEX----->");
	System.out.println(L);
	System.out.println(L.get(4));
	// out of bounds test case
	//System.out.println(L.get(5));
	System.out.println();
	System.out.println();


	System.out.println("<-----SET AT INDEX----->");
	System.out.println(L);
	System.out.println(L.set(4,"hello"));
	System.out.println(L);
	*/

    }
}
