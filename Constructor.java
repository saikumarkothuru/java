class Student
    {
    private int age;
    private String name;
    public Student()
        {
            age =12;
            name="balu";
        }
    public Student(String name)//this constructor is for default age parameter when only  string is passed this will work 
        {   this.age=12;
            this.name=name;
        }
    public Student(int age,String name)// this is called parameterised constructor and this is for when  local variables and instance variable are same to specify instance variable we use this keyword.
        {  this.age=age;
           this.name=name;
        }
    public int getAge() 
        {
            return age;
        }
    public void setAge(int age) 
        {
            this.age = age;
        }
    public String getName() 
        {
            return name;
        }
    public void setName(String name)
        {
            this.name = name;
        }

    public void output()
        {
            System.out.println("This is my age "+age+ " and This is my  name "+name);
        }

    
    }
  public class Constructor
        {
            public static void main (String[] args)
                {
                    Student obj1=new Student(21,"sai");
                    Student obj=new Student();
                    obj1.output();
                    obj.output();
                }
        }

