#include<reg51.h>
void ToDelay(void);
void main(void)
{
	while(1)
	{
		P1=0xFF;
		ToDelay();
		P1=0x00;
		ToDelay();
	}
}
void ToDelay()
{
	TMOD=0x01; // use timer 0, mode 1
	// Load value "FC in timer 0 lower byte & load //Value "65" in timer 0
	TL0=0xFC; // Load TH0
	TH0=0x90; // Load TL0
	TR0=1; // Turn on timer 0
	while(TF0==0); //Wait for TF0(timer 0 overflow flag) to roll 
	TR0=0; //Turn off timer 0 run control bit
	TF0=0; //Clear timer 0 overflow flag bit
}