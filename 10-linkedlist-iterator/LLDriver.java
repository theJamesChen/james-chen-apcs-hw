// Worked with Lise Ho
// had a hard time understanding E
import java.util.*;
public class LLDriver{
    public static void main (String[]args){
	MyLinkedList<String> L = new MyLinkedList<String>();
	L.add(12,"Sully");
	L.add(33,"Mike");
	L.add(44,"Liz");
	L.add("Rob");
	System.out.println(L);
	L.add(L.size()-1, "John");
	System.out.println(L);
	L.add("Terri");
	System.out.println(L);

	System.out.println("\nTESTING ITERATOR AND ITERABLE" );
	MyLLIterator<String> it = L.iterator();
	while (it.hasNext())
	    System.out.println(it.next());
	System.out.println();

	for (String s : L)
	    System.out.println(s);

    }
    
}
