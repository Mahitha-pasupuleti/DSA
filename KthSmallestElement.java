import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();

		while(t-->0)
		{
		    int n=sc.nextInt();

		    int arr[]=new int[n];

		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();

		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
	/* https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1 */
	    
        /*
        BRUTE FORCE APPROACH
        This code segment iterators alot if k is a large element hence TIME LIMIT EXCEEDED exception */

        // int min = 0;
        // int x = 0;
        // while(k!=0) {
        //     min = 999999999;
        //     for(int i=0; i<=r; i++) {
        //         if(arr[i]!=-1 && min>arr[i]) {
        //             min = arr[i];
        //             x = i;
        //         }
        //     }
        //     arr[x] = -1;
        //     k--;
        // }


        /*
        OPTIMIZED APPROACH
        STEPS
        1) Use a Set data structure to store array values in a sorted order.
        2) Use Iterator to iterate the set data structure till k times, to get the kth smallest element.
         */

        /*
        Alternative use merge sort to sort the array and return the (k-1)th array element
         */

        Set<Integer> a = new TreeSet<Integer>();
        for(int i=0; i<=r; i++) {
            a.add(arr[i]);
        }

        Iterator<Integer> itr = a.iterator();

        int min = 0;
        while(k!=0) {
            min = itr.next();
            k--;
        }

        return min;
    }
}
