#include <iostream>
using namespace std;
int find(int n)
{
  int max=0,min=999,a,sum;
  while(n!=0)
  {
    a=n%10;
    if(a>=max)
      max=a;
    if(a<=min)
      min=a;
    n=n/10;
  }
  sum=max*11+min*7;
 sum=sum%100;
  return sum;
}

int main() 
{
   int n;
  cin>>n;
  if(n>0 && n<=500)
  {
  int ar[n],bit[n],tcount=0,count;
  for(int i=0;i<n;i++)
  {
    cin>>ar[i];
   // c[i]=0;
    
  }
  for(int i=0;i<n;i++)
  {
    if((ar[i]/100)>=10 || (ar[i]/100)<1 ){
      cout<<"Invalid Input";
      return 0;
    }
   bit[i]=find(ar[i]); 
  }
  
  /*for(int i=0;i<n;i++)
  {
   cout<<bit[i]<<" ";
  }*/
  //for even
  for(int i=0;i<n;i++)
  {
   count=0;
     for(int j=i+2;j<n;j=j+2)
     {
       if(bit[j]==0)
         break;
       else if((bit[i]/10)==(bit[j]/10))
       {
         count++;
         bit[j]=0;
         if(count<=2)
           tcount++;
       }
     }
  }
  //for odd
  /*for(int i=1;i<n;i=i+2)
  {
   count=0; 
     for(int j=i+2;j<n,c[j]==0;j=j+2)
     {
       if((bit[i]/10)==(bit[j]/10))
       {
         count++;
         c[j]=1;
       }
     }
    if(count<=2)
         tcount+=count;
  }
  */
    
  cout<<tcount;
  }
  else
    cout<<"Invalid Input";
    return 0;
}