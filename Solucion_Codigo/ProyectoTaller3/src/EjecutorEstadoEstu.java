import java.util.Scanner;
public class EjecutorEstadoEstu {
    public static EstadoEstu estadoEstuX = new EstadoEstu();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INGRESE NOMBRE DEL ESTUDIANTE: ");
        String nombre = sc.next();
        System.out.println("INFORME: ");
        double calif1 = (Math.random() * 10) + 1;
        double calif2 = (Math.random() * 10) + 1;
        double calif3 = (Math.random() * 10) + 1;
        estadoEstuX.setNombre(nombre);
        estadoEstuX.setCalif1(calif1);
        estadoEstuX.setCalif2(calif2);
        estadoEstuX.setCalif3(calif3);
        estadoEstuX.calcularPromedio();
        estadoEstuX.definirEstado();
        System.out.println("estadoEstuX" + estadoEstuX.toString());
    }
}
class EstadoEstu{
    public String nombre;
    public double calif1;
    public double calif2;
    public double calif3;
    public double promedio;
    public String estado;
    public EstadoEstu(){}
    public EstadoEstu(String nombre, double calif1,double calif2, double calif3){
        this.nombre = nombre;
        this.calif1 = calif1;
        this.calif2 = calif2;
        this.calif3 = calif3;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCalif1(double calif1){
        this.calif1 = calif1;
    }
    public void setCalif2(double calif2){
        this.calif2 = calif2;
    }
    public void setCalif3(double calif3){
        this.calif3 = calif3;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getCalif1(){
        return this.calif1;
    }
    public double getCalif2(){
        return this.calif2;
    }
    public double getCalif3(){
        return this.calif3;
    }
    public double getPromedio(){
        return this.promedio;
    }
    public String getEstado(){
        return this.estado;
    }
    public void calcularPromedio(){
        this.promedio = (this.calif1 + this.calif2 + this.calif3) / 3;
    }
    public void definirEstado(){
        if(this.promedio >= 6.5){
            this.estado = "Aprovado";
        }else{
            this.estado = "Reprovado";
        }
    }
    public String toString(){
        return "{Nombre: " + this.getNombre() + ", " + "Nota Materia 1: " + String.format("%.2f", this.getCalif1()) + ", " +"Nota materia 2: " + String.format("%.2f", this.getCalif2()) + ", " + "Nota Materia 3: " + String.format("%.2f", this.getCalif3()) + ", " + "Promedio: " + String.format("%.2f", this.getPromedio()) + ", " + "Estado: " + this.getEstado() + "}";
    }
}
/***
 * run:
 * INFORME: 
 * INGRESE NOMBRE DEL ESTUDIANTE: Jose
 * INFORME: 
 * estadoEstuX{Nombre: Jose, Nota Materia 1: 6,83, Nota materia 2: 5,95, Nota Materia 3: 2,62, Promedio: 5,13, Estado: Reprovado}
 * BUILD SUCCESSFUL (total time: 3 seconds)
 */