public class MarriedPerson extends Person 
{
    private int children;
    
    public MarriedPerson(String lastname, String firstname, int age, float salary, int sex, int children) 
        {
            super(lastname, firstname, age, true, salary, sex);
            this.children = children;
        }
    
    public void printInfo()
    {
        System.out.print(getFirstName()+" "+getLastName() +" is " +getAge()+ " years old, gets a " + getSalary() +" Euros salary and is" + " married with ");
        if (getNoOfChildren() > 0)
            System.out.print(getNoOfChildren());
        else
            System.out.print("no");
        System.out.print(" children ");
        if (getSex() == 0)
            System.out.println("and the sex is male.");
        else
            System.out.println("and the sex is female.");
    }
    
    public boolean setMarried(boolean married) 
    {   
        return isMarried();
    }
    
    public int getNoOfChildren() { return children; }
    
    float setSalary(MarriedPerson spouse)
    {
        if(spouse.getSex() != getSex())
        {
            super.setSalary(getSalary() + spouse.getSalary());
        }
        
        return super.getSalary();
    }
}