
public class Calculadora
{
    // Atributos
    Matematico Calculadora;
    private int a , b, c;
    private double discriminante = b*b-4*a*c;
    private String real;
    private int x1, y1,x2, y2;
    private String ecuacion;
    private double h,catetoB;
    private double catetoA;
    // constructor
    public Calculadora(){
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminante = b*b-4*a*c;
        this.real = real;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.ecuacion = ecuacion;
        this.h = h;
        this.catetoB = catetoB;
        this.catetoA = catetoA;
    }

    public String ecuacionSegundoGrado (int a ,int b, int c){
        real ="";
        if(discriminante < 0){
            real = "La ecuacion no tiene soluciones reales";
        }else if(discriminante == 0){
            int x1 =-b/a*a;
            real = "La solucion unica es: "+x1;
        }else{
            double x1 = (-b-Math.sqrt(discriminante))/(a*a);
            double x2 = (-b+Math.sqrt(discriminante))/(a*a);
            real = "Las soluciones reales son: "+" la solucion de x1 es: "+x1+" la solucion de x2 es: "+x2;
        }
        return real;
    }

    public String ecuacionRectaLineal(int x1, int y1,int x2, int y2){
        int m = (y1*-(y2))/(x1*-(x2));
        int b = y1-m*(x1); 
        ecuacion ="la ecuacion es:"+" y "+" = "+m+" x " +b;
        return ecuacion;
    }

    public double trianguloRectangulo(int h, int catetoB ){
        catetoA = Math.sqrt(h*h-b*b);
        return catetoA;
    }
    public String getReal(){
        return real;
        
    }
    public String getEcuacion(){
       return ecuacion;
    }
    public double getCatetoA(){
        return catetoA;
    }
}
