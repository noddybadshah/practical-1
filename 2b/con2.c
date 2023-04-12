#include<reg51.h>
void delay(unsigned int time);
void main()
{
while (1)
{
P2 = P1;
delay(1000);
}
}
void delay(unsigned int time)
{ unsigned int i;
for (i=0;i<time;i++);
}