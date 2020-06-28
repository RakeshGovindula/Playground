#include<iostream>
using namespace std;
main()
{
  //Type your code here.
  int sun,mon,tue,wed,thur,fri,sat;
  cin>>sun>>mon>>tue>>wed>>thur>>fri>>sat;
  int hrs=sun+mon+tue+wed+thur+fri+sat;
  int hr=mon+tue+wed+thur+fri;
  int sunsal=100*sun;
  float suns=(float)sunsal*(0.5);
  int satsal=100*sat;
  float sats=(float)satsal*(0.25);
  int sal=100*hrs;
  if(mon>8)
  {
  sal=sal+15*(mon-8);
  }
  if(tue>8)
  {
  sal=sal+15*(tue-8);
  }
  if(wed>8)
  {
  sal=sal+15*(wed-8);
  }
  if(thur>8)
  {
  sal=sal+15*(thur-8);
  }
  if(fri>8)
  {
  sal=sal+15*(fri-8);
  }
  if(hr>40)
  {
  sal=sal+25*(hrs-40);
  }
  else
  {
  sal=sal+suns+sats;
  }
  cout<<sal;
}