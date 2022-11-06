//{ Driver Code Starts
import java.io.*;

class Main {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");

		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }

		    Solution obj = new Solution();

		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends

/*
STEPS:
1) Find the sum of consecutive elements by adding one by one from (0 to n-1).
2) Store the max value till now in a seperate variable.
3) Once (0 to n-1) is done, start from (1 to n-1), then (2 to n-1) and so on, in this way all consecutive sums will be covered.
Of all the sums, keep track of the max sum value of consecutive subarrays.

CODE:
https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
 */

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){

        // Your code here
        int sum=0, num=-99999999, j=0;
        for(int i=0; i<n; i++) {
            sum = sum+arr[i];
            // System.out.print("sum: " + sum + " ");
            num = Math.max(sum, num);
            // System.out.print("num: " + num + " ");
            if(i==n-1 && j!=n-1) {
                i = j;
                ++j;
                // System.out.print("j: " + i + " ");
                sum = 0;
            }
        }

        return num;

    }

}
