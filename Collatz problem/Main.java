#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,f,count=0;
  std::cin>>n;
  std::cout<<n;
  while(n>1){
    if(n%2==0)
      f=n/2;
    else
      f=(3*n)+1;
    n=f;
    std::cout<<"\n"<<n;
    count++;
  }
  std::cout<<"\n"<<count;
}