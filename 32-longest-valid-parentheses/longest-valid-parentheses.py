class Solution:
    def longestValidParentheses(self, s: str) -> int:
        hold = []
        max = 0
        current = 0
        
        for i in range(0,len(s)):
            if s[i] == '(':
                hold.append(s[i])
            else:
                if len(hold) and  hold[-1] == '(':
                    hold[-1] = 2
                    if len(hold) > 1 and type(hold[-2]) == int:
                        hold.pop()
                        hold[-1] += 2
                elif len(hold) > 1 and  hold[-2] == '(':
                    value = hold.pop()
                    hold[-1] = value + 2
                    if len(hold) > 1 and type(hold[-2]) == int:
                        value = hold.pop()
                        hold[-1] += value
                else:
                    hold.append(s[i])
        for i in hold:
            if type(i) == int:
                if max < i:
                    max = i
        return max