#include<iostream>
using namespace std;
int gcd(int a,int b,int c)
{
  int small,gc;
   if(a<b){//compare num1 and num2
            if(a<c){//compare num1 and num3
         small=a;
            }
            else{
                small=c;
            }
    }
    else{
        if(b<c){//compare num2 and num1
            small=b;
        }
        else{
            small=c;
        }
    }
  for(int i=1;i<=small;i++)
  {
  if(a%i==0 && b%i==0 && c%i==0)
    gc=i;
  }
  return gc;


}
main()
{
  int a,b,c,n;
  cin>>a>>b>>c>>n;
  int x=gcd(a,b,c);
  if(x==n)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  
}