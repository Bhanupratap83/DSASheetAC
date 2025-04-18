import java.util.*;

public class MajorityElement{
    public int majorityElement(int[] nums) {
        int mc = nums.length/2;

        for(int i=0; i<nums.length; i++){
            int cnt = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
            if(cnt > mc){
                return nums[i];
            }
        }

        return -1;
    }
}