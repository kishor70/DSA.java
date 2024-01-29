//Leetcode Question 
//Q.no: 704. Binary Search
//Q. Link : https://leetcode.com/problems/binary-search/description/

//TC = n;
//SC = O(1);

public class MajorityElement {
        public static int findMajorityElement(int[] nums) {

            int n= nums.length;
            int count = 0;
            int majority = 0;

            for(int i=0; i<n; i++){
                if(nums[i] == nums[majority]){
                count++;
                }else{
                    count--;
                }

                if(count == 0){
                    majority = i;
                }
            }
            return nums[majority];
        }
            
    
        public static void main(String[] args) {
            int[] nums = {1, 2, 2, 2, 3, 2, 4, 2, 5};
            int majorityElement = findMajorityElement(nums);
            System.out.println("Majority element: " + majorityElement); 
    }
}
    
