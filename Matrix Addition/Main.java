#include<iostream>
using namespace std;
//int** createArray(int ,int );
int** createArray(int r,int c)
{
  int **a=new int*[r];
  for(int i=0;i<r;i++)
  {
    a[i]=new int[c];
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  }
  //int (*b)[c];
  //b=a;
  return a;
}

int getElement(int **a,int r,int c)
{
  int b=*(*(a+r)+c);
  return b;
}

int addMatrix(int **d,int **a,int **b,int r,int c)
{
  *(*(d+r)+c)=getElement(a,r,c)+getElement(b,r,c);
}


int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int **a=createArray(r,c);
  int **b=createArray(r,c);
  int **d=new int*[r];
  for(int i=0;i<r;i++)
  {
    d[i]=new int[c];
    for(int j=0;j<c;j++)
      d[i][j]=0;
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      addMatrix(d,a,b,i,j);
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      cout<<d[i][j]<<" ";
    cout<<endl;
  }
  
  //int (*b)[c]=createArray(r,c);
  //addmatrix()
}