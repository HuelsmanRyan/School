/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
/////////////////////////////////////////////////////////////////////////////////////////////// BOOM 
/**
 *
 * @author jeffreyyee
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person joe = 
        Person.addPerson("Joe",Person.Gender.Male,120);
        Person jill = 
        Person.addPerson("Jill",Person.Gender.Female,105);
        jill.setName("Julie");
        Person billyJoe = 
        Person.addPerson("BillyJoe",Person.Gender.Male,210);
        
        billyJoe.getWeight();
        int val = billyJoe.getWeight();
        
        Person.printNames();
        Person.printNames(Person.Gender.Female);
        
        System.out.println(billyJoe);
    }
}
