class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        DictHold = {}
        for word in strs:
            soted_word = ''.join(sorted(word))
            if soted_word in DictHold.keys():
                DictHold[soted_word].append(word) 
            else:
                DictHold[soted_word] = [word]
        return DictHold.values()
        