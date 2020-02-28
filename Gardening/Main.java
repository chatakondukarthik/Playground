#include<stdio.h>
int main()
{
  int r,c,a;
  scanf("%d%d%d",&r,&c,&a);
  if((a>c && a<=2*c || a>(r*c-2*c)) && (a<=r*c-c))
    printf("It is a mango tree");
  else
    printf("It is not a mango tree");
  //fill your code
}