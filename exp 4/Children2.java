// Super keyword
class Parent  
{  
    void information()  
    {  
        System.out.println("Hello...!");  
    }  
}  
  
class Children2 extends Parent  
{  
   void information()  
    {  
        System.out.println("Hello world......!");  
    }  
    void print()  
    {  
        information();  
        super.information();  
    }  
    public static void main(String args[])  
    {  
        Children2 c = new Children2();  
        c.print();  
    }  
} 