class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        table = []
        tableOfnumberCompination = []
        dicNumber = dict()
        firstNumber = 97
        for i in range(2,10):
            dicNumber [i] = chr(firstNumber) + chr(firstNumber+1) + chr(firstNumber +2)
            if i == 9 or i == 7:
                dicNumber [i] =  dicNumber[i] + chr(firstNumber + 3)
                firstNumber +=1
            firstNumber += 3
        for i in digits : 
            tonumber = int(i)
            tableOfnumberCompination.append(dicNumber [tonumber])
        def recursion(index , value,char):
                
            value += char
            if len(value) == len(digits) :
                table.append(value)
                return
            for i in tableOfnumberCompination[index]:
                recursion(index + 1, value , i )
        if len(digits):
            recursion(0,"","")
        return table



            



        