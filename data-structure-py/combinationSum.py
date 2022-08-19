def combinationSum(arr,ind,k,seq):
    if (k==0):
        print(seq)
        return
    elif (k<0):
        return
    elif (ind==len(arr) and k>0):
        return
    seq.append(arr[ind])
    combinationSum(arr,ind,k-arr[ind],seq)
    seq.pop()
    combinationSum(arr,ind+1,k,seq)
    return

combinationSum([1,2,3,4,7],0,7,[])