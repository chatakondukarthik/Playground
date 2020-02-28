#include<stdio.h>
int main()
{
  int q,a;
  scanf("%d",&q);
  if(q<=200) a=q*0.5;
  else if(q<=400) a=q*0.65+100+1;
  else if(q<=600) a=q*0.8+200;
  else a=q*1.25+425;
  printf("Rs.%d",a);
  //fill your code
}