import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        
    //     int max=0;
    // for(int i=0;i<s.size()-1;i++)
    // {   Set<Integer> a = new HashSet<Integer>();
    //     for(int j=i+1;j<s.size();j++)
    //     {   
    //         if((s.get(i)+s.get(j))%k!=0) {
    //             a.add(s.get(i));
    //             int c=0;
    //             Iterator<Integer> it=a.iterator();
    //             while(it.hasNext())  
    //             {
    //                 if((it.next()+s.get(j))%k!=0) c++;
    //                 if(c==a.size()) a.add(s.get(j));
    //             }
    //                 } 
    //         if(max<a.size()) max=a.size();
    //     }
    // }
    // return max;
    // }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] sTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sTemp[i]);
            s.add(sItem);
        }

        int result = Result.nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
