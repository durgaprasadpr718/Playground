#include<iostream>
int pow(int,int);
using namespace std;
int main()
{
  //Type your code here.
  int a,n;
  std::cin>>a>>n;
  std::cout<<"Enter the value of a"<<"\n"<<"Enter the value of n"<<"\n";
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
}
int pow(int a,int b)
{
  if (b != 0)
        return (a * pow(a, b - 1));
    else
        return 1; 
  
}