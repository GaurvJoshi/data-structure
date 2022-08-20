def subSet(arr,ind,seq,sum):
    if(len(arr)==ind):
        print(seq)
        return
    seq.append(arr[ind])
    subSet(arr,ind+1,seq)
    seq.pop()
    subSet(arr,ind+1,seq)

subSet([1,2,3,4],0,[],0)
