/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.com.gm.practica2;

/**
 *
 * @author manci
 */
public class Practica2 {

    public static void main(String[] args) {
        
        //Circulo 
        //primera instancia sin parametros 
        Circle circle = new Circle();
        //metodos con parametros flotantes
        circle.area(5.5f);
        circle.perimetro(5.5f);
        System.out.println("--------------------------------------------------");
        
        //metodos con parametros int
        circle.area(5);
        circle.perimetro(5);
        System.out.println("--------------------------------------------------");
        
        //instancia con parametro
        Circle circle1 = new Circle(5);
        //metodos sin parametros 
        circle1.area();
        circle1.perimetro();
        System.out.println("--------------------------------------------------");
        
        //cuadrado 
        //instancia sin parametros 
        Square square = new Square();
        //metodos con parametros int
        square.area(5,4);
        square.perimetro(5,5);
        System.out.println("--------------------------------------------------");
        
        //metodos con parametros flotantes
        square.area(5.1f, 5.1f);
        square.perimetro(5.1f, 5.1f);
        System.out.println("--------------------------------------------------");
        
        //instancia con parametros 
        Square square1 = new Square(5.5f,5.5f);
        //metodos sin parametros
        square1.area();
        square1.perimetro();
        System.out.println("--------------------------------------------------");
        
        //triangulo
        //constructor con parametros
        Triangle triangle = new Triangle(3, 0, 0);
        //metodo sin parametros
        triangle.area();
        triangle.perimetro();
        System.out.println("--------------------------------------------------");
        
        Triangle triangle1 = new Triangle(0, 2, 3);
        triangle1.area();
        triangle1.perimetro();
        System.out.println("--------------------------------------------------");
        
        //constructor sin parametros
        Triangle triangle2 = new Triangle();
        //Perimetro con diferentes valores int
        triangle2.perimetro(1, 0, 0);
        triangle2.perimetro(1, 5, 0);
        triangle2.perimetro(1, 2, 3);
        System.out.println("--------------------------------------------------");
        
        //Perimetro con diferentes valores float
        triangle2.perimetro(1.1f, 0, 0);
        triangle2.perimetro(1.2f, 5.5f, 0);
        triangle2.perimetro(1, 2, 3.2f);
        System.out.println("--------------------------------------------------");

        //area con diferentes valores int
        triangle2.area(5, 0, 0);
        triangle2.area(0, 5, 5);
        System.out.println("--------------------------------------------------");
        
        //Perimetro con diferentes valores float
        triangle2.area(1.5f, 0, 0);
        triangle2.area(0, 5.2f, 5);
    }
}
