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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Instructor instr = new Instructor("Aliman", "Fachrudin", "45680");
	  TextBook book = new TextBook("OOP IN C# Tutorial", "Anastasia Brookman", "Erlangga");
	    Course course = new Course("Object Oriented Programming", instr, book);

	    System.out.println(course.toString());
    }
    
}
