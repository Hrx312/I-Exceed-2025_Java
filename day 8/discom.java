import java.io.FileInputStream;
import java.io.FileOutputStream;
class discom{
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("file.txt");
         String str= "This is the data to be entered into text file";
         byte[] bystr = str.getBytes();
         fos.write(bystr);
         fos.close();
         FileInputStream fin = new FileInputStream("file.txt");
         
        int i;
         while((i=fin.read()) != -1) {
            System.out.print((char)i);
         }

        
    }
}         
