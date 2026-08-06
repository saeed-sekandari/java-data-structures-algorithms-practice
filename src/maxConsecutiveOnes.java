//This is an array DS practice
//So, we are given a binary array of numbers, and we should find
//the max consecutive 1's [011001110]
public class maxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums){


        int currentCount = 0;
        int maxCount = 0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] == 1){
                currentCount++;
            }
            else {
                currentCount = 0;
            }
            maxCount = Math.max(currentCount, maxCount);
        }
        return maxCount;
    }
}
