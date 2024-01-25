//Leetcode Question 
//Q.no: 704. Binary Search
//Q. Link : https://leetcode.com/problems/binary-search/description/

//TC = nlogn;
//SC = O(1);

class binarySearch {
    public int search(int[] nums, int target) {
        int low=0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}