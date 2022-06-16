// This Keyword

class Children  
{  
    int stid;  
    String stname;  
    Children(int stid, String stname)  
    {  
        this.stid = stid;  
        this.stname = stname;  
    }  
    void print()  
    {  
        System.out.println(stid + " " + stname);  
    }  
    public static void main(String args[])  
    {  
        Children st1 = new Children(12, "John");  
        Children st2 = new Children(22, "Sam");  
        st1.print();  
        st2.print();  
    }  
} 
