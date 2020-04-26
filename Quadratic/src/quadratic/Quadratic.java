/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;
import java.util.Scanner;
/**
 *
 * @author Nillasanti Puspita N
 */
public class Quadratic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c : ");

        String[] input = sc.nextLine().split(" ");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);

        QuadraticEquation q = new QuadraticEquation(a,b,c);

        if (q.getDiscriminant() > 0){
            System.out.println("The equation has two roots : " + q.getRoot1() + " & " + q.getRoot2());
        }else if(q.getDiscriminant() == 0){
            System.out.println("The equation has one roots : " + q.getRoot1());
        }else{
            System.out.println("The equation has no real roots ");
        }

    }
    
}
