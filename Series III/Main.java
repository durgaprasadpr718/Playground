#include <iostream>
#include<string>
int main()
{
  int n,count=1,s=6;
  std::cin>>n;
  std::cout<<s;
  while(count<n)
  {
    s=s+5*count;
    std::cout<<" "<<s;
    count++;
  }
}