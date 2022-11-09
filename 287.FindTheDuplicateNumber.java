/*

**Approach 1:(TIME LIMIT EXCEEDED)
STEPS:**
1) Take a new Arraylist, while copying the array elements into ArrayList check if the element already exists, if it already 
exists in Arraylist return it, else add the new element to the ArrayList.

**Approach 2:
STEPS:**
1) Sort the Array.
2) Loop throught he array from 0 to n-2, check if nums[i]==nums[i+1] i.e if there are any adjacent equivalent elements nums[i]
should be returned else return 0.
 */


class Solution {
    public int findDuplicate(int[] nums) {
    //    ArrayList<Integer> a = new ArrayList<Integer>();
       int n = nums.length;

    //    for(int i=0; i<n; i++) {
    //        if(a.contains(nums[i])) {
    //            return nums[i];
    //        }
    //        else {
    //            a.add(nums[i]);
    //        }
    //    }
    //    return 0;

        Arrays.sort(nums);

        for(int i=0; i<n-1; i++) {
            if(nums[i]==nums[i+1]) {
               return nums[i];
            }
        }
        return 0;
    }
}
