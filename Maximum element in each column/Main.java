#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,a[10][10],max;
  std::cin>>r>>c;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  for(j=0;j<c;j++)
  {
    max=0;
    for(i=0;i<r;i++)
    {
      if(a[i][j]>max)
        max=a[i][j];
    }
    std::cout<<max<<"\n";
  }
      
}