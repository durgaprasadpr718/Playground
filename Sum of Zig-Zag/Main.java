#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,sum=0;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
      if(r%2)
      {
      if(!(i==r/2))
        sum=sum+a[i][j];
        if(i==r/2 && j==c/2)
          sum=sum+a[i][j];
      }
      else
        sum=sum+a[i][j];
    }
  }
  std::cout<<"Sum of Zig-Zag pattern is "<<sum;
}