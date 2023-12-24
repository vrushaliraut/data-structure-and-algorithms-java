package array;

/*
* Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array.

Example2:
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array.
* */

/*
* Sorting
* Intuition - We can sort the array in asecending order, hence the largest element will be the last index of the array.
*
* Approach -
* Sort the array in ascending order
* Print the ( size of the array - 1 )th index
*
* DryRun -
* Before sorting: arr[] = {2,5,1,3,0};
* After sorting: arr[] = {0,1,2,3,5};
  Hence answer : arr[sizeofthearray-1] =5
* */

import java.util.Arrays;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Largest element in the array is: " + sort(arr1));

        int arr2[] =  {8,10,5,7,9};
        System.out.println("The Largest element in the array is: " + sort(arr2));
    }

    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
