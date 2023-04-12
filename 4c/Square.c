#include<reg51.h>
void delay(int time);
void main()
{

while (1)
{
P1 = 0X00;
delay(3000);
P1 = 0XFF; 
delay(2500);
}
}
void delay(int time)
{ int i, j;
for(i=0;i<=time;i++);
for(j=0;j<255;j++);
}