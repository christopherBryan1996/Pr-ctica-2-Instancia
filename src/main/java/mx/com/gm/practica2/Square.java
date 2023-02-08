package mx.com.gm.practica2;

public class Square {
    private float base,altura;

    public Square() {};

    public Square(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void area(){
        float result = this.base * this.altura;
        System.out.println("Area del cuadrado: "+ result);
    }
    
    public void area(float base, float altura){
        float result = base * altura;
        System.out.println("Area del cuadrado: "+ result);
    }
    
    public void area(int base, int altura){
        int result = base * altura;
        System.out.println("Area del cuadrado: "+ result);
    }
    
    public void perimetro(){
        float result = this.base*2 + this.altura*2;
        System.out.println("Perimetro del cuadrado: "+ result);
    }
    
    public void perimetro(float base, float altura){
        float result = base*2 + altura*2;
        System.out.println("Perimetro del cuadrado: "+ result);
    }
    
    public void perimetro(int base, int altura){
        int result = base*2 + altura*2;
        System.out.println("Perimetro del cuadrado: "+ result);
    }
}
