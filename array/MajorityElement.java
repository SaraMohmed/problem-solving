package org.example.array;

public class MajorityElement {
    public int majorityElement(int[] nums){
        int c = 0;
        int majority = nums[0];
        for(int num : nums){
            if(c == 0)
                majority = num;
            if(majority == num)
                c++;
            else
                c--;
        }
        return majority;
    }
}
