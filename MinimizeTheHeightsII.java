//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

/*
STEPS:
1) Sort the array so we can get min and max elements first.
2) Get the difference of the min and max elements.
3) Our standard idea is to increment the min ele by k and decrement the max ele by k, because
   -> Increment min, max by k : (max+k)-(min+k) = max-min
   -> Decrement min, max by k : (max+k)-(min+k) = max-min
   -> Increment min by k, Decrement max by k : (max-k)-(min+k) = max-min-2k  better
   -> Anyway the 1st and 2nd inc/dec value gets covered in diff = max-min
4) Now our standard max value is arr[n-1]-k, we need to find if there is any other max element other than this when k is
   incremented to other elements.
5) Now our standard min value is arr[0]+k, we need to find if there is any other min element other than this when k is
   decremented to other elements.
6) Then find diff of the newly obtained max and min of the array once k is incremented or decremented.
7) if the diff smaller than the existing diff, then store it, once loop done return it.

CODE:
https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
*/

// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        if(n==1)
         return 0;

        Arrays.sort(arr);

        int diff = arr[n-1]-arr[0];
        int min, max;

        for(int i=1; i<n; i++) {

            if(arr[i]-k < 0) continue;

            max = Math.max(arr[i-1]+k, arr[n-1]-k);
            min = Math.min(arr[0]+k, arr[i]-k);
            diff = Math.min(diff, max-min);
        }

        return diff;
    }
}
