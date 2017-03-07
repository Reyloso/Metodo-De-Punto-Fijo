/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Reinaldo
 */
public class Punto {
    private float a;
    private float b;
    private double gx;
    private double x;
    
    //metodo constructor sin parametros
    Punto(){
        a = 0;
        b = 0;
        gx=0;
        x=0;
    }
    
    //Metodo constructor con parametros/
    Punto(float a,float b,double gx, double x){
        this.a = a;
        this.b = b;
        this.gx = gx;
        this.x = x;
    }
    
   void setA(float a){this.a = a;}
   void setB(float b){this.b = b;}
   void setgx(double gx){this.gx = gx;}
   void setx(double x){this.x = x;}
   
   float getA(){return a;}
   float getB(){return b;}
   double getGx(){return gx;}
   double getx(){return x;}
   
   double getG1(double x){
       double G1=0;
       G1= Math.pow(3+x-2*Math.pow(x, 2),0.25);
       G1 = Math.rint(G1*10000)/10000;
       return G1;
   }
   
   
   
}
