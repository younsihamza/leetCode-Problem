import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<String> checkSet;
        int currentIndex = 0;
        int leftIndex = -1;
        int maxLen = 0;
        String hold = "";
        for (; currentIndex < s.length(); currentIndex++) {
            hold = s.substring(leftIndex+1,currentIndex+1);
            checkSet =  new HashSet<String>(Arrays.asList(hold.split("")));
            if(hold.length() == checkSet.size())
                maxLen = Math.max(hold.length(),maxLen);
            while(hold.length() != checkSet.size() && currentIndex >  leftIndex) {
                leftIndex++;
                hold = s.substring(leftIndex+1,currentIndex+1);
                checkSet =  new HashSet<String>(Arrays.asList(hold.split("")));
            }

        }
        return maxLen;
    }
}