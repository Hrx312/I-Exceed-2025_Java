import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class assignment {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String file_name = sc.nextLine();
        FileOutputStream fout = new FileOutputStream(file_name);
        System.out.print("Enter the content to write into the file: ");
        String file_content=sc.nextLine();
        byte[] bystr = file_content.getBytes();
        
        fout.write(bystr);
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file_name));
        fout.close();
        int i;
        System.out.println("\nread");
        while ((i = bin.read()) != -1) {
            System.out.print((char) i);
        }
        bin.close();
        sc.close();
    }
}
