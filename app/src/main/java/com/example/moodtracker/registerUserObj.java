/** ************************************************************************
 * For questions about code and other stuff regarding this file ask Jhonatan
 * *************************************************************************
 *  */

/** This is ued fo the register activity
 * just contains parameters that take and pass to firebase
 * */

package com.example.moodtracker;

public class registerUserObj {
    public String firstName;
    public String lastName;
    public String email;

    // Constructors
    public registerUserObj(){};

    public registerUserObj(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
