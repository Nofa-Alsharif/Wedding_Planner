/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* describes the menu
*/

package weddingplanner;

import java.util.*;
/**
 *
 * @author Noufa, maram
 */
public class Menu implements Details {
    //The attribute is the name and the price 
    //---------------------------
    protected String name;
    protected double price;
    protected boolean ordering = true;
    String details;
    Scanner in = new Scanner(System.in);
    //defult vaeiable
    //-------------------------

    //-------------------------
    public Menu() {
        //Using defult constructer
    }
    //--------------------------

    /**
     * method Menu its constractor
     *
     * @param n its name of food item
     * @param p its the price
     *
     */
    public Menu(String n, double p) {
        this.name = n;
        this.price = p;
    }

    /**
     * get method to returns meal name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set the name attribute
     *
     * @param n name of meal
     */
    public void setName(String n) {
        this.name = n;
    }

    /**
     * get method to returns price
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * set the price attribut
     *
     * @param p price of the meal
     */
    public void setPrice(int p) {
        this.price = p;
    }

    /**
     * menu method to choose the food item for the show list
     *
     * @param o list of menu
     * @param i order number
     * @return 0.0
     */
    public double menu(Object[] o, int i) {
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
        return price;

    }

    /**
     * swich_case method to select the usre choose
     *
     * @param o list of menu
     * 
     */
    public void swich_case(Object[] o) {
        do {
            System.out.println("Choose");
            int b = in.nextInt();
            int choosingNum = 0;
            switch (b) {
                case 1:
                    choosingNum = 1;
                    menu(o, choosingNum);
                    break;
                case 2:
                    choosingNum = 2;
                    menu(o, choosingNum);
                    break;
                case 3:
                    choosingNum = 3;
                    menu(o, choosingNum);
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
     * addDetalls To allowed the users to write details and notes if they have
     * it.
     */
    @Override
    public void addDetails() {
      System.out.print("Enter number 1 to add ");
        int choice = in.nextInt();
        if (choice == 1) {
            Scanner in= new Scanner(System.in);
            System.out.print(": ");
            String notes = in.nextLine();
            System.out.println("Dear customer, you order to add detalls:* " + notes + " *enjoy your shopping");
        } else if (choice > 2 || choice < 1) {
            System.out.println(" ! Please Try Again ! ");
            choice = -1;
            addDetails();
        }
    }
    

    /**
     * done method to finish the order
     */
    public void done() {
        ordering = false;
        System.out.println("Enjoy your shoping");
    }

    /**
     * toString method
     *
     * @return null
     */
    @Override
    public String toString() {
        return null;
    }
    
}
