class A
{
    void printf_herarical()
    {
        System.out.println("Herarical");
        return;
    }
}
class B extends A
{
    void printf_typeB()
    {
        System.out.println("Type I");
    }
}
class C extends A
{
    void printf_typeC()
    {
        System.out.println("Type II");
    }
}
class heraricalin 
{
    public static void main(String[] args)
    {
        B obj1=new B();
        C obj2=new C();
        obj1.printf_herarical();
        obj1.printf_typeB();
        obj2.printf_herarical();
        obj2.printf_typeC(); 
    }
    
}
