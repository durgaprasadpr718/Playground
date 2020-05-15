#include <iostream>
using namespace std;

int main()

{

    int i,j,s,N,count=0;

   std::cin >> s >> N;

    for(i=s;count<4;count++)

    {

        for(j=0;j<count+1;j++)

            std::cout << i;

        std::cout << endl;

        i=i+1;

    }

    for(i=s+N+3;count>0;count--)

    {

        for(j=0;j<count;j++)

            std::cout << i;

        std::cout << endl;

        i=i-1;

    }

    return 0;

}