#include<stdio.h>
int main()
{
  int a,b,c,cars;
  scanf("%d%d%d%d",&a,&b,&c,&cars);
  if(cars%3==0) printf("No path exist");
  else if(cars%3==1) printf("Car 1 goes into road A");
  else printf("Car 1 goes into road B");
  //Fill your code
}