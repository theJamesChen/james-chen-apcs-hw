import java.util.*;
import java.io.*;

public class quicksort2{
    private Random rnd = new Random();

    public int partition(int[] a, int l, int r) {

       	int tmp;
	int pivotIndex = l+rnd.nextInt(r-l);
	int pivot = a[pivotIndex];
	tmp = a[r];
	a[r] = a[pivotIndex];
	a[pivotIndex]=tmp;
	int wall=l;
	int Rwall = wall;

	for (int j=wall;j<r;j++) {
	    if (a[j] == pivot){
		tmp = a[j];
		a[j] = a[Rwall];
		a[Rwall] = tmp;
		Rwall++;
	    }
	}

	for (int i = l; i <r; i++) {
	    if (a[i]<pivot) {
		tmp = a[i];
		a[i]=a[wall];
		a[wall]=tmp;
		wall++;
	    }
	}
    
	tmp = a[wall];
	a[wall]=a[r];
	a[r]=tmp;
	return ((Rwall+wall)/2);
       
    }
    
    public void qsort(int[] a, int l, int r) {
	if (r-l <= 1)
	    return;
	else {
	    int pi = partition(a,l,r);
	    if (pi-1>l)
		qsort(a,l,pi-1);
	    if (pi+1<r)
		qsort(a,pi+1,r);

	}
    }
    public void  qsort(int[] a) {
	qsort(a,0,a.length-1);
    }


    public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
	long start,elapsed;

	Random rnd = new Random();
	int[] a = new int[n];
	for (int i=0;i<n;i++)
	    a[i]=rnd.nextInt(100);
	//System.out.println(Arrays.toString(a));
	quicksort2 q = new quicksort2();
	System.out.println("Starting");
	start = System.currentTimeMillis();
	q.qsort(a);
	elapsed = System.currentTimeMillis()-start;
	System.out.println("Time: "+elapsed+"\n");
	//int p = q.partition(a,0,a.length-1);
	//System.out.println("a["+p+"] = "+a[p]);	
	//System.out.println(Arrays.toString(a));
    }
    
}    
