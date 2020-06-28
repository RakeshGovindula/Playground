num=int(input())
div=list()
for i in range(1,int(num**0.5)+1):
  if num%i==0:
    print(i,end=" ")
    if num/i!=i:
      div.append(int(num/i))
div.sort()
print(*div,end=" ")