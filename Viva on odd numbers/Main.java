#include<iostream>
using namespace std;
main()
{
  //Type your code here.
  int o1,count=0;
  float sum=0;
  cin>>o1;
  while(count<=3 && o1>0){
  for(int i=1;o1%2==0;i++)
  {
    if(o1<0){
    break;
    }
    sum=sum-0.5;
    cin>>o1;
  }
  if(o1>0 && o1%2!=0) { 
  sum=sum+1;
    count++;
  }
    cin>>o1;
 }
  
  //else{
  sum=sum-1.0;
    cout<<sum;
  //}  
  /*if(o1>0)
  {
  if(o1%2!=0)
    sum=sum+1.0;
  else
    sum=sum-0.5;
  cin>>o2;  
  if(o2>0)
  {
  if(o2%2!=0)
    sum=sum+1.0;
  else
    sum=sum-0.5;
  cin>>o3;  
  if(o3>0)
  {
  if(o3%2!=0){
    sum=sum+1.0;
  cout<<sum;
  }
  else{
    sum=sum-0.5;
    cout<<sum;
  }
  }
  else{
  sum=sum-1.0;
    cout<<sum;
  }
  }
  else{
  sum=sum-1.0;
    cout<<sum;
  }  
  }
  else{
  sum=sum-1.0;
    cout<<sum;
  }*/
  /*for(int i=1;i<=3;i++)
  {
  
    
  }*/
  
}