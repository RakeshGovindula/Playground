#include<iostream>
using namespace std;
int meo(int n,int* a)
{
  int count1=0,count2=0;
for(int i=0;i<n;i++)
{
  if(a[i]%2==0)
    count1++;
  else
    count2++;
}
  if(count1!=0 && count2!=0)
    return 3;
  else if(count1!=0)
    return 1;
  else if(count2!=0)
    return 2;
}
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
    cin>>a[i];
  int x=meo(n,a);
  if(x==1)
    cout<<"The array is Even";
  else if(x==2)
    cout<<"The array is Odd";
  else if(x==3)
    cout<<"The array is Mixed";
  
}