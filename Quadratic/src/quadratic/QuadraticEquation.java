/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;

/**
 *
 * @author Nillasanti Puspita N
 */
public class QuadraticEquation {
       private double a,b,c;

//    Constructor
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

//    Getter Methods
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }

//    Discriminant & Roots
    public double getDiscriminant(){
        return (this.b * this.b) - (4 * this.a * this.c);
    }
    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant())) / (2 * this.a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

}
