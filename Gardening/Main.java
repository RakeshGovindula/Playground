#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,mno,count=0;
  cin>>i>>j>>mno;
  for(int a=1;a<=i;a++){
  if((2*a==mno) || ((i-1)*a==mno)){
    cout<<"It is a mango tree";
  count=count+1;
    break;
  }
    
  }
  if(count==0)
    cout<<"It is not a mango tree";
}