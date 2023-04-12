#include<reg51.h>
void ToDelay(void);
void main(void)
{
while (1)
{
P1 = 0xAA;
ToDelay();
P1 = 0x55; 
ToDelay();
}
}
void ToDelay()
{ unsigned int i, j;
for (j=0;j<24;j++);
for (i=0;i<1000;i++);
}