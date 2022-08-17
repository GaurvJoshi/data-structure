def subsequence(ind, empty):
    if ind>=len(arr):
        print(empty)
        return 
    empty.append(arr[ind])
    subsequence(ind+1,empty) # take
    empty.remove(arr[ind])
    subsequence(ind+1,empty) #do not take

    
arr=[1,2,3]
subsequence(0,[])