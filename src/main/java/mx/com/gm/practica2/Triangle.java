/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.practica2;

/**
 *
 * @author manci
 */
public class Triangle {
    private float a,b,c;
    
    public Triangle(){};
    public Triangle(float a,float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public void perimetro (){
        float result=0;
        if (b == 0 && c == 0){
            result = 3*a;
        }else if(b != 0 && c == 0){
            result = 2*a+b;
        }else if(b != 0 && c != 0){
            result = a+b+c;
        }
        System.out.println("Perimetro del triangulo: "+ result);
    }
    
    public void perimetro (float a,float b, float c){
        float result=0;
        if (b == 0 && c == 0){
            result = 3*a;
        }else if(b != 0 && c == 0){
            result = 2*a+b;
        }else if(b != 0 && c != 0){
            result = a+b+c;
        }
        System.out.println("Perimetro del triangulo: "+ result);
    }
    public void perimetro (int a,int b, int c){
        int result=0;
        if (b == 0 && c == 0){
            result = 3*a;
        }else if(b != 0 && c == 0){
            result = 2*a+b;
        }else if(b != 0 && c != 0){
            result = a+b+c;
        }
        System.out.println("Perimetro del triangulo: "+ result);
    }
    public void area(){
        double result = 0;
        if (b == 0 && c == 0){
            double a2 = Math.pow(a, 2);
            result = (Math.sqrt(3)/4)*a2;
        }else if(b != 0 && c != 0 && a == 0){
            result = b*c/2;
        }
        System.out.println("Area del triangulo: "+ result);
    }
    public void area(float a,float b, float c){
        double result = 0;
        if (b == 0 && c == 0){
            double a2 = Math.pow(a, 2);
            result = (Math.sqrt(3)/4)*a2;
        }else if(b != 0 && c != 0 && a == 0){
            result = b*c/2;
        }
        System.out.println("Area del triangulo: "+ result);
    }
    public void area(int a,int b, int c){
        int result = 0;
        if (b == 0 && c == 0){
            int a2 = (int) Math.pow(a, 2);
            result = (int) ((Math.sqrt(3)/4)*a2);
        }else if(b != 0 && c != 0 && a == 0){
            result = b*c/2;
        }
        System.out.println("Area del triangulo: "+ result);
    }
}
