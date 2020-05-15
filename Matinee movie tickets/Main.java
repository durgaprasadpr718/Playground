#include<iostream>
using namespace std;
int main()
{
  int a;
  double b;
  std::cin>>a>>b;
  if(b==13.30) {
    if(a>=13) 
    std::cout<<"$5.00";
    else
    std::cout<<"$2.00";}
  else if(b!=13.30) {
    if(a>=13) 
    std::cout<<"$8.00";
    else
    std::cout<<"$4.00";}
  else
    std::cout<<"no cost";}
     