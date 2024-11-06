class Solution {
    private Integer gcd(Integer num1, Integer num2){
        if(num1 == 0)
            return num2;
        else if(num2 == 0)
            return  num1;
        return gcd(num2, num1%num2);
    }
    public String gcdOfStrings(String str1, String str2) {
        List<Integer> prifex = new ArrayList<>();
        int sumS1 = 0;
        int tmp = 0;
        if(!(str1+str2).equals(str2+str1))
            return "";
        for(int i  = 0 ; i < str2.length(); i++) {
            tmp += str2.charAt(i);
            prifex.add(tmp);
        }
        for(int i  = 0 ; i < str1.length(); i++) {
            sumS1 += str1.charAt(i);
        }
        int index = prifex.indexOf(gcd(sumS1,tmp));
        return (index == -1 ? "" : str2.substring(0,index+1));

    }
}