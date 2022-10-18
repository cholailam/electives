sum=1
times=0
def log2(n):
    global sum,times
    if n==1:
        return 0
    elif n>=sum:
        sum=sum*2
        times+=1
        return log2(n)
    return times-1

n=int(input())
print(log2(n))
