#include <iostream>
int main() 
{int a,r,rev=0;
 std::cin>>a;
 while(a!=0) {
   
   r = a % 10;
        rev = rev * 10 + r;
        a /= 10;}
 std::cout<<rev;
}