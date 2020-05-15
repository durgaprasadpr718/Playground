#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,p,sum=0,i;
  std::cin>>n;
  int a[n];
  std::cin>>p;
  for(i=0;i<n;i++){
    std::cin>>a[i];
  }
  for(i=0;i<n;i++){
    sum=sum+a[i];
  }
  if(sum<=p)
    std::cout<<"YES";
  else
    std::cout<<"NO";
      
  
  
}