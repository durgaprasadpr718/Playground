#include<iostream>
int main()
{
int a,b,c=0;
std::cin>>a;
b=a;
do
{
b=b/10;
c++;
}
while(b>0);
std::cout<<c;
}