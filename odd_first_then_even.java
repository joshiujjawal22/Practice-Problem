import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int k=-1;
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a_s[]=new int[n];
		for(int i=1;i<=n;i++) {if(i%2!=0){++k;a_s[k]=i;}}
		for(int i=n;i>=1;i--) {if(i%2==0){++k;a_s[k]=i;}}
		for(int i=0;i<n;i++) System.out.print(a_s[i]+" ");
		
	}
}
