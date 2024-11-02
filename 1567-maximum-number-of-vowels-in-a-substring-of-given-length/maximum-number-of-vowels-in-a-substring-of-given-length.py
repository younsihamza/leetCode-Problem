class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowel = 0
        hold = ['a','e','i','u','o']
        for i in range(k):
            if s[i] in hold:
                vowel += 1
        if(vowel == k):
            return k
        j = 0
        maxs = vowel
        for i in range(k,len(s)):
            if(vowel == k):
                return k
            if s[i] in hold:
                vowel += 1
            if s[j] in hold:
                vowel -= 1
            maxs = max(vowel,maxs)
            j+= 1
            
        return maxs