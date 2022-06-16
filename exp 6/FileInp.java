import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.*;
public class FileInp {
    public static void main(String args[])throws Exception {
        Scanner sc=new Scanner(System.in);
        String b1="";
            try {
            FileInputStream fin = new FileInputStream("D:\\SGU\\BCA\\Javap\\exp 6\\testout.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
            System.out.println("Do you want to add contents to the file : 1(yes) or 2(no) :");
            int a=sc.nextInt();
            if(a == 1){
                
                FileOutputStream fo = new FileOutputStream("D:\\SGU\\BCA\\javap\\testout.txt",true);
                BufferedOutputStream fo1=new BufferedOutputStream(fo);
                
                System.out.println("Enter Data to append to the file :");
                while(!b1.equals("exit")){
                     b1=sc.nextLine();
                     byte []b=b1.getBytes();
                     fo1.write(b);
                }
                
                fo1.close();
                fo.close();
            }
    
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}