class Abc29
{
	static int row=0;
public static void seatName(int seatNo)
{
if (seatNo%8==0||seatNo%8==1)
{
	System.out.println("ws");
}
else if (seatNo%8==2||seatNo%8==7)
{
	System.out.println("ms");
}
else if (seatNo%8==3||seatNo%8==6)
{
	System.out.println("as");
}
else if (seatNo%8==4||seatNo%8==5)
{
	System.out.println("os");
}
}
public static void getRow(int seatNo)
{
int count=0;

for (int i=1;i<seatNo ;i++ )
{
	int temp=8;
	temp=temp*i;
	if (temp<seatNo)
	{
		count++;
	}
}
System.out.println(count);
row=count;
System.out.println(row);
seatFace(seatNo);
}
public static void seatFace(int seatNo)
{
if (row%2==0)
{
	if (seatNo%8==1)
	{
		seatNo=seatNo+15;
	}
	else if (seatNo%8==2)
	{
		seatNo=seatNo+13;
	}
	else if (seatNo%8==3)
	{
		seatNo=seatNo+11;
	}
	else if (seatNo%8==4)
	{
		seatNo=seatNo+9;
	}
	else if (seatNo%8==5)
	{
		seatNo=seatNo+7;
	}
	else if (seatNo%8==6)
	{
		seatNo=seatNo+5;
	}
	else if (seatNo%8==7)
	{
		seatNo=seatNo+3;
	}
	else if (seatNo%8==0)
	{
		seatNo=seatNo+1;
	}
System.out.println(seatNo);
}
else if (row%2==1)
{
	if (seatNo%8==0)
	{
		seatNo=seatNo-15;
	}
	if (seatNo%8==7)
	{
		seatNo=seatNo-13;
	}
	else if (seatNo%8==6)
	{
		seatNo=seatNo-11;
	}
	else if (seatNo%8==5)
	{
		seatNo=seatNo-9;
	}
	else if (seatNo%8==4)
	{
		seatNo=seatNo-7;
	}
	else if (seatNo%8==3)
	{
		seatNo=seatNo-5;
	}
	else if (seatNo%8==2)
	{
		seatNo=seatNo-3;
	}
	else if (seatNo%8==0)
	{
		seatNo=seatNo-1;
	}
	System.out.println(seatNo);
}

}

public static void main(String[] args) 
	{
	seatName(8);
	getRow(8);
	
	}

}
 