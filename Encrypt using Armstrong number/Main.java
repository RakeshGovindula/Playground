#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int a,temp=n,t1=n;
  int sum=0,count=0;
  while(t1>0)
  {
    t1=t1/10;
    count++;
  }
  while(n>0)
  {
  a=n%10;
    sum=sum+power(a,count);
    n=n/10;
  }
  if(temp==sum)
    return 1;
  else
    return 0;
  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}