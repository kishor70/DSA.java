//Leetcode Question 
// Boyer Moore Algorithm
//Q. No. 169. Majority Element
//Q. Link : https://leetcode.com/problems/majority-element/description/

//TC = n;
//SC = O(1);

public class MajorityElement {
        public static int findMajorityElement(int[] nums) {

            int n= nums.length;
            int count = 1;
            int majority = nums[0];

            for(int i=1; i<n; i++){
                if(nums[i] == majority){
                count++;
                }else{
                    count--;
                }

                if(count == 0){
                    majority = nums[i];
                    count=1;
                }
            }
            return majority;
        }
            
    
        public static void main(String[] args) {
            int[] nums = {1, 2, 2, 4, 5, 2, 5 , 3, 5, 2, 5};
            int majorityElement = findMajorityElement(nums);
            System.out.println("Majority element: " + majorityElement); 
    }
}
    
