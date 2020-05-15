#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[20],e=0,o=0;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
    if(a[i]%2)
      o++;
    else
      e++;
  }
  if(o==n)
    std::cout<<"The array is Odd";
  else if(e==n)
    std::cout<<"The array is Even";
  else
    std::cout<<"The array is Mixed";
    
  
}