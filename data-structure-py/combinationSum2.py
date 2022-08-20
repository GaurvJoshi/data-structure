def combinationSum(arr,target,ind,result,seq):
    if (target==0):
        # print("check 2")
        newL = seq[:]
        result.append(newL)
        # for i in result:
        #     print(result)
        return result 
    for i in range(ind,len(arr)):
        print("check 3 i ind",i,ind)
        if(i>ind and arr[i]==arr[i-1]):
                continue
        if arr[i]>target:
                break
        seq.append(arr[i])
        # print("check 1 ",seq,target,result)
        combinationSum(arr,target-arr[i],i+1,result,seq)
        seq.pop()
    return result

result = []
arr = [1,1,1,2,2]
target = 4
print(combinationSum(sorted(arr),target,0,result,[]))