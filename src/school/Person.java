package school;
import java.util.ArrayList;
public class Person {
    enum Gender {
        Male,Female
    }
//    public static int numPeople = 10;
    private static int currentPeopleIndex = 0;
//    private static Person people[] = 
//    new Person[numPeople];
    private static ArrayList<Person> people = 
            new ArrayList<Person>();
    private String name;
    private Gender gender;
    private int weight;

    public static Person addPerson(String _name,
    Gender _gender, int _weight)
    {
        Person temp = new Person(_name,_gender,_weight);
//        people[currentPeopleIndex++] = temp;
        people.add(temp);
        return(temp);
    }
    Person()
    {
        name = "None";
        gender = Gender.Female;
        weight = 100;
    }
    Person(String _name,Gender _gender,int _weight)
    {
        name = _name;
        gender = _gender;
        weight = _weight;
    }   
    public void setWeight(int _weight)
    {
        weight = _weight;
    }
    public int getWeight()
    {
        return(weight);
    }       
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return(name);
    }    
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
    public Gender getGender()
    {
        return(gender);
    }  
    public static void printNames()
    {
        System.out.println("===printNames===");
        
//        for (Person temp : people)
//        {
//                System.out.println(temp.getName());
//        }
        for (int index=0;index<people.size();index++)
        {
                System.out.println(people.get(index).getName());
        }        
    }
    public static void printNames(Gender _gender)
    {
        System.out.println(
        "===printNamesOfGender=== " + _gender);
        for (Person temp : people)
        {
            if (temp.gender == _gender)
                System.out.println(temp.getName());
        }
             
    }    
    public String toString()
    {
        return(name + " " + gender + " " + weight);
    }
}
