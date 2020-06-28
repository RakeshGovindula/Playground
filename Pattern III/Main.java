#include<iostream>
using namespace std;
main()
{
int n;
  cin>>n;
  int j, k = 0; 
      
    // loop to decide the row number 
    for (int i=1; i<=n; i++) 
    {  
            for (j=1; j<i; j++) 
                cout << i << "*"; 
            cout << j++ << endl; 
}
  for(int i=n;i>=1;i--)
  {
    for (j=1; j<i; j++) 
                cout << i << "*"; 
            cout << j-- << endl;
  
  }
}