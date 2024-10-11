class Solution:
    def convert(self, s: str, numRows: int) -> str:
        hold_2d = []
        number = 0
        hold = [0]*numRows
        j = (int) ( numRows - 2)
        for i in s:
            if number < numRows:
                hold[number] = i
                number += 1
                j =  ( numRows - 2)
                if number == numRows:
                    hold_2d.append(hold)
                    hold = [0]*numRows
                    if j  == 0 or numRows <= 2:
                        number =  0
            else:
                hold[j] = i
                j -= 1
                if j == 0:
                    hold_2d.append(hold)
                    hold = [0]*numRows
                    number =  0
        if number != 0:
            hold_2d.append(hold)
        i = 0
        j = 0
        word_zig_zag = ""
        for j in range(0,numRows):
            for i in range(0,len(hold_2d)):
                if hold_2d[i][j] != 0:
                    word_zig_zag += hold_2d[i][j]
        # print(hold_2d)
        return word_zig_zag