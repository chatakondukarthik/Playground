#include<stdio.h>
int main(){
  float a;
  int m;
  scanf("%f%d",&a,&m);
  if(m==1)a=a*0.8;
  else if(m==3&&m==4){a=a*0.9;}
  else if(m==6&&m==7) {a=a*0.25;}
  else if(m==10&&m==11){a=a*0.7;}
  else if(m==12) {a=a*0.65;}
  else if(m>12&&m<0) {printf("Invalid Month");}
  else {a=a*1;}
  printf("Chris father needs to pay Rs.%0.2f.",a);
  return 0;
}