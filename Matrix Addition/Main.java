#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j;
  std::cin>>r;
  std::cin>>c;
  int a[r][c],b[r][c],s[100][100];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      std::cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      std::cin>>b[i][j];
    }
  }
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      s[i][j]=a[i][j]+b[i][j];
      std::cout<<s[i][j]<<" ";
    }
    std::cout<<"\n";
  }
    
}