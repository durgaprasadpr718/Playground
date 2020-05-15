#include<iostream>
using namespace std;
int main()
{
int a,b,c;
std::cin>>a>>b;
c=2*a;
if(c>b) 
std::cout<<"circle cannot be inside a square";
else
std::cout<<"circle can be inside a square";
}