#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i; 
  cin.getline(str,100);
  //cout<<str;
  for(i=0;str[i]!='\0';i++)
  {
    //cout<<"hi";
  count++;
  }
  //cout<<count;
  for(end=count-1,i=0;end>=0;end--,i++)
  {
    
    rev[i]=str[end];
  }
  
//Your code goes here               
cout<<rev;
}