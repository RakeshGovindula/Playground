#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,key,h=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cin>>key;
  for(int i=0;i<n;i++)
  {
  if(key==arr[i])
  {
  h=1;
    break;
  }
  }
  if(h==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}