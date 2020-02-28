#include<stdio.h>
#include<math.h>
int main()
{
  int x, y;
  scanf("%d%d", &x, &y);
  int hops = sqrt(pow(x-3,2)+pow(y-4,2));
  printf("%d", hops);
}