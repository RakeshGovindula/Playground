#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[20],loc,val,j,temp;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(int i=1;i<=n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>loc;
  if(loc<=n){
    cout<<"Enter the value to insert"<<endl;
    cin>>val;
    int t=n;
        int b[t];
    for(int i=1;i<=t;i++)
      b[i]=a[i];
    j=loc+1;
    temp=a[loc];
    a[loc]=val;
    cout<<"Array after insertion is"<<endl;
    for(int i=loc+1;i<=n+1;i++)
    {
     a[i]=b[i-1]; 
      
    }
    for(int i=1;i<=n+1;i++)
      cout<<a[i]<<endl;
  }
  else{
    cout<<"Invalid Input"<<endl;
  }
}