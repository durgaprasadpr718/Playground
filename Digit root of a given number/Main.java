#include<iostream>
int sum(int);
int main()
{
  int n;
  std::cin>>n;
  std::cout<<sum(n);
}
int sum(int n) 
{ 
    int sum = 0; 
     
    // Loop to do sum while 
    // sum is not less than 
    // or equal to 9 
    while(n > 0 || sum > 9) 
    { 
        if(n == 0) 
        { 
            n = sum; 
            sum = 0; 
        } 
        sum += n % 10; 
        n /= 10; 
    } 
    return sum; 
}