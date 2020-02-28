#include<stdio.h>
int main()
{
  int a,b,c,sm,s;
  scanf("%d%d%d",&a,&b,&c);
  if(a>b&&a>c&&b>c){
    sm=b;
    s=c;
  }
  else if(a>c&&a>b&&c>b){
    sm=c;
    s=b;
  }
  else if(b>a&&b>c&&a>c){
    sm=a;
    s=c;
  }
  else if(b>c&&b>a&&c>a){
    sm=c;
    s=a;
  }
  else if(c>a&&c>b&&a>b){
    sm=a;
    s=b;
  }
  else{
    sm=b;
    s=a;
  }
  printf("The treasure is in the box which has number %d.\n",sm);
  printf("The code to open the box is %d.",s);
  return 0;
  //fill your code
}