class Balanced 
{
public Boolean toCheck(){	
int [] a = {1,2,-1,-2};
Stack s = new Stack();
for (int i =0;i<a.length;i++ )
{
if (a[i]>0)
{
s.push(a[i]);
}
			
else if (a[i]<0)
{ 
if (s.top==-1)
{
return false;
}
int c= s.pop();

if (c+a[i]!=0)
	{
	return false;
	}
}
			
}
           if (s.top==-1)
			{
				return true;
			}
			
            return false;
			
}
public static void main(String[] args) 
{
	Balanced obj = new Balanced();
	System.out.println(obj.toCheck());
}
}
