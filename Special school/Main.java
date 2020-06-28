#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str,str1,ts;
  getline(cin,str);
  getline(cin,str1);
  int l=str.length();
  int count=0;
  for(int i=l-1,j=0;i>=0;i--,j++)
    ts[i]=str[j];
  for(int i=0;i<l;i++){
    if(ts[i]!=str1[i])
      count++;
  }
  if(count==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  //Type your code here.
}