#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,count=0,t;
  cin>>n;
  while(sum<n){
  cin>>t;
    sum=sum+t;
    count++;
  }
  cout<<"The number of turns is "<<count;
}