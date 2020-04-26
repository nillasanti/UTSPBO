/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursebook;

/**
 *
 * @author Nillasanti Puspita N
 */
public class Instructor {
      String lastName, firstName, officeNumber;

// Constructor
    public Instructor(String lastName, String firstName, String officeNumber){
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }
    public Instructor(Instructor object2){
        this.lastName = object2.lastName;
        this.firstName = object2.firstName;
        this.officeNumber = object2.officeNumber;
    }
//   Methods
    public void set(String lname, String fname, String office){
        this.lastName = lname;
        this.firstName = fname;
        this.officeNumber = office;
    }
    public String toString(){
        String str = "Instructor Name : " + this.firstName + " " + this.lastName + "\n";
        str += "Office Number : " + this.officeNumber;
        return str;
    }
}
