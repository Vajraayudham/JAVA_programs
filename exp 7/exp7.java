import java.util.*;
import java.io.*;

public class exp7 {
    public static void main(String[] args) throws IOException {  
        Scanner sc=new Scanner(System.in);
        FileOutputStream file = new FileOutputStream("D:\\SGU\\BCA\\java\\exp7.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        
        System.out.println("Enter  Name :");
            String s1=sc.nextLine();
            data.writeUTF(s1);
        System.out.println("Enter  Age :");
            int i1=sc.nextInt();
            data.writeInt(i1);
        System.out.println("Enter  weight :");
            int i2=sc.nextInt();
            data.writeInt(i2);
        System.out.println("Enter  height :");
            int i3=sc.nextInt();
            data.writeInt(i3);
        sc.nextLine();
        System.out.println("Enter  city :");
            String s2=sc.nextLine();
            data.writeUTF(s2);
        System.out.println("Enter  phone no :");
            long l1=sc.nextLong();
            data.writeLong(l1);        
            
            data.flush();  
            data.close();
        
        InputStream input = new FileInputStream("D:\\SGU\\BCA\\java\\exp7.txt");  
        DataInputStream inst = new DataInputStream(input);
            
            System.out.println("\n\n\t Name :"+inst.readUTF()+"\t\tAge "+inst.readInt());
            System.out.println("\n\tWeight:"+inst.readInt()+"\t\theight :"+inst.readInt());
            System.out.println("\n\n\t\tCity :"+inst.readUTF()+"\t\tPhone Number:"+inst.readLong());
                
                inst.close();
                input.close();    
        System.out.println("\t\t\tSucccess...");  
    }
}
/*
Take Student information such as name, age, weight, height, city, phone from user 
and store it in the file using DataOutputStream 
and FileOutputStream and Retrive data using DataInputStream and FileInputStream and display the result.
*/