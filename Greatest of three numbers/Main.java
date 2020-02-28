#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int d=((a>b)&&(a>c))?a:((b>c)?b:c);
  printf("%d is greater",d);
  //fill your code
}