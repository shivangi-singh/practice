 import java.util.*;
class ArmstrongNo 
{
public Boolean tocheckarmstrongno(){
Scanner obj= new Scanner(System.in);
System.out.println("enter the input");
int a = obj.nextInt();
int sum=0;
int c=a;
while(c>0){

int x= c%10;
sum=sum+(x*x*x);
c=c/10;

}

if(sum==a)
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
