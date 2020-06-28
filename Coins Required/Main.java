#include<iostream>
using namespace std;

int main()
{
  int num,one,two,five;
  cin>>num;
  five=(num-4)/5;
  if((num-4-five*5)%2==0)
    one=2;
  else
    one=1;
  two=(num-five*5-one)/2;
  cout<<one+two+five<<" "<<five<<" "<<two<<" "<<one;
  return 0;
}