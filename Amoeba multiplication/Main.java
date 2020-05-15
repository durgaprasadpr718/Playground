#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a=0,b=1,n,count=2,c;
  std::cin>>n;
  while(count<n)
  {
    c=a+b;
    count++;
    a=b;
    b=c;
  }
  std::cout<<c;
}