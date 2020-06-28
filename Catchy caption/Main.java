#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
   char str[100];
  cin.getline(str,100);
  int count=0,i=0;
  while(str[i]!='\0')
  {
    if(str[i]==' ')
      count++;
    i++;
  }
  if(count<10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
}