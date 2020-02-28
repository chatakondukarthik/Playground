#include<stdio.h>
int main()
{
  float r,h,a,t;
  scanf("%f%f%f%f",&r,&h,&a,&t);
  if(r*r*h*3.14<a*t)
    printf("The tank can be filled within %0.1f hours",t);
  else
    printf("The tank cannot be filled within %0.1f hours",t);
  return 0;
  //fill your code
}