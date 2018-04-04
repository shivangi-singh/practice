 import java.util.*;
class ArmstrongNo 
{
public Boolean tocheckarmstrongno(){
int n = 153;
int sum=0;
int c=n;
while(c>0){

int x= c%10;
sum=sum+(x*x*x);
c=c/10;

}

if(sum==n)
{
return true;
}


return false;

}
	
	
public static void main(String[] args) 
	{
ArmstrongNo abb= new ArmstrongNo();
System.out.println(abb.tocheckarmstrongno());
	}
}
