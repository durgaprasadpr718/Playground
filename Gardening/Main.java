#include<iostream>
using namespace std;
int main()
{
int a,b,c,d,e;
std::cin>>a>>b>>c;
d=a+b;
e=a*b;
if(c>a && c<=d ) 
std::cout<<"It is a mango tree";
else if(c>=e-d && c<=e-b) 
std::cout<<"It is a mango tree";
else
std::cout<<"It is not a mango tree";
}