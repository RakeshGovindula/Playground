#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,j,count=0;
  cin>>n;
  cout<<n<<endl;
  if(n!=1)
  {
  do{
  if(n%2==0){
    n=n/2;
  }
    else{
    n=3*n+1;
    }
    cout<<n<<endl;
    count++;
  }while(n!=1);
  }
  cout<<count;
}