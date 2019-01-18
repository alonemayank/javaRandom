import java.util.HashSet;
import java.util.Set;

/**
 * Created by apurvatripathi on 1/16/19.
 */
public class longestIncresingSubSequence {

        public int lengthOfLongestSubstring(String s) {
            int len = s.length();
            if(len < 2) return len;
            Set<Character> set = new HashSet<>();
            int start = 0;
            int end = 0;
            int result = 0;
            while(end < len){
                if(set.contains(s.charAt(end))){
                    set.remove(s.charAt(start));
                    start++;
                }else{
                    set.add(s.charAt(end));
                    result = Math.max(end-start, result);
                    end++;
                }
            }
            return result+1;
        }

}
