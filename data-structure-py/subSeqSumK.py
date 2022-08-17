def subSeqSum(ind,seq):
     if(ind==len(arr)):
        if(sum(seq)==k):
            print(seq)
            return
        return
     subSeqSum(ind+1,seq)
     seq.append(arr[ind])
     subSeqSum(ind+1,seq)
     seq.pop()

arr=[1,2,3,4]
k=6
subSeqSum(0,[])