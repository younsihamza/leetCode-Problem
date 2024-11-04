class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        String result = "";
        int i = 0;
        for(; i < word1Len && i < word2Len;i++) {
                result += (char)word1.charAt(i) +""+ (char)word2.charAt(i);
        }
        if(i < word2Len)
            result += word2.substring(i,word2Len);
        if(i < word1Len)
            result += word1.substring(i,word1Len);
        return result;
    }
}