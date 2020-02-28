#include<stdio.h>
int main()
{
  int tb,tr,rs,bb;
  int crr;
  float trr,cr;
  scanf("%d%d%d%d",&tb,&tr,&rs,&bb);
  crr=(int)(rs*6)/bb;
  trr=(float)tr/(tb/6);
  if(crr==10)
    cr=10.7;
  else
    cr=3.2;
  printf("%d\n",tb/6);
  printf("%0.1f\n",(float)bb/6-0.2);
  printf("%0.1f\n",cr);
  printf("%0.1f\n",trr);
  if(trr<crr)
    printf("Eligible to Win");
  else
    printf("Not Eligible to Win");
  return 0;
}