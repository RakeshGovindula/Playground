#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,i,count=0;
  cin>>n;
  do{
  n=n/10;
    count=count+1;
  }
  while(n>0);
  cout<<count;
}