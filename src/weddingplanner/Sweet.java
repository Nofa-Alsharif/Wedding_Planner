/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Describe the types of sweetness
*/

package weddingplanner;


/**
 *
 * @author Noufa
 */
public class Sweet extends Menu {
    //Frist child class is about sweet
    //------------------------------------
    //Flavor variable is to show what kind of the dish is if it : Chocolate or Vanilla
    private String flavor;
    //------------------------------------
    //Dtails variable is to show what kinf of presentations is : some of fruit or with flower
    String details;
    //-----------------------------------
    
     public Sweet(){
   }
    /**
     * method Appreciate its constractor
     *
     * @param n its name of food item
     * @param p its the price
     */
    public Sweet(String n, double p) {
        super(n, p);
        this.flavor = "Chocolate";
        this.details = "Some fruit";
    }
   
     //----------------------------------
      /**
     * method Appreciate its constractor
     *
     * @param n its name of food item
     * @param p its the price
     * @param flavor its show what kind of the dish
     * @param d its details of the dish
     * 
     */
    public Sweet(String n, double p, String flavor, String d) {
        super(n, p);
        this.flavor = flavor;
        this.details = d;
    }
    
   
   /**
     * get method to returns flavor
     *
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }
   
     /**
     * set the flavor attribute
     *
     * @param flavor its show what kind of the dish
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
 
   
   /**
     * get method to returns details
     *
     * @return details
     */
    public String getDetails() {
        return details;
    }
    /**
     * set the details attribute
     *
     * @param details its Details
     */
    public void setDetails(String details) {
        this.details = details;
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
        //casting tha type of the array

        Sweet[] s = (Sweet[]) o;
        if (i == 1) {
            System.out.println("You order " + o[0]);
            //like cupCake 10.0$
            price = 10.0;
        }
        if (i == 2) {
            System.out.println("You order " + o[1]);
            //or cookies 3.0$
            price = 3.0;
        }
        if (i == 3) {
            System.out.println("You order " + o[2]);
            // CheeseCake 10.0$
            price = 10.0;
        }
        if (i == 4) {
            System.out.println("You order " + o[3]);
            // Mine chocolate 5.0$
            price = 5.0;
        }
        if (i == 5) {
            System.out.println("Done ");
            ordering = false;
        }
        return price;
    }

   /**
     *  swich_case method to select the usre choose
     *  @param o list of menu
     *  
     */
    @Override
    public void swich_case(Object[] o) {
        do {
            System.out.println("Choose");
            int b = in.nextInt();
            int foodItem = 0;
            switch (b) {
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
        return (flavor+" "+name + " with some of "+details+" "+price + "$ ");
        //method to orgnaized the output of the array  
    }
    
}
