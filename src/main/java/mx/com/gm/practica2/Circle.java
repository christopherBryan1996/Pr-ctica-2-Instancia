package mx.com.gm.practica2;

public class Circle {
    //declaro PI como un constante
    private final float PI= 3.1416f;
    private float radio;
    
    public Circle(){};
    
    public Circle(float radio){
        this.radio = radio;
    };
    
    public void area(){
        float radio2 = (float) Math.pow(this.radio, 2);
        float result = PI*radio2;
        System.out.println("Area del circulo: " + result);
    }
    
    public void area(float radio){
        float radio2 = (float) Math.pow(radio, 2);
        float result = PI*radio2;
        System.out.println("Area del circulo: " + result);
    }
    
    public void area(int radio){
        int radio2 =   (int) Math.pow(radio, 2);
        int result = (int) (PI*radio2);
        System.out.println("Area del circulo: " + result);
    }
    public void perimetro(){
        float result = 2*PI *this.radio;
        System.out.println("Perimetro del circulo: " + result);
        
    }    
    public void perimetro(float radio){
        float result = 2*PI *radio;
        System.out.println("Perimetro del circulo: " + result);
        
    } 
    
    public void perimetro(int radio){
        int result = (int) (2*PI *radio);
        System.out.println("Perimetro del circulo: " + result);
        
    }
}
