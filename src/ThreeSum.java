import java.util.*;

/**
 * Created by apurvatripathi on 12/30/18.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> output = new ArrayList<>();
        // validate base cases, if input isnt correct, return
        if(nums == null || nums.length < 3) {
            return output;
        }
        // sort the array in ascending order, and iterate over the array
        Arrays.sort(nums);

        for(int i=0; i< nums.length - 2; i++) {
            // validate base cases
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            // take advantage of sorted nature of array
            int j = i + 1; // j to start immidietely after i
            int k = nums.length - 1;//k to start from end


            if(nums[i] + nums[j] > 0) {
                continue;
            }


            while (j < k) {
                // shift equally from lower as well as higher side
                if(nums[j] + nums[k] + nums[i] == 0 ) {
                    output.add(Arrays.asList(new Integer[]{nums[i],nums[j],nums[k]}));
                    j ++;
                    k --;
                    // if there are subsequent repeating entries, skip them and consider unique only
                    while(j < k && nums[j] == nums[j-1])
                        j ++;
                    while(j < k && nums[k] == nums[k+1])
                        k --;
                }
                // Modify just j and not k and shift on rightside to get number closer to 0
                else if (nums[j] + nums[k] + nums[i] < 0) {
                    j ++;
                }
                // Modify just k and not j and shift on leftside to get number closer to 0
                else if(nums[j] + nums[k] + nums[i] > 0) {
                    k --;
                }
            }
        }
        return output;
    }

    public static void main(String args[]){
        ThreeSum obj = new ThreeSum();
        System.out.println(obj.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}