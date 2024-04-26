class Solution {
public:
    static bool isPalindrome(int x) {
        long number  = x;
        long reverceNumber = 0;
        if(x < 0)
            return false;
        while(number != 0)
        {
            reverceNumber *=10;
            reverceNumber += number % 10;
            number /=10;
        }
        if(x == reverceNumber)
            return true;
        return false;
    }
};