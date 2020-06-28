#include <iostream>
using namespace std;
int max(int a,int b)
{
  if(a==b)
    return a;
  if(a>b)
    return a;
  else
    return b;
}

int min(int a,int b)
{
  if(a==b)
    return a;
  if(a<b)
    return a;
  else
    return b;
}

int main() 
{
   int p,q,r,s;
  cin>>p;
  cin>>q;
  cin>>r;
  cin>>s;
  int i,j,a,x,y,count=0;
  for(x=p;x<=q;x++)
  {
    for(y=r;y<=s;y++)
    {
      //cout<<x<<" "<<y<<endl;
      i=x;
      j=y;
      while(i!=j)
      {
        if(i>j)
        {
        a=max(i-j,j);
        j=min(i-j,j);
        i=a;
        }
        else
        {
         a=max(j-i,i);
        j=min(j-i,i);
        i=a; 
        }
        count++;
      }
      count++;
    }
  }
  cout<<count;
    return 0;
}