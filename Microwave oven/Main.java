#include<iostream>
using namespace std;
int main()
{
 int a;
 float b;
 std::cin>>a>>b;
  if(a<=2) 
    std::cout<<b+((b*50)/100);
  else if(a==3) 
    std::cout<<2*b;
  else
    std::cout<<"Number of items is more";
}