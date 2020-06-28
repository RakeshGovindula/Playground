#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char str[100],str1[100];
  cin.getline(str,100);
  cin.getline(str1,100);

  int len=0;
  len= strcmp(str,str1);
  if(len==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}