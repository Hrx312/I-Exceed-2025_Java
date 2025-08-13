import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
 
class demoBAOS
{
   public static void main(String asd[])throws Exception
	{
	   ByteArrayOutputStream bos=new ByteArrayOutputStream();
       ByteArrayOutputStream bos1=new ByteArrayOutputStream();

	   bos.writeBytes("this is the sample string to be embed into multiple source".getBytes());
       bos1.writeBytes("Hellooooooo guyssssssss welcome back to my youtube channel ".getBytes());

	   FileOutputStream fous1=new FileOutputStream(new File("barray1.txt"));
	   FileOutputStream fous2=new FileOutputStream(new File("barray2.txt"));
	   FileOutputStream fous3=new FileOutputStream(new File("barray3.txt"));
       FileOutputStream fous4=new FileOutputStream(new File("barray4.txt"));
       
       bos.writeTo(fous1);
	   bos.writeTo(fous2);
       bos1.writeTo(fous3);
       bos1.writeTo(fous4);

	}
}