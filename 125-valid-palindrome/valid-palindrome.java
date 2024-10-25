class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        s = s.toLowerCase();
        while(i < j){
            if(!Character.isDigit(s.charAt(j)) && !Character.isLetter(s.charAt(j)))
            {
                j--;
                continue;
            }
            if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)))
            {
                i++;
                continue;
            }
            
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            
                j--;
        }
        return true;

    }
}