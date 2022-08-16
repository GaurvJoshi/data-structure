def checkPalindrom(str,index):
    if(index>=len(str)-index-1):
        return True
    if(str[index]!=str[-1-index]):
        return False
    return checkPalindrom(str,index+1)

print(checkPalindrom('madam',0))
print(checkPalindrom('hello',0))