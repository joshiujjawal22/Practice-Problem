import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    
	   
	    Scanner sc=new Scanner(System.in);
	    int n1=sc.nextInt(); //row size
	    int n2=sc.nextInt(); //column size
	    int k=sc.nextInt(); //shift
	    int arr[][]=new int[n1][n2];
	    
	    for(int i=0;i<n1;i++)
	    {
	        for(int j=0;j<n2;j++)
	        
	        {arr[i][j]=sc.nextInt();}
	    }
	    int v=0;
	    if(k>=n2) {System.out.println("Wrong Inputs");}
	    else {
	        while(v<n1)
	        {
	                for(int j=k;j<n2;j++)  System.out.print(arr[v][j]+" ");
	                for(int j=0;j<k;j++)   System.out.print(arr[v][j]+" ");
	                System.out.println();
	          v++;  
	        }
	    }
	}
	}
