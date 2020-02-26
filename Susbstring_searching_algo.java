// Kruth Morris pratt ALgo .Algo to find Substring

import java.util.Scanner;
// class main{
// public static void main(String args[]){
// 	Scanner sc=new Scanner(System.in);
// 	String s=sc.next();
// 	String find=sc.next();
// 	int a[]=new int[s.length()];
// 	int i=1;
// 	int j=0;
// 	while(i<s.length())
// 	{
// 		if(s.charAt(i)==s.charAt(j)){
// 			j++;
// 			a[i]=j;
// 			i++;
// 		}
// 		else{
// 			if(j!=0) j=a[j-1];
// 			else {a[i]=0;i++;}
// 		}
// 	}
// 	 i = 0;
// 	 j=0;
//         while (i < s.length()) { 
//             if (find.charAt(j) == s.charAt(i)) { 
//                 j++; 
//                 i++; 
//             } 
//             if (j == find.length()) { 
//                 System.out.println( (i - j)); 
//                 j = a[j - 1]; 
//             } 
  
//             else if (i < s.length() && find.charAt(j) != s.charAt(i)) { 
//                 if (j != 0) 
//                     j = a[j - 1]; 
//                 else
//                     i = i + 1; 
// }
// }
// }
// }

// Brute method to find Substring
// class subs{
// public static void main(String args[]){
// 	Scanner sc=new Scanner(System.in);
// 	String s=sc.next();
// 	String find=sc.next();
// 	for(int i=0;i<s.length();i++)
// 	{	int k=i,c=0;
// 		for(int j=0;j<find.length();j++)
// 		{	
// 			if(s.charAt(k)==find.charAt(j)) {c++;k++;continue;}
// 			break;
// 		}
// 		if(c==find.length()) System.out.println(i);

// 	}

// }
// }

