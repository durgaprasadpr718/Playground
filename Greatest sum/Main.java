#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,rsum,csum,rmax=0,cmax=0,ri,ci;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  std::cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
    rsum=0;
    for(j=0;j<c;j++)
    {
      rsum=rsum+a[i][j];
    }
    std::cout<<rsum<<" ";
    if(rsum>rmax){
      rmax=rsum;
      ri=i;
    }
  }
  std::cout<<"\nRow "<<ri+1<<" has maximum sum";
  std::cout<<"\nSum of columns is ";
  for(j=0;j<c;j++)
  {
    csum=0;
    for(i=0;i<r;i++)
    {
      csum=csum+a[i][j];
    }
    std::cout<<csum<<" ";
    if(csum>cmax)
    {
      cmax=csum;
      ci=j;
    }
  }
  std::cout<<"\nColumn "<<ci+1<<" has maximum sum";
}