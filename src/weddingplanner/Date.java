/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Describes the date of the wedding
*/

package weddingplanner;

/**
 *
 * @author Jory
 */
public class Date {
    //  days of the week 

    private int day;
    //all month in the year
    private int month;
    // number of year
    private int year;
    private int d;

     /**
     * method Date its constractor
     */
     public Date (){
         
     }
    /**
     * method Date its constractor
     *
     * @param d its days of the week
     * @param m its all month in the year
     * @param y its number of year
     */
    public Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    /**
     * method Date
     *
     * @param ob object from Date
     */
    public Date(Date ob) {
        this.day = ob.d;
        this.month = ob.month;
        this.year = ob.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    

    /**
     * method toString Used for coordination
     *
     * @return all variabls
     */
    @Override
    public String toString() {
        return " " + getYear() + "/"  + getMonth()+ "/" + getDay() ;
    }

}
