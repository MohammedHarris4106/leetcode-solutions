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