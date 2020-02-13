import java.util.*;

abstract class Employee
{
    private String name;
    private String afm;
    private long EmpID;
    private static long count = 0;
    
    public Employee(String name, String afm)
    {
        this.name = name;
        this.afm = afm;
        count++;
        this.EmpID = count;
    }
    
    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    
    public void setAfm(String afm){this.afm = afm;}
    public String getAfm(){return afm;}
    
    public long getEmpID(){return EmpID;}
    
    public abstract int payment();
}

class SalariedEmployee extends Employee
{
    private int salary = 0;
    
    public SalariedEmployee(String name, String afm, int salary)
    {
        super(name, afm);
        this.salary = salary;
    }
    
    public void setSalary(int salary){this.salary = salary;}
    
    public int payment(){return salary;}
}

class HourlyEmployee extends Employee
{
    private int hoursWorked = 0;
    private int hourlyPayment = 0;
    
    public HourlyEmployee(String name, String afm, int hoursWorked, int hourlyPayment)
    {
        super(name, afm);
        this.hoursWorked = hoursWorked;
        this.hourlyPayment = hourlyPayment;
    }
    
    public void setHoursWorked(int hoursWorked){this.hoursWorked = hoursWorked;}
    public int getHoursWorked(){return hoursWorked;}
    
    public void setourlyPayment(int hourlyPayment){this.hourlyPayment = hourlyPayment;}
    public int getHourlyPayment(){return hourlyPayment;}
    
    public int payment(){return hoursWorked*hourlyPayment;}
}

class Company
{
    private String name;
    private String afm;
    
    ArrayList<Employee> myEmployees = new ArrayList<Employee>();
    
    public void addEmployee(Employee emp)
    {
        myEmployees.add(emp);
    }
}

public class Main
{
    public static void main(String args[])
    {
        SalariedEmployee ob1 = new SalariedEmployee("Giorgos Vasiliou", "72340002",3000);
        HourlyEmployee ob2 = new HourlyEmployee("Zenia Tsegkou", "98145821", 210, 20);
        
        Employee[] arr = new Employee[2];
        arr[0] = ob1;
        arr[1] = ob2;
        
        for(int i=0; i < arr.length; i++)
        {
            System.out.println("Employee ID: " + arr[i].getEmpID());
            System.out.println("Employee Name: " + arr[i].getName());
            System.out.println("Employee AFM: " + arr[i].getAfm());
            System.out.println("Employee Payment: " + arr[i].payment());
            System.out.println("");
        }
        
        Company GlobalSA = new Company();
        
        GlobalSA.addEmployee(ob1);
        GlobalSA.addEmployee(ob2);
        
        System.out.println("Employees working for GlobalSA");
        
        for (int i=0; i < GlobalSA.myEmployees.size(); i++)
        {
            System.out.println(GlobalSA.myEmployees.get(i).getName());
        }
    }
}