#include<iostream>
int main()
{
  int r,c,i,j;
  std::cin>>r;
  std::cin>>c;
  int a[r][c];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      std::cin>>a[i][j];
    }
  }
  int sum=0;
  for(i=0;i<r;i++){
    sum=0;
    for(j=0;j<c;j++){
      
      sum=sum+a[i][j];
    }
      std::cout<<sum;
    std::cout<<" \n";
  }
}