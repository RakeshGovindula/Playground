#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float showtime;
  cin>>age;
  cin>>showtime;
  float a=13.30;
  if(age<=13)
  {
  if(showtime==a)
    cout<<"$2.00";
  else
    cout<<"$4.00";
  }
  else
  {
  if(showtime==a)
    cout<<"$5.00";
  else
    cout<<"$8.00";
  }
}