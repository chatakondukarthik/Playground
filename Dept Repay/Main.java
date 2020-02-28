#include<stdio.h>
int main()
{
  int p,r,t;
  float pa,a,d,f;
  scanf("%d%d%d",&p,&r,&t);
  pa=((p*t*r)/100);
  a=(float)p+pa;
  d=(float)pa*0.02;
  f=a-d;
  printf("%0.2f\n%0.2f\n%0.2f\n%0.2f",pa,a,d,f);
  //fill your code
}