#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,h=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  for(int i=0;i<n;i++)
  {
  if(h<arr[i])
    h=arr[i];
  }
  cout<<h;
}