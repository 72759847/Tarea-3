
public class Matematico
{ 
    //atributos del metodo MAyorMenorMedio
    private Calculadora Matematico;
    private int num1,num2, num3;
    private int mayor,menor,medio;
    private String reporte;
    private int a, b;
    private int area;//atributos del segundo metodo areaCuadrado
    private double x1, y1, x2, y2;
    private double d;//atributos 
    private int x , y;
    private String cuadrante;// atributos
    public Matematico(){
        this.num1= num1; 
        this.num2 = num2;
        this.num3 = num3;
        this.mayor = mayor;
        this.menor = menor;
        this.medio = medio; 
        this.reporte = reporte;
        this.area = area;
        this.d = d;
        this.a = a;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x = x;
        this.y = y;
        this.cuadrante = cuadrante;
    }

    public String MAyorMenorMedio(int num1, int num2, int num3){
       
        reporte = "";
        if((num1 >= num2)&&(num1 >= num3)){

            mayor = num1;
            if(num2 >= num3){
                medio = num2;
                menor = num3;

            }else{
                medio = num3;
                menor = num2;

            }
        }else if((num2 >= num1)&&(num2 > num3)){

            mayor = num2;
            if(num1 >= num3){
                medio = num1;
                menor = num3;
            }
        }else{

            mayor = num3;
            if(num1 >= num2){
                medio = num1;
                menor = num2;
            }else{
                medio = num2;
                menor = num1;
            }

        }
        if ((num1 <= num2 )&&(num1 <= num3)){

            menor = num1;
            if(num2 <= num3){
                medio = num2;
                mayor = num3;

            }else{
                medio = num3;
                mayor = num2;

            }
        }else if((num2 <= num1)&&(num2 < num3)){

            menor = num2;
            if(num1 <= num3){
                medio = num1;
                mayor = num3;

            }
        }else{

            menor = num3;
            if(num1 <= num2){
                medio = num1;
                mayor = num2;

            }else{
                medio = num2;
                mayor = num1;

            }
        }

        if((num1 <= num2)&&(num1 >= num3)){

            medio = num1;
            if(num2 >= num3){
                mayor = num2;
                menor = num3;

            }else{
                mayor = num3;
                menor = num2;

            }

        }else if((num2 >= num1)&&(num2 <= num3)){
            medio = num2;
            if(num1 <= num3){
                mayor = num3;
                menor = num1;

            }
        }else{
            medio = num3;
            if(num1 <= num2){
                mayor = num2;
                menor = num1;

            }else{
                mayor = num1;
                menor = num2;

            }
        }
        reporte = " El mayor es: " + mayor + " El menor es: " + menor + " El medio es " + medio ;
        return reporte;
    }

    public int areaCuadrado(int a, int b ){  // declaracion de variables base y altura.  
        area = a*b; // La altura siempre tiene que ser igual a la base por eso solo trabajamos con la altura
        return area; // Retorna el area 
    }

    public double calcularDistancia(double x1,double y1,double x2,double y2){
        double A = x2-x1;
        double B = y2-y1;
        double d = Math.sqrt(((A)*(A))+((B)*(B))); // hace operaciones
        return d; // Retorna la distancia
    } 

    public String puntoCuadrante(int x ,int y){
        cuadrante = "";
        if(x > 0 && y > 0){
            cuadrante = "El punto ( " +x+" , "+y+ " ) esta en el primer cuadrante";

        }else if(x < 0 && y > 0 ){
            cuadrante = "El punto ( " +x+ "," +y+ " ) esta en el segundo cuadrante";

        }else if(x < 0 && y < 0){
            cuadrante = "El punto ("+x+","+y+") esta en el tercer cuadrante";

        }else if(x > 0 && y < 0){
            cuadrante = "El punto ("+x+","+y+") esta en el cuarto cuadrante";

        }
        return cuadrante;

    }

    public String getReporte(){
        return reporte; 
    }
    public int getArea(){
        return area;
    }
    public double getD(){
        return d;
    }
    public String getCuadrante(){
        return cuadrante;
    }
}