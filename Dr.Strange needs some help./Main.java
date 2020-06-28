#include<iostream>
using namespace std;
int mul(int m,int n,int req)
{
int bact=1;
  for(int i=1;i<=n;i++)
  {
  bact=bact*m;
  }
  if(bact>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
main()
{
int m,n,req;
  cin>>m>>n>>req;
  mul(m,n,req);
  
}