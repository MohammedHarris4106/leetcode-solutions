# 75. Sort Colors

### Difficulty: Medium

## Description
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 
Example 1:


Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]


Example 2:


Input: nums = [2,0,1]
Output: [0,1,2]


 
Constraints:


	n == nums.length
	1 <= n <= 300
	nums[i] is either 0, 1, or 2.


 
Follow up: Could you come up with a one-pass algorithm using only constant extra space?

## Submission Details
- **Status**: Accepted
- **Runtime**: 0 ms
- **Memory**: 43280000
- **Language**: java

## Code
```java
class Solution {
    public void sortColors(int[] nums) {
        int[] ans=new int[nums.length-1];
        int a=0;
        int w=0;
        int b=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==2){
            b++;

        }
        if(nums[i]==0){
            a++;
        }
        if(nums[i]==1){
            w++;
        }
       }
       int index=0;
       while(a-->0){
        nums[index++]=0;
       }
       while(w-->0){
        nums[index++]=1;
       }
       while(b-->0){
        nums[index++]=2;
       }
       return;
    }

}
```
