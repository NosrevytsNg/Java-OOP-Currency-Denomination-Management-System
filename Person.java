// ICT167 Assignment 1
// Styverson Ng (35427675)
// ICT167 Assignment -> assignment(package name) -> Person (class name)
// Assumption & Condition : ChangeC (class name) must be in the same package as in File Name (Line 3)


package assignment;


public class Person {
    private String name;
    private double money;
  
    public Person(String personName, double personMoney){
       name = personName;
       money = personMoney;
    }
    
    public String getName(){
    return name;
    }
    
    public double getMoney(){
    return (int)money;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setMoney(double money) {
        this.money = money;
    }
    
    @Override
    public String toString(){
        return name + " AED " + money;
    }     
}