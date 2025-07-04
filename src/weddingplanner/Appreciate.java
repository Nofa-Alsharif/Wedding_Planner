/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Describes menu requirements and details
*/

package weddingplanner;
/**
 *
 * @author Noufa
 */
public class Appreciate extends Menu {
   //to describe what offer with the dish
    String details;
 
   
   //Constructer -- stor name / price
    Appreciate() {
        super("Steak ", 20.0);
        this.details = "With mash potatoes ";
    }

   
    /**
     * method Appreciate its constractor
     *
     * @param n its name of food item
     * @param p its the price
     * @param d its details of the dish
     */
    Appreciate(String n, double p, String d) {
        super(n, p);
        details = d;
    }
 
   
   /**
     * getDetails returns details
     *
     * @return details
     */
    public String getDetails() { 
        return details;
    } 
 
   
    /**
     *  set the details attribute
     *
     * @param s its details of the dish
     * 
     */
    public void setDetails(String s) {
        this.details = s;
    }
 
     /**
     * menu method to choose the food item for the show list
     *
     * @param o list of menu
     * @param i order number
     * @return price
     */
    @Override
    public double menu(Object[] o, int i) {
        //casting the type of array
        Appreciate[] a= (Appreciate[])o;
        boolean ordering = true;
        if (i == 1) {
            System.out.println("You order " + o[0]);
            //like salad 10.0$
            price = 10.0;
        }
        if (i == 2) {
            System.out.println("You order " + o[1]);
            //or Dynamite Shrimp 15.0$
            price = 15.0;
        }
        if (i == 3) {
            System.out.println("You order " + o[2]);
            // Sushi 20.0$
            price = 20.0;
        }
        if (i == 4) {
            System.out.println("You order " + o[3]);
            // Spaghetti 15.0$
            price = 15.0;
        }
        if (i == 5) {
            System.out.println("You order " + o[4]);
            // Poultry leg 10.0$
            price = 10.0;
        }
        if (i == 6) {
            System.out.println("You order " + o[5]);
            // Takos 10.0$
            price = 10.0;
        }
        if (i == 7) {
            System.out.println("Done ");
            ordering = false;
        }
        return price;
        
    }
    @Override
    
    /**
     *  swich_case method to select the usre choose
     *  @param o[] list of menu
     *  @post
     */
     public void swich_case( Object[] o){
       do{
      System.out.println("Choose");
        int b = in.nextInt();
          int foodItem = 0;
   switch(b){
            case 1:
                foodItem = 1;
                menu(o, foodItem);
                break;
            case 2:
                foodItem = 2;
                menu(o, foodItem);
                break;
            case 3:
                foodItem = 3;
               menu(o, foodItem);
                break;
            case 4:
                 foodItem = 4;
               menu(o, foodItem);
               break;
            case 5:
                 foodItem = 5;
               menu(o, foodItem);
               break;
            case 6:
                 foodItem = 6;
               menu(o, foodItem);
               break;
            case 7 :
               done();
                break;    
            default:
                System.out.println("Invalid option.");
            }
        } while (ordering);
        {

        }
    }

    /**
     *  toString method  
     *  
     * @return useful informations
     */
    @Override
    public String toString() {
        return (name + " served with " + details + " " + price + "$ ");
        //method to orgnaized the output of the array  
    }

    
}
