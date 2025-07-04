/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weddingplanner;

/**
 *
 * @author  Jory
 */
public class Wedding {
 
    //Number of wedding attendees
    private int Invocations;
    // Number of chairs at the wedding venue
    private int Chairs;
    // Number of Tables at the wedding venue
    private int Tables;

    /**
     * method Wedding its constrsctor
     *
     * @param Invocations Number of wedding attendees
     * @param Chairs Number of wedding Chairs
     * @param Tables Number of wedding Tables
     */
    public Wedding(int Invocations,int  Chairs, int  Tables ) {
        this.Invocations = Invocations;
        this.Chairs = Chairs;
        this.Tables = Tables;

    }

    public Wedding() {
    }

    
    
    /**
     * method setInvocations get Invocations and equal Invocations
     *
     * @param Invocations its Number of wedding attendees return void
     */
    public void setInvocations(int Invocations) {
        this.Invocations = Invocations;
    }

    /**
     * method getInvocations return Invocations
     *
     * @return Invocations its Number of wedding attendees
     */
    public int getInvocations() {
        return Invocations;
    }

    /**
     * method setChairs get Chairs and equal Chairs
     *
     * @param Chairs its Number of chairs at the wedding venue return void
     */
    public void setChairs(int Chairs) {
        this.Chairs = Chairs;
    }

    /**
     * method getChairs return Chairs
     *
     * @return Chairs its Number of chairs at the wedding venue
     */
    public int getChairs() {
        return Chairs;
    }

    /**
     * method setTables get Tables and equal Tables
     *
     * @param Tables its Number of tables at the wedding venue return void
     */
    public void setTables(int Tables) {
        this.Tables = Tables;
    }

    /**
     * method getTables return Tables
     *
     * @return Tables its Number of tables at the wedding venue
     */
    public int getTables() {
        return Tables;
    }

    /**
     * method remove Cancel the request when nothing is entered from the user
     * 
     */
    public void remove() {
        if (Invocations == 0 && Chairs == 0 && Tables == 0) {
            System.out.println("The wedding has been chanceled");

    }

    }
    Date obj1 = new Date();
    /**
     * method toString To coordinate printed text
     *
     * @return all variables
     */
    @Override
    public String toString() {
        return " "+ "Invocations:" + getInvocations()+ ", Chairs:" + getChairs() + ", Tables:" +  getTables();
    }

}
