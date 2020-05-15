#include<iostream>
int main()
{
int f1,f2,f3,s1,s2,s3,a1,a2,a3,f,s,a,fd,sd,ad;
std::cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
fd=(f1*f2/100);
sd=(s1*s2/100);
ad=(a1*a2/100);
f=(f1-fd)+f3;
s=(s1-sd)+s3;
a=(a1-ad)+a3;
std::cout<<"In Flipkart Rs."<<f<<'\n'<<"In Snapdeal Rs."<<s<<'\n'<<"In Amazon Rs."<<a<<'\n';
if(f<=s && f<=a)
std::cout<<"He will prefer Flipkart";
else if(s<f &&  s<a)
std::cout<<"He will prefer Snapdeal";
else
std::cout<<"He will prefer Amazon";
}