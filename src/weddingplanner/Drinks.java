/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Describe the types of drinks
*/

package weddingplanner;



/**
 *
 * @author Noufa
 */
public class Drinks extends Menu {
  //to describe what offer with the juice
    private String WithSome;
     
 
   public Drinks(){
   }
   
   /**
     * method Drinks its constractor
     *
     * @param n its name of food item
     * @param p its the price
     *
     */
    public Drinks(String n, double p) {
        super(n, p);
        this.WithSome = " Orange";
    }
 
   
    /**
     * method Drinks its constractor
     *
     * @param n its name of food item
     * @param p its the price
     * @param WithSome its details of the drink
     */
    public Drinks(String n,double p, String WithSome) {
        super(n, p);
        this.WithSome = WithSome;
    }
 
   
    /**
     * get method to returns WithSome
     *
     * @return WithSome
     */
    public String getWithSome() {
        return WithSome;
    }
 
    /**
     * set the details attribute
     *
     * @param WithSome its details of the drinks
     */
    public void setWithSome(String WithSome) {
        this.WithSome = WithSome;
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
        Drinks[] d = (Drinks[]) o;
        if (i == 1) {
            System.out.println("You order " + o[0]);
            //like orange juice 10.0$
            price = 10.0;
        }
        if (i == 2) {
            System.out.println("You order " + o[1]);
            //or apple juice 10.0$
            price = 10.0;
        }
        if (i == 3) {
            System.out.println("You order " + o[2]);
            // smoothie 10.0$
            price = 10.0;
        }
        if (i == 4) {
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
        return (name + "with some of "+WithSome+" "+price + "$ ");
         //method to orgnaized the output of the array 
    }

    
}
