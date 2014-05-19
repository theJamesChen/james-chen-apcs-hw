import java.util.PriorityQueue;
import java.util.Collections;

public class MedianHeap {

    private PriorityQueue<Integer> min, max;

    public MedianHeap () {
	min = new PriorityQueue<Integer> ();
	max = new PriorityQueue<Integer> (11,Collections.reverseOrder());
	//taken from Norman's code
    }
    
    public void add (int n) {
	if (min.size() <= max.size())
	    min.add (n);
	else
	    max.add(n);
    }
    public Integer findMedian() {
	if ((min.peek() == null) && (max.peek() == null))
	    return null;
	if ((max.size() + 1) == min.size())
	    return min.peek();
	if ((min.size() + 1) == max.size())
	    return max.peek();
	else
	    return ((min.peek() + max.peek())/2);
    }
    public void removeMedian() {
	if ((min.size() == 0) && (max.size() == 0))
	    return;
	else if (min.size() < max.size())
	    max.poll();
	else if (min.size() > max.size())
	    min.poll();
	else {
	    min.poll();
	    max.poll();
	}
    }
}



