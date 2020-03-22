import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the happyLadybugs function below.
    static String happyLadybugs(String b) {
        int n=b.length();
        int flag=0;
        int count=0;
        for(int i=0;i<n;i++){
        if(b.substring(i,i+1).equals("_")) count++;}
        if(count==b.length()) return "YES";
        if(count>0) {flag=1;}
        for(int i=0;i<n;i++)
        {   int c=0;
                    for(int j=0;j<n;j++)
                    {
                        if(b.charAt(i)==b.charAt(j) && b.charAt(i)!='_') c++;
                    }
                if(c==1) return "NO";       
        } 
        if(flag==1) {return "YES";}
        else {
            for(int i=1;i<n-1;i++)
            {
                
                    if(b.substring(i,i+1).equals(b.substring(i+1,i+2))){}
                    else if(b.substring(i,i+1).equals(b.substring(i-1,i))){}
                    else return "NO";
                }
            }
        return "YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
