/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weddingplanner;
import java.util.* ;
/**
 *
 * @author Raghad Bawahab, Maram
 */
public class Adornment extends Themes implements Details {
    // star body class
    
    
    private String RoseColor;
    private String PackageOne = ("simple Package : it contains coordinating and equipping the hall entrance and the kosha  ");
    private String PackageTow = ("royal Package : it contains coordinating and equipping the hall entrance and the kosha in addition to the table , chairs and  aisles and the dinner room");
    private int price;
 
    /**
     * To set the color of roses
     * @param RoseColor is a color of rose
     */
    
    public void setRoseColor(String RoseColor) {    // star body set
        this.RoseColor = RoseColor;
    }    // end body set

    /**
     * getRoseColor to retunn RoseColor
     * @return to color of rosr
     */
    
    public String getRoseColor() {    // star body get
        return RoseColor;
    }     // end body get

    /**
     * getPackageOne to return PackageOne
     * @return to Package one
     */
    
    public String getPackageOne() {
        return PackageOne;
    }

    /**
     * To set package one
     * @param PackageOne to package one
     */
    
    public void setPackageOne(String PackageOne) {
        this.PackageOne = PackageOne;
    }

    /**
     * getPackageTow to return PackageTow
     * @return to Package tow
     */
    
    public String getPackageTow() {
        return PackageTow;
    }

    /**
     *To set package tow
     * @param PackageTow to package tow
     */
    
    public void setPackageTow(String PackageTow) {
        this.PackageTow = PackageTow;
    }

    /**
     *Adornment is a constructor
     */
    
    public Adornment() {    // star body Adornment

    }   // end body Adornment

    /**
     *Adornment is a constructor of class adornment initializing class fields
     * 
     * @param r is rose color
     * @param p1 is package one
     * @param p2 is package tow
     * @param p  is price
     */ 
    
    public Adornment(String r, String p1, String p2, int p) {    // star Adornment

        this.RoseColor = r;
        this.PackageOne = p1;
        this.PackageTow = p2;
        this.price = p;

    }     // end Adornment

    @Override
    public void addDetails() {  // star body addDetails
        System.out.println(" If you have other details you want in the Adornment:\n please choose the number 1, otherwise choose the number 2.");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Dear customer, Write your notes here!");
            Scanner input2 = new Scanner(System.in);
            String notes = input2.nextLine();
        } else if (choice == 2) {
            System.out.println("Dear customer, you can continue to shop.");
        } else if (choice > 2 || choice < 1) {
            System.out.println("  ! Please Try Again ! ");
            choice = -1;
            addDetails();
        }

    }    // end body addDetails

    /**
     * To determine the color of roses
     * @return to rose color
     */ 
    
    @Override     // Implement methods to class (Themes)
    public String[] themePackages() {    // star body themePackages

        String RoseColor[] = {"red", " white", "pink", "yellow "};

        return RoseColor;

    }    // end body themePackages

    /**
     *To determine the location of the wedding
     */
    
    @Override   // Implement methods to class (Themes)
    public void location() {    // star body @Override location
        String location1 = " in the sea";
        String location2 = " in  hotel";
        String specifiedLocation;
        System.out.println(" please Choose the location you want. \n choose number 1 or 2");
        System.out.println("1-" + location1);
        System.out.println("2-" + location2);

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Dear customer,you have chosen the first location: " + location1);
            specifiedLocation = location1;
        } else if (choice == 2) {
            System.out.println("Dear customer,you have chosen the second location: " + location2);
            specifiedLocation = location2;
        } else if (choice > 2 || choice < 1) {
            System.out.println("  ! Please Choose Again ! ");
            choice = -1;
            location();
        }

    }    // end body @Override location


    
}
