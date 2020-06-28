#include<iostream>
using namespace std;
main()
{
int p;
  cin>>p;
  int i,j,count=0;
  for(i=1;i<=p;i++)
  {
  if(p%i==0){
    count++;
  }
  }
  if(count==2)
    cout<<"Eligible";
  else
    cout<<"Not eligible";

}