public class Student {
    // Attributes
    public int  id , nos , age ;
    public String name;
    private String gf;

    // Constructor

    // Methods
    public void study()
    {
        System.out.println( name + " Studying ");
    }
    public void sleep()
    {
        System.out.println( name + " sleeping ");
    }
    public void bunk()
    {
        System.out.println( name + " bunking ");
    }

    // default ctor / attribute ki value will be set as garbage
    public Student()
    {
        System.out.println("Default Constructor is called ");
    }
    // parameter ctor
    public Student( int id, int nos ,int age , String name )
    {
        System.out.println("Parameterised Constructor is called ");
        this.id = id;
        this.name = name;
        this.nos = nos;
        this.age = age;
    }
    public Student( int id, int nos ,int age , String name , String gf )
    {
        System.out.println("Parameterised Constructor is called ");
        this.id = id;
        this.name = name;
        this.nos = nos;
        this.age = age;
        this.gf = gf;
    }
    // copy contructor 
    public Student( Student srcobj )
    {
        System.out.println("Copy Constructor is called ");
        this.id = srcobj.id;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
        this.age = srcobj.age;
    }

    private void gfChatting()
    {
        System.out.println( name + " is Chatting with his gf ");
    }
}
