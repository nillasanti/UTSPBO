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
public class Course {
      String courseName;
    Instructor instructor;
    TextBook textBook;
// Constructor
    public Course(String name, Instructor instr, TextBook text){
        this.courseName = name;
        this.instructor = instr;
        this.textBook = text;
    }
//    Methods
    public String getName(){
        return this.courseName;
    }
    public Instructor getInstructor(){
        return this.instructor;
    }
    public TextBook getTextBook(){
        return this.textBook;
    }
    public String toString(){
        String str = "==============================================\n";
        str += "Course Name : " + this.courseName + "\n";
        str += "================================================\n";
        str += this.instructor.toString();
        str += "\n================================================\n";
        str += this.textBook.toString();
        str += "\n================================================";
        return str;
    }
}
