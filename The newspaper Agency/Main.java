#include<stdio.h>
int main()
{
  int countCopies, cost, agencyCost;
  scanf ("%d%d%d", &countCopies, &cost, &agencyCost);
  int profit = (countCopies*(cost - agencyCost))-100;
  printf("%d", profit);
  //fill your code
}