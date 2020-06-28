#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  int vow=0,con=0,ws=0,dig=0,sym=0;
  getline(cin,str);
  for(int i=0;i<str.length();i++)
  {
    if(str[i]==' ')
        ws++;
    else if( str[i]>=48 && str[i]<=57 )
      dig++;
    
    else if(str[i]=='A' ||str[i]=='a' ||str[i]=='E'||str[i]=='e'||str[i]=='I'||str[i]=='i'||str[i]=='O'||str[i]=='o'||str[i]=='U'||str[i]=='u')
      vow++;
   else if(str[i] < 'A' || str[i] > 'Z' && 
            str[i] < 'a' || str[i] > 'z')
      sym++;
    else
      con++;
  }
  cout<<"Vowels:"<<vow<<endl;
  cout<<"Consonants:"<<con<<endl;
  cout<<"White Spaces:"<<ws<<endl;
  cout<<"Digits:"<<dig<<endl;
  cout<<"Symbols:"<<sym<<endl;
  //Type your code here.
}