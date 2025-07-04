/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* This class is for the main class for package weddingplanner
*/
package weddingplanner;
import java.util.*;
/**
 *
 * @author Maram , Nova , Jory,  Raghad Al-Otaibi , Raghad Bawahab.
 */
public class Planner {

    /**
     * @param args the command line arguments
     */
    
     /* DESCRIBING all implemented methods in your project ?
     * We designed a project so that it is easy for the user to book the wedding date, 
     * ceremony details, decorations, food and drink selection, and the wedding venue faster and tidy.
     */
    
     /* HOW to use your program (should act as a user manual) ?
     * At first, the user puts her/his personal data, then he starts by selecting the type of wedding, date and place, 
     * choosing decorations, adding additional details if the user wants, choosing food and drink,  
     * and finally whether she/he wants to complete the order or cancel the order.
     */
    
     /* LISTING all team members and their contributions on the project ?
     * We all draw the information, arrange and distribute the tasks, write the code for the project, 
     * review it so there are no errors, format the information, put it in order, and write the javadoc.
     * Therefore, all team members contributed to most parts of the project, whether by implementing,reviewing  
     * and correcting errors. 
     */
    
     /* DESCRIBES any other concepts that are self-taught and behind the learning objectives of this course ?
     * In our project, we thought of using the concept of [GUI] to facilitate the entry of information by the users 
     * and the appearance of the results for them.
     */ 
    
     //  The Driver Program.
    public static void main(String[] args) {
       
        
        Scanner input = new Scanner(System.in);
        
        //Declare and instantiate a user informationobject
       
        User us = new User("Ahmed", 575899599, "ah332@email.com", 1114433980);
        //Prompt the user to enter information
        System.out.println("Please enter your name:");
        us.setUserName(input.next()); 
        
        //To verify that a valid phone number is entered
        try { System.out.println("Please enter the phone number:");
        Long num = input.nextLong();
        us.setUserNumber(num); 
        }catch (NumberFormatException e){
             System.out.println("You did not enter a valid phone number, please try again");
             Long num = input.nextLong();
             us.setUserNumber(num);
        }
        
        System.out.println("Please enter your email:");
        us.setUserEmail(input.next());
          // Check for an email
        us.emailName(us.getUserEmail());
        
        // To verify that a valid ID number is entered
        try { System.out.println("Please enter the ID number:");
         Long id = input.nextLong();
         us.setUserID(id);
        }catch (NumberFormatException e){
            System.out.println("You did not enter a valid ID number, please try again");
             Long id = input.nextLong();
             us.setUserID(id);
        }
         
         
   
       

        //Display the user information
        System.out.println("your information:");
        System.out.println("Name: " + us.getUserName() + " Number: " + us.getUserNumber() + " Email: " + us.getUserEmail() + " ID: " + us.getUserID());

       



        //declare and instantiate a WeddingDate
        Date obj1 = new Date(12, 9, 2022);

        // store input for user
        System.out.println("please enter wedding day: ");
         obj1.setDay(input.nextInt()); 

        System.out.println("please enter wedding month: ");
        obj1.setMonth(input.nextInt());

        System.out.println("please enter wedding year: ");
        obj1.setYear(input.nextInt());

        //display the Weddingdate 
        System.out.println("the wedding date: ");
        System.out.println(obj1.toString());
      

        //declare and instantiate a Wedding information
       
        // store input for user
        Wedding obj2 = new  Wedding();
        System.out.println("please Enter Number of attendees ? ");
        obj2.setInvocations(input.nextInt()); 

        System.out.println("please Enter number of Chairs ? ");
        obj2.setChairs(input.nextInt()); 

        System.out.println();
        System.out.println("please Enter number of Tables ? ");
        obj2.setTables(input.nextInt()); 
        
        //  method remove Cancel the request when nothing is entered from the user
         obj2.remove(); 

    

        //display the Wedding information
        System.out.println("Wedding information: ");
        System.out.println("Date:" +obj1.toString()+ "\n"+"AttendeesInformation: "+ obj2.toString());
        
      // declare and instantiate a Wedding Adornment.
        Adornment ado = new Adornment();

        System.out.println("Dear customer we have two kinds of packages : ");
        System.out.println(" 1 " + ado.getPackageOne());
        System.out.println(" 2 " + ado.getPackageTow());
        System.out.println(" Dear customer please choose the type of package :  \n choose number 1 or 2 ");

        int type = input.nextInt();

        if (type == 1) {
            System.out.println("Dear customer,you have chosen the first package: " + "simple Package");
        } else if (type == 2) {
            System.out.println("Dear customer,you have chosen the second package: " + "royal Package");
        }

        System.out.println(" Dear customer please choose the color of roses : ");
        System.out.println(Arrays.toString(ado.themePackages()));
        ado.setRoseColor(input.next());
        System.out.println("Dear customer you have chosen the color : " + ado.getRoseColor());

        ado.location();

        ado.addDetails();
        
        
        
        //Menu of Appreciate class
        Scanner in= new Scanner (System.in);
        System.out.println("Appreciate\n");
        
      
        Appreciate a = new Appreciate();// creat object of calss Appreciate 
        Appreciate[] obj = new Appreciate[6];
        obj[0] = new Appreciate("Steak", 20.0, "smash potatoes");
        obj[1] = new Appreciate("Salad", 10.0, "soy sauce");
        obj[2] = new Appreciate("Dynamite shrimps", 15.0, "lettuce pieces");
        obj[3] = new Appreciate("Sushi", 20.0, "soy sauce");
        obj[4] = new Appreciate("Spaghetti", 15.0, "tomato sauce");
        obj[5] = new Appreciate("Mini poultry leg ", 10.0, "spicy sauce");

        //print all array element
        for (int i = 0; i < obj.length; i++) {
            System.out.println(i + 1 + "- " + obj[i]);
        }
        System.out.println("7 - Done");
        a.swich_case(obj);
        
        
        System.out.print("would you like any details (yes / no)");
        char answer = in.next().charAt(0);
        Character c = answer; // useing wrapper class tayp Character

        if (c == 'y') {
            a.addDetails();
        } else {
            System.out.println("Dear customer, you can continue to shop.");
        }
        
        //Menu of Drinks class
        Drinks d = new Drinks(); // creat object of calss Drinks
        Drinks[] obj3 = new Drinks[3];
        System.out.println("\n*Drinks*\n");
        obj3[0] = new Drinks("Orange juice", 10.0, "orange slices");
        obj3[1] = new Drinks("apple juice", 10.0, "apple slices");
        obj3[2] = new Drinks("Soda", 10.0, "ice");

        //print all array element
        for (int j = 0; j < obj3.length; j++) {
            System.out.println(j + 1 + "- " + obj3[j]);
        }
        System.out.println("4 - Done");
        d.swich_case(obj3);//call method Overrid swich_case(obj1)
        
        
        System.out.print("would you like any details (yes / no)");
        answer = in.next().charAt(0);
        c = answer; // useing wrapper class tayp Character

        if (c == 'y') {
            d.addDetails();
        } else {
            System.out.println("Dear customer, you can continue to shop.");
        }
         
        
        //Menu of Sweet class
        Sweet s = new Sweet();// creat object of calss Sweet
        Sweet[] obj4 = new Sweet[4];
        System.out.println("\n*Sweet*\n");
        obj4[0] = new Sweet("cupCake", 10.0, "chocolate", "some fruit");
        obj4[1] = new Sweet("cookies", 3.0, "classic", "chocolate");
        obj4[2] = new Sweet("CheeseCake", 10.0, "strawberry", "strawberry pieces");
        obj4[3] = new Sweet("Mini chocolate", 5.0, "almonds", "chocolate");

        //print all array element
        for (int k = 0; k < obj4.length; k++) {
            System.out.println(k + 1 + "- " + obj4[k]);
        }
        System.out.println("5 - Done");
        s.swich_case(obj4);//call method Overrid swich_case(obj1)
        
        
        System.out.print("would you like any details (yes / no)");
        answer = in.next().charAt(0);
        c = answer; // useing wrapper class tayp Character

        if (c == 'y') {
            s.addDetails();
        } else {
            System.out.println("Dear customer, you can continue to shop.");
        }
        
        

        // Asking the user if he wants to delete any details
        System.out.println("Do you want to delete any detail? \\ Please choose number 1 for Yes or number 2 for NO \\");
        String userdelet = input.next();
        if (null == userdelet) {
            System.out.println("There is an entry error");
        } else {
            switch (userdelet) {
                case "2":
                    us.delet();
                    break;
                case "1":
                    System.out.println("Please enter the details you want to delete");
                    String deletDital = input.next();
                    System.out.println("The details you want to delete have been deleted");
                    break;
                default:
                    System.out.println("Dear customer, you can continue to shop.");
                    break;
            }
        }

        
        //We ask the user if he wants to cancel the wedding or not
        System.out.println("Do you want to cancel the wedding?");
        String cancel = input.next();
        if ("yes".equals(cancel)) {
            us.cancel();
        }else  System.out.println("   Thank you for choosing us to organize your wedding!  ");
       
    }
            

}
