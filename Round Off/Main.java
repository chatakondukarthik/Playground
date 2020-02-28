#include<stdio.h>
int main()
{
  float x;
  scanf("%f",&x);
  int a=(int)x;
  float b=ceil(x);
  float c=floor(x);
  printf("%d\n\%0.1f\n%0.1f",a,b,c);
  //fill your code
}