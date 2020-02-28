#include<stdio.h>
int main()
{
  float a,b,c;
  scanf("%f\n",&a);
  scanf("%f\n",&b);
  scanf("%f\n",&c);
  float d=a+b;
  printf("%.2f\n",d);
  float g=d*(c/100);
  float h=d-g;
  printf("%.2f\n",h);
  printf("%.2f\n",g);//fill your code
}