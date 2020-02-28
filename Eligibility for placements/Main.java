#include<stdio.h>
int main()
{
  char name[20];
  int a, b;
  float cgpa;
  scanf("%s", name);
  scanf("%d", &a);
  scanf("%f", &cgpa);
  scanf("%d", &b);
  if( (b!=0 && cgpa >= 7.0) || ((b==1 || b== 2) && cgpa >= 7.5)) {
    printf("%s", name);
    printf("\n%d", a);
    printf("\nNot Eligible to attend placement");
  }
  else {
    printf("%s", name);
    printf("\n%d", a);
    printf("\nEligible to attend placement");
  } 
  return 0;
}

//Chapters 4 - lesson 11