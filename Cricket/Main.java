#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int total_balls,total_runs,runs,balls_bowled;
  cin>>total_balls>>total_runs>>runs>>balls_bowled;
  int total_overs;
  double total_run_rate,total_over_play,run_rate;
  float current_run_rate,value;
  total_overs=total_balls/6;
  cout<<total_overs<<"\n";
  total_over_play=balls_bowled/6 + ((balls_bowled % 6) * 0.1) ;
  cout<<total_over_play<<"\n";
  current_run_rate=runs/total_over_play;
  printf("%.1f",current_run_rate);
  cout<<"\n";
  run_rate=(float)total_runs/total_overs;
  printf("%.1f",run_rate);
  cout<<"\n";
  if(run_rate > current_run_rate)
  {
    cout<<"Not Eligible to Win";
  }
  else
  {
    cout<<"Eligible to Win";
  }
  
  
 
  //Type your code here.
}