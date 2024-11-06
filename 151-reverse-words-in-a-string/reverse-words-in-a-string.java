class Solution {
    public String reverseWords(String s) {
        String[] hold = s.split(" ");
        Collections.reverse(Arrays.asList(hold));
        s = "";
        for (String i : hold ) {
            if(i.length() != 0)
                s+= i +" ";
        }
        return s.trim();   
    }
}