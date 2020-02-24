import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    LinkedList<Integer> LI_arr=new LinkedList<Integer>();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int a=sc.nextInt();
	        LI_arr.add(a);
	    }
	    Collections.sort(LI_arr);
	    System.out.println(LI_arr.get(n-1));
	}
}
