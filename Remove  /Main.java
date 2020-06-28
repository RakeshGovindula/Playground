//#include <string>
#include <iostream>
#include<string>
using namespace std;
int main(){
  string s,p="the";
  getline(cin,s);
  string::size_type n = p.length();
  if(s.find(p)!=string::npos)
  {
    int g=-1;
    string temp=p+" ";
    while(s.find(p)!=string::npos)
    {
      g=s.find(p);
      s.replace(g,temp.length(),"");
    }
    temp=" "+p;
    while(s.find(p)!=string::npos)
    {
      g=s.find(p);
      s.replace(g,temp.length(),"");
    }
  }
  cout<<s;
}
  