#include<reg51.h>
void main()  
 {  
    
    int x[16]={127,176,218,245,255,245,218,176,128,79,37,10,0,10,37,79};  
      
    int i;  
   
      
    while(1)  
    {  
       for(i=0;i<16;i++)  
       {  
          P1=x[i];  
       }  
    }  
 }

