#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n,mcount=0,fcount=0;
  cin>>n;
  int *p=(int *)calloc(n,sizeof(int *));
  for(int i=0;i<n;i++)
    cin>>*(p+i);
  for(int i=0;i<n;i++)
  {
  if((*(p+i))%2!=0)
    mcount++;
    else
      fcount++;
  }
  free(p);
  cout<<mcount<<endl;
  cout<<fcount;
  return 0;
}