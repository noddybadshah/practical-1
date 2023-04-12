#include<reg51.h>
void delay(int time);
void main()
{
int x, i, j;
while (1)
{
	for(x=0; x<255; x++)
	{
		P1=x;
		delay(2000);
	}
	for(x=255; x>0; x--)
	{
		P1=x;
		delay(2000);
	}
}
}
void delay(int time)
{ int i, j;
for(i=0;i<=time;i++);
for(j=0;j<255;j++);
}