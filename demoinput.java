import java.io.DataInputStream;
 
class sample4
  {
     DataInputStream din=new DataInputStream(System.in);
 
     sample4()
	{	
	  try{
	       int str1=Integer.parseInt(din.readLine());
	       int str2=Integer.parseInt(din.readLine());
	       System.out.println(str1+str2);
 
	}catch(Exception  d){}
	}
}
 
 
class demoinput
{
    public static void main(String asd[])
	{
	    new sample4();
	}
}