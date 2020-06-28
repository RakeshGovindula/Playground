#include<iostream>
using namespace std;
main()
{
int m,f;
  cin>>m>>f;
  if(f<m)
    cout<<"Yes, you can enter.";
  else if(f==m)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
}