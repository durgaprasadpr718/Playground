#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,max=0;
  std::cin>>r;
  std::cin>>c;
  int a[r][c];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      std::cin>>a[i][j];
      if(a[i][j]>max){
        max=a[i][j];
      }
    }
  }
      std::cout<<"The maximum element is "<<max;
    
  
}