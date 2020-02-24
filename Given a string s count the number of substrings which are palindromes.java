import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String n=sc.next();
	    int j=0;
	    int c_s=0;
	    int c=0;
	    for(int i=j+1;i<=n.length();i++)
	    {       c++;
	        StringBuffer a=new StringBuffer(n.substring(j,i));
	        System.out.println(a);
	        a.reverse();
	        System.out.println("reverse of "+a);
	        if((n.substring(j,i)).equals(a.toString())) c_s++;
	        if(c==n.length()-j) {++j;i=j;c=0;}
	        
	    }
	   System.out.println("Numbers of substrings which are palindrome are"+c_s);
	
	   
	   
	}
}
