import java.util.*; 

abstract class MyTester
{
    public static void main (String[] args)
    {
        MarriedPerson mp1 = new MarriedPerson("Tront", "Betty", 31, 980.5f, Person.FEMALE, 3); 
        MarriedPerson mp2 = new MarriedPerson("Tront", "Kirk", 31, 2080f, Person.MALE, 2); 
        MarriedPerson mp3 = new MarriedPerson("Tront", "Sonia", 31, 600f, Person.FEMALE, 0); 
        mp1.printInfo(); 
        mp2.printInfo(); 
        mp3.printInfo(); 
        mp1.setSalary(mp2); 
        mp1.printInfo(); 
        mp1.setSalary(mp3); 
        mp1.printInfo(); 
        mp1.setSalary(mp2.getSalary()); 
        mp1.printInfo();
        /*
        MarriedPerson[] mpArray = new MarriedPerson[2];
        mpArray[0] = mp1;
        mpArray[1] = mp2;
        for(int i=0; i < mpArray.length; i++)
        {
            mpArray[i].printInfo();
        }
        
        List<MarriedPerson> mpList = new ArrayList<MarriedPerson>();
        mpList.add(mp1);
        mpList.add(mp2);
        mpList.add(mp3);
        
        Iterator iter = mpList.iterator();
        
        while(iter.hasNext())
        {
            MarriedPerson mp = (MarriedPerson)iter.next();
            mp.printInfo();
        }
        
        for(MarriedPerson mp : mpList)
        {
            mp.printInfo();
        }*/
    } 
}