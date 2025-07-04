/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weddingplanner;
import java.util.*;
/**
 *
 * @author raghad Bawahab
 */
public  abstract class Themes {
       // star body class
    
    protected String WeddingDescription ; 
    protected String WeddingType ;
    protected String location ;
    
    /**
     *  location to Determine the wedding venue
     */
    
    public abstract void location () ;

   
    /**
     * 
     * @return RoseColor
     */
   
    public abstract  String [] themePackages () ;  
       

    
}// end body class
