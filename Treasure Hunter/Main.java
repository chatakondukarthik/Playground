#include<stdio.h>
int main()
{
  int total, ben, black;
  scanf("%d%d%d", &total, &ben, &black);
  int a = ben*total/100;
  int b = black*(total-a)/100;
  printf("%d\n%d\n%d", a, b, (total-a-b)/3);//fill your code
}