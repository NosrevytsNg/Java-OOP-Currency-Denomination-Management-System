// ICT167 Assignment 1
// Styverson Ng (35427675)
// ICT167 Assignment -> assignment(package name) -> ChangeC (class name)
// Assumption : User may manually input data or use the preset data in getSample
// Condition (Preset): Set usePreset (true) in Line 21
// Condition (Manual Input) : Set usePreset (false) in Line 21




package assignment;
import java.util.Scanner;


public class ChangeC {
    public static void main(String[] args){
        StudentInfo();
        Scanner input = new Scanner(System.in);
        int arrayCapacity = 10;
        Person[] people = new Person[arrayCapacity];
        boolean usePreset = true; // change to true to use getSample method for preset hardcoding sameples
        
        // hardcoding sample data for testing and lecturer's use
        if(usePreset == true){
            getSample(people);
            // uncomment printInfo to check if getSample's data has been registered into the array
            //printInfo (people);
        }
        else{
            int index = 0; // used to track the position of a person in the array
            boolean cont = true;
        
            // loop to insert person's name and detail
            while(cont == true && index < arrayCapacity){
                String name = getPersonName(input, people);
                double money = getPersonMoney(input);
                input.nextLine();
            
                Person newPerson = new Person(name,money);
                newPerson.setName(name);
                newPerson.setMoney(money);
                people[index++] = newPerson; // add the new person and increment index
                
                // option for user to add more person or break loop
                if (index < arrayCapacity){
                    System.out.println("Do you have more person to enter (Y/N)");
                    String reply = input.nextLine();
                    
                    if(reply.equalsIgnoreCase("n")){
                        cont = false;   
                    }
                }        
            }
        }    
        // calling menu application for the user to choose
         currencyMenu(input, people);   
    }
    
    
    
    // method for inputting customer's name
    public static String getPersonName(Scanner input, Person[] person){
        System.out.println("Please enter the name of the person: ");
        String name = input.nextLine();
        
        // check for duplicate name existing in list
        for (Person personIndex : person){
            if (personIndex != null && personIndex.getName().equalsIgnoreCase(name)){
                System.out.println("You have entered a registered name. Please enter a different name.");
                return getPersonName(input, person); 
            }
        }
        return name;
    }
    
    // method for inputting customer's money
    public static double getPersonMoney(Scanner input){
        System.out.println("Please enter the currency note value for the person: ");
        
        // loop to check if user input valid money value
        while (true){
            if (!input.hasNextDouble()){
                System.out.println("Invalid input. Please enter a valid money value.");
                input.next(); 
            } 
            else{
                double money = input.nextDouble();
                    input.nextLine();    

                // check and prompt user if money value is a multiple of 5
                if (money % 5 != 0) {
                    System.out.println("Please enter the amount in multiple of 5.");
                }
                else{
                    return money;
                }
            }
        }
    }
    
    // method for calculating the denominations of customer's money
    public static void denomination(double money){
        double[] denominations = {1000, 500, 200, 100, 50, 20, 10, 5}; 
        double remainder = money; 
        int[] counter = new int[denominations.length]; 

        // calculate each denomination
        for(int currentDenomination = 0; currentDenomination < denominations.length; currentDenomination++) {
            counter[currentDenomination] = (int) (remainder / denominations[currentDenomination]); 
            remainder = remainder % denominations[currentDenomination]; 
        }

        // print non-zero denominations
        for(int currentDenomination = 0; currentDenomination < denominations.length; currentDenomination++) {
            if(counter[currentDenomination] > 0){
                System.out.println("AED " + (int)denominations[currentDenomination] + ": " + counter[currentDenomination]);
            }
        }
    }

    // menu application for the user to choose
    public static void currencyMenu(Scanner input, Person[] people){
        int answer = 0;
        
        // menu interface
        while(answer != 6){
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Please enter your desired function: ");
            System.out.println("1. Enter a name and display change to be given for each denomination. ");
            System.out.println("2. Find the name with the smallest amount and display denomination breakdown. ");
            System.out.println("3. Find the name with the largest amount and display denomination breakdown.");
            System.out.println("4. Calculate and display the total number of currency note for each denomination.");
            System.out.println("5. Calculate and display the total amount for the sum of all denominations. ");
            System.out.println("6. Exit ");
            System.out.println("------------------------------------------------------------------------------------------------");
            answer = input.nextInt();
            
            // menu option list and error prompt
            if(answer <= 0 || answer >= 7){
                System.out.println("You have chosen an invalid number");
                System.out.println("                                 ");
            }
            
            else if(answer == 1) {
                // Search for name and display calculate the denomination
                System.out.println("Please enter name");
                String name = input.next();
                boolean found = false;
                
                
                for(int currentPerson = 0; currentPerson < people.length; currentPerson++){
                    if(people[currentPerson] != null && people[currentPerson].getName().equalsIgnoreCase(name)){
                        found = true;
                        System.out.println("------------------------------------------------------------------------------------------------");
                        System.out.println("Customer:");
                        System.out.println(people[currentPerson]);
                        System.out.println("");
                        System.out.println("Change: ");
                        denomination(people[currentPerson].getMoney());
                        break;
                    }
                }
            }
            
            else if(answer == 2) {
                // search for name with smallest money and calculate denomination
                Person smallestAmount = people[0];
                for(int currentPerson = 0; currentPerson < people.length; currentPerson++)
                    if (people[currentPerson] != null && people[currentPerson].getMoney() < smallestAmount.getMoney()) {
                    smallestAmount = people[currentPerson];    
                }
                if (smallestAmount != null) {
                    System.out.println("------------------------------------------------------------------------------------------------");
                    System.out.println("Person with the smallest amount of money:");
                    System.out.println(smallestAmount.toString());
                    denomination(smallestAmount.getMoney());
                } 
            }
            
            else if(answer == 3) {
                // search for name with largest money and calculate denomination
                Person largestAmount = people[0];
                for (int currentPerson = 0; currentPerson < people.length; currentPerson++) {
                    if (people[currentPerson] != null && people[currentPerson].getMoney() > largestAmount.getMoney()) {
                    largestAmount = people[currentPerson];
                    }
                }

            if (largestAmount != null) {
                System.out.println("------------------------------------------------------------------------------------------------");
                System.out.println("Person with the largest amount of money:");
                System.out.println(largestAmount.toString());
                denomination(largestAmount.getMoney());
                } 
            }
            
            else if(answer == 4) {
                // calculate and display total number of each denomination
                double totalSum = 0;

            for (int currentPerson = 0; currentPerson < people.length; currentPerson++) {
                if (people[currentPerson] != null) {
                    totalSum += people[currentPerson].getMoney();
                }
            }
            
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("This is the total amount of notes in each denomination: ");
            denomination(totalSum);   
            }
            
            else if(answer == 5){
                // calculate and display total amount of $$ of total denomination 
                double totalSum = 0;

            for (int currentPerson = 0; currentPerson < people.length; currentPerson++) {
                if (people[currentPerson] != null) {
                    totalSum += people[currentPerson].getMoney();
                }
            }

            System.out.println("Total amount of all denominations: AED " + (int)totalSum);
            }
            
            else{
                break;
            }  
        }
        System.out.println("Thank you and Goodbye!"); 
    }
    
    public static void getSample(Person[] data){
        //Hard code some instances to facilitate testing
        //Hard coding for lecturer's use
        data[0] = new Person("Charles",4685);
        data[1] = new Person("Carlos",3265);
        data[2] = new Person("Max",6985);
        data[3] = new Person("Pierre",6635);
        data[4] = new Person("Daniel",10180);
        data[5] = new Person("Fernando",1925);
        data[6] = new Person("Lewis",685);
        data[7] = new Person("Oscar",3215);
        data[8] = new Person("Lando",7345);
        data[9] = new Person("George",965);  
    }
    
        // method to display person(s) information
    public static void printInfo(Person[] person){
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Customers:");
        for (Person currentPerson : person){
            if (currentPerson != null){
                System.out.println(currentPerson);
            }   
        }
    }
    
    // method to display student information
    public static void StudentInfo(){
        System.out.println("Student Name: Styverson Ng");
        System.out.println("Student Number: 35427675");
        System.out.println("Murdoch University");
        System.out.println("Lecturer's Name: Siew Cheong Chong");
    }
}
    

