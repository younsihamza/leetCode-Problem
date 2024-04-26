class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        table = []
        def RecursionHelp(n , value , add):
            if value.count('(') == n and value.count(')') == n :
                table.append(value) 
                return
            value += add
            if value.count('(') <= n :
                RecursionHelp(n , value , '(')
            if value.count(')') <= n  and value.count(')') < value.count('(') :
                RecursionHelp(n , value , ')')
        
        if n :
            RecursionHelp( n , "" , '(')
        return table

        