class Solution {
    private boolean isVowel(char a){
        return switch(a) {
            case 'a','i','u','o','e','A','I','U','O','E'-> true;
            default -> false;
        };
    }
    public String reverseVowels(String s) {
        char[] hold = s.toCharArray();
        int  i = 0;
        int j = hold.length  -1;
        char tmp = 0;
        while(i < j) {
            if(isVowel(hold[i]) && isVowel(hold[j]))
            {
                tmp = hold[i];
                hold[i] = hold[j];
                hold[j] = tmp;
                j--;
                i++;
            } else if(isVowel(hold[i])) 
                j--;
            else if(isVowel(hold[j]))
                i++;
            else {
                j--;
                i++;
            }
        }
        return String.valueOf(hold);
    }
}