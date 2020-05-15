#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b;
  c=100+b;
  if(a>b) 
  std::cout<<c-a;
  else
  std::cout<<b-a;
}