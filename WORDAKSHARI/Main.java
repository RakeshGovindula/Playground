#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str[100];
  int count=0;
  for(int i=0;;i++)
  {
    getline(cin,str[i]);
    count++;
    if(str[i][0]=='#')
      break;
  }
  int b=0;
  for(int i=0;i<count;i++)
  {
    int l=str[i].length();
    if(str[i][l-1]==str[i+1][0])
      b++;
   }
  for(int i=0;i<b+1;i++)
    cout<<str[i]<<endl;
  //Type your code here.
}