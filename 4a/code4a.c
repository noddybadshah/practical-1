#include<reg51.h>
void send(char x); //Prototype of send() funtion
void main(void)
{
	TMOD=0x20; //0x20 is TMOD register to set Time1 in 8Bit Auto reloader
	TH1=0xFD; //TH1 register is loaded with value 0xFD to generate baud rate
	SCON=0x50;
	//Timer1 in Mode 1
	TR1=1; //When TR = 1
	send('Y');
	send('E');
	send('S');
	while(1);
}
void send(char x) //Send() function transmits the character passed to it
{
	SBUF=x;
	while(TI==0); //Wait till transmission is finished i.e. wait until TI = 1
	TI=0; //Clear TI flag
}