package InterviewPrep;

//Time: O(N)
//Space: O(1)
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int k = 1;
        int curInd = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[curInd++] = nums[i];
                k++;
            }
        }
        return k;
    }
}

/*

//Time: O(N)
//Space: O(N)

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : nums) {
            uniqueSet.add(num);
        }
        int i = 0;
        int k = uniqueSet.size();
        for (Integer num : uniqueSet) {
            nums[i++] = num;
        }
        return k;
    }
}

*/