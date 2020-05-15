#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,f=0,b=0;
  std::cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(i==j)
        f=f+a[i][j];
      if(n==i+j+1)
        b=b+a[i][j];
    }
    
  }
  if(f==b)
    std::cout<<"Yes";
  else
    std::cout<<"No";
  
}