/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weddingplanner;

/*
 * To create an Object of user class type
 * Describes the user information and the status of the request
 *@auther Raghad Al-Otaibi, Maram
 */
public class User {
    // userName this holds the user name

    private String userName;
// userNumber this holds the user number
    private long userNumber;
// userEmail this holds the user email
    private String userEmail;
// userID this holds the user id
    private long userID;

    /**
     * user is a constructor of class user initializing class fields
     *
     * @param name as a user name
     * @param num as a user number
     * @param email as a user email
     * @param id as a user id
     */
    public User(String name, long num, String email, long id) {
        this.userName = name;
        this.userNumber = num;
        this.userEmail = email;
        this.userID = id;

    }

    public User() {
    }
    

    /**
     * To set the user name
     *
     * @param name is a user name
     */

    public void setUserName(String name) {
        this.userName = name;
    }

    /**
     * To set the user number
     *
     * @param num is a user number
     */
    public void setUserNumber(long num) {
        this.userNumber = num;
    }

    /**
     * To set the user emali
     *
     * @param email is a user emali
     */
    public void setUserEmail(String email) {
        this.userEmail = email;
    }

    /**
     * To set the user id
     *
     * @param id is a user id
     */
    public void setUserID(long id) {
        this.userID = id;
    }

    /**
     * getUserName returns username
     *
     * @return userName user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * getUserNumber returns usernumber
     *
     * @return userNumber user number
     */

    public long getUserNumber() {
        return userNumber;
    }

    /**
     * getUserEmail returns useremail
     *
     * @return user email
     */

    public String getUserEmail() {
        return userEmail;
    }

    /**
     * getUserID returns userid
     *
     * @return user id
     */

    public long getUserID() {
        return userID;
    }

    /**
     * emailName Show that there is no email
     *
     * @param email  prints the value "There is no email"
     * 
     */

    public void emailName(String email) {
        if (userEmail == null){
            String Noemail = "There is no email ";
            System.out.println("Noemail");
        } 
        
    }

    /**
     *  to cancel the wedding
     */

    public void cancel() {
        System.out.println("The wedding has been canceled"); //This method is operated based on the Main. ( It will be modified)
    }

    /**
     * delet to delete any details
     */
    public void delet() {
        System.out.println("There is no detail to delete"); //This method is operated based on the Main. ( It will be modified)

    }

    
   

}
