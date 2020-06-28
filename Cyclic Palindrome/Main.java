#include<bits/stdc++.h>
#include <iostream>
#include<cstring>
using namespace std;
//to leftrotate
void leftrotate(string &s, int d) 
{ 
    reverse(s.begin(), s.begin()+d); 
    reverse(s.begin()+d, s.end()); 
    reverse(s.begin(), s.end()); 
} 
  
// In-place rotates s towards right by d 
void rightrotate(string &s, int d) 
{ 
   leftrotate(s, s.length()-d); 
} 
//to find the string is polin or not
bool polin(string s)
{
  int len=s.length();
  int flag=0;
  for(int i=0;i < len ;i++){
        if(s[i] != s[len-i-1]){
            flag=1;
            break;
        }
   }
  if(flag)
    return false;
  else
    return true;
}

int main() 
{
  int n;
  cin>>n;
  string s;
  int rcount,lcount;
  for(int i=0;i<n;i++)
  {
    cin>>s;
    string a=s;
    int len=s.length();
    rcount=0;
    lcount=0;
    //for right shift
    do
    {
      if(polin(s))
        break;
     rightrotate(s,1);
      rcount++;
     }while(rcount<=len);
    //for left shift
    do
    {
      if(polin(a))
        break;
     leftrotate(a,1);
      lcount++;
    }while(lcount<=len);
 
    if(lcount>=len && rcount>=len)
      cout<<-1<<endl;//if the shifts are >length then they cannot converted into polindromes
    else if(lcount<=rcount)
      cout<<lcount<<endl;
     else if(rcount<lcount)
      cout<<rcount<<endl;
   }
  return 0;
}