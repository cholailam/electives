size,head=input().split()
head=int(head)
index=input().split()
nextpt=input().split()
next=int(nextpt[head-1])

if head!=0:
    while next!=0:
        print(index[head-1])
        head=next
        next=int(nextpt[head-1])
    print(index[head-1])

print('End')
