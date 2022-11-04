//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }

            Compute obj = new Compute();
            obj.rotate(a, n);

            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);

        }
	}
}


// } Driver Code Ends

/*
STEPS:
1) Take a new array brr of size n.
2) Copy the last element of arr[n-1] and copy into first element of brr[0].
3) Copy elements of arr into brr by incrementing i, i.e brr[i+1] = arr[i];
4) Copy back brr into array

CODE:
https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
*/

//User function Template for Java

class Compute {

    public void rotate(int arr[], int n)
    {
        int[] brr = new int[n];
        brr[0] = arr[n-1];

        for(int i=0; i<n-1; i++) {
            brr[i+1] = arr[i];
        }

        for(int i=0; i<n; i++) {
            arr[i] = brr[i];
        }

    }
}
