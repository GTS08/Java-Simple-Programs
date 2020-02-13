public class Person 
{
    private String lastname;
    private String firstname;
    private int age;
    private boolean married;
    private float salary;
    private int sex;
    public static final int MALE = 0;
    public static final int FEMALE = 1;
    
    public Person (String lastname, String firstname, int age, boolean married, float salary, int sex) 
    {
        this.lastname = new String(lastname);
        this.firstname = new String(firstname);
        this.age = age;
        this.married = married;
        this.salary = salary;
        this.sex = sex;
    }
    
    public String getLastName() { return lastname; }
    public String getFirstName() { return firstname; }
    public int getAge() { return age; }
    public boolean isMarried() { return married; }
    public float getSalary() { return salary; }
    public int getSex() { return sex; }
 
    public String setLastName(String lastname) { return this.lastname = lastname; }
    public String setFirstName(String firstname) { return this.firstname = firstname; }
    public int setAge(int age) { return this.age = age; }
    public boolean setMarried(boolean married) { return this.married = married; }
    public float setSalary(float salary) { return this.salary = salary; }
    public int setSex(int sex) { return this.sex = sex; }
    
    public void printInfo()
    {
        System.out.print(getFirstName()+" "+getLastName()+" is "+ getAge()+" years old, gets a " + getSalary() + " Euros salary and is");
        
        if (isMarried() == false)
            System.out.print(" not");
        
        System.out.print(" married ");
        if (getSex() == 0)
            System.out.println("and the sex is male.");
        else
            System.out.println("and the sex is female.");
    }
}