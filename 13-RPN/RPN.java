import java.io.*;
import java.util.*;

public class RPN {

    private static 

    //sean yip

    public RPN() {
    }

    public String calculator(String x) {
	String ans = "";
	Scanner scans = new Scanner(x).useDelimiter(" ");
	while (scans.hasNext()) {
	    String next = scans.next();
	    if((next.length()==1) && (net.matches("[+\\-\\*/%]"))) {
		if (stack
		
	    }
	}
    }
    public static void main(String[] args){
	String s = args[0];
        RPN a = new RPN();
        System.out.println(a.calculator(s));
        
    }
    
}
