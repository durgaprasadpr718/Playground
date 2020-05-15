#include <iostream>
#include <string>
int main()
{
  float f,n,count=0,s=0.5;
  std::cin>>n;
  std::cout<<s;
  while(count<n-1)
  {
    s=s*3;
    std::cout<<" "<<s;
    count++;
  }
}