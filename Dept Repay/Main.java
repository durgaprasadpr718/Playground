#include<iostream>
using namespace std;
int main()
{int a,b,c;
 float d,e,f,g,h;
 std::cin>>a>>b>>c;
 d=((a*b)*c)/100 ;
 e=d+a;
 f=(d/100)*2;
 g=e-f;
 std::cout<<d<<'\n'<<e<<'\n'<<f<<'\n'<<g;
}