#include<iostream>
int gcd(int,int);
int main()
{
  //Type your code here.
  int m,n;
  std::cin>>m>>n;
  std::cout<<"G.C.D of "<<m<<" and "<<n<<" = "<<gcd(m,n);
}
int gcd(int n1, int n2) {
    if (n2 != 0)
        return gcd(n2, n1 % n2);
    else
        return n1;
}