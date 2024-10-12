class Solution:
    def last_one(self, hold, val):
        index = -1
        while True:
            try:
                index = hold.index(val, index + 1)
            except ValueError:
                return index
    def checkValidString(self, s: str) -> bool:
        hold = []
        for i in s:
            if i in ['(','*']:
                hold.append(i)
            else:
                if len(hold) == 0:
                    return False
                if '(' in hold:
                    hold.pop(self.last_one(hold,'('))
                else:
                    hold.pop()
        print(hold)
        hold_2 = [] 
        for i in hold:
            if i  == '(':
                hold_2.append(i)
            elif len(hold_2):
                hold_2.pop()
        return False if len(hold_2) else True

        