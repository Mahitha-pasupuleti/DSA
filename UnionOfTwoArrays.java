//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {

	    //Taking input using class Scanner
		Scanner sc=new Scanner(System.in);

		//Taking total count of testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{

		    int n,m;

		    //taking size of array a
		    n=sc.nextInt();

		    //taking size of array b
		    m=sc.nextInt();

		    //Creating 2 array of size n and m
		    int a[]=new int[n];
		    int b[]=new int[m];

		    //inserting elements to array a
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }

		    //inserting elements to array b
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    Solution ob=new Solution();
		    //calling doUnion method and printing the results
		    System.out.println(ob.doUnion(a,n,b,m));
		}

	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        /*
        STEPS:
        1) Intially used Arraylist instead of Set but it gave TLE Exception
        2) Use HashSet data structure it doesn't store duplicates and doesn't sort.
        3) Copy first array elements into set.
        4) Copy second array elements into set.
        5) Return Set size.

        CODE:
        https://practice.geeksforgeeks.org/problems/union-of-two-arrays/0
        */

        // ArrayList<Integer> arr = new ArrayList<Integer>();
        Set<Integer> arr = new HashSet<Integer>();

        for(int i=0; i<n; i++) {
                arr.add(a[i]);
        }

        for(int i=0; i<m; i++) {
                arr.add(b[i]);
        }

        // Iterator<Integer> itr = arr.iterator();
        // while(itr.hasNext()) {
        //     int min = itr.next();
        //     System.out.print(min + " ");
        // }

        return arr.size();
    }
}
