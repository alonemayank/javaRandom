import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by apurvatripathi on 12/31/18.
 */
public class backTrack {

    List<List<Integer>> result;
    public List<List<Integer>> combination(int[] arr){
        result = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        for(int i: arr) num.add(i);
        combinationHelper(num, new ArrayList<>(), num.size());
        return result;
    }

    private void combinationHelper(ArrayList<Integer> num, ArrayList<Integer> ch, int len){
        //System.out.println(ch);
        if(ch.size() == len){
            result.add(new ArrayList<>(ch));

            return;
        }

        for(int i=0; i<num.size(); i++){
            if(ch.contains(num.get(i))) continue;
            ch.add(num.get(i));

            combinationHelper(num, ch, len);

            ch.remove(ch.size()-1);

        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int start = 0;
        int len = haystack.length();
        while(start < len){
            if(haystack.charAt(start) == needle.charAt(0)){
                int fast = start;
                int n = 0;
                boolean flag = true;
                while(fast < len && n < needle.length()){
                    if(haystack.charAt(fast++) != needle.charAt(n++)){
                        flag = false;
                        break;
                    }
                }
                if(flag && n == needle.length()) return start;
            }
            start++;
        }

        return -1;
    }


    public static void main(String args[]){

        backTrack obj = new backTrack();
        System.out.println(obj.combination(new int[]{1,2,3}));
        System.out.println(obj.subsets(new int[]{1,2,3}));
        System.out.println(obj.strStr("hello", "ll"));
    }

}
/*


 */