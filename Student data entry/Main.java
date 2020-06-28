#include <iostream>
#include<cstring>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student s;
  cin.getline(s.name,50);
  cin>>s.roll;
  cin>>s.marks;
  cout<<endl<<"Student Details"<<endl;
  cout<<"Name: ";
  for(int i=0;i<strlen(s.name);i++)
    cout<<s.name[i];
  cout<<endl<<"Roll: "<<s.roll<<endl;
  cout<<"Marks: "<<s.marks<<endl;
   //Your code goes here
}