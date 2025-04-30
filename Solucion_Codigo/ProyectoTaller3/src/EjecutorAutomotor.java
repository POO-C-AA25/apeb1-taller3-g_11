import java.util.Scanner;
public class EjecutorAutomotor {
    public static Automotor automotorX = new Automotor();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la Marca del Vehiculo: ");
        String marcVehiculo = sc.next();
        int añoAct = 2025;
        int añoFabri = (int)(Math.random() * 30 + 1995); // Entre 1995 y 2024
        double valorVehiculo = (Math.random() * 20000) + 5000;
        long ciDueño = (long)(Math.random() * 1_000_000_000L) + 100_000_000L;
        automotorX.setCiDueño(ciDueño);
        automotorX.setMarcVehiculo(marcVehiculo);
        automotorX.setAñoFabri(añoFabri);
        automotorX.setAñoAct(añoAct);
        automotorX.setValorVehiculo(valorVehiculo);
        automotorX.calcularAñosAntig();
        automotorX.calcularValorMatricula();
        System.out.println("automotorX: " + automotorX.toString());
    }
}
class Automotor{
    public long ciDueño;
    public String marcVehiculo;
    public int añoFabri;
    public int añoAct;
    public double valorVehiculo;
    public double valorMatricula;
    public int añosAntig;
    public Automotor(){}
    public Automotor(int ciDueño, String marcVehiculo, int añoFabri, int añoAct ,double valorVehiculo){
        this.ciDueño = ciDueño;
        this.marcVehiculo = marcVehiculo;
        this.añoFabri = añoFabri;
        this.añoAct = añoAct;
        this.valorVehiculo = valorVehiculo;
    }
    public void setCiDueño(long ciDueño){
        this.ciDueño = ciDueño;
    }
    public void setMarcVehiculo(String marcVehiculo){
        this.marcVehiculo = marcVehiculo;
    }
    public void setAñoFabri(int añoFabri){
        this.añoFabri = añoFabri;
    }
    public void setAñoAct(int añoAct){
        this.añoAct = añoAct;
    }
    public void setValorVehiculo(double valorVehiculo){
        this.valorVehiculo = valorVehiculo;
    }
    public long getCiDueño(){
        return this.ciDueño;
    }
    public String getMarcVehiculo(){
        return this.marcVehiculo;
    }
    public int getAñoFabri(){
        return this.añoFabri;
    }
    public int getAñoAct(){
        return this.añoAct;
    }
    public double getValorVehiculo(){
        return this.valorVehiculo;
    }
    public double getValorMatricula(){
        return this.valorMatricula;
    }
    public int getAñosAntig(){
        return this.añosAntig;
    }
    public void calcularAñosAntig(){
        this.añosAntig = this.añoAct - this.añoFabri;
    }
    public void calcularValorMatricula(){
        this.valorMatricula = (this.valorVehiculo * 0.00002) * this.añosAntig;
    }
    public String toString(){
        return "{Cedula Propietario: " + this.getCiDueño() + ", " + "Marca del Vehiculo: " + this.getMarcVehiculo() + ", " + "Año de Fabricacion: " + this.getAñoFabri() + ", " + "Valor del Vehiculo: " + String.format("%.2f", this.getValorVehiculo()) + ", " + "Valor de la matricula: " + String.format("%.2f", this.getValorMatricula()) + "}";
                
    }
}
/***
 * run:
 * Ingresa la Marca del Vehiculo: Toyota
 * automotorX: {Cedula Propietario: 535984410, Marca del Vehiculo: Toyota, A�o de Fabricacion: 2001, Valor del Vehiculo: 22656,37, Valor de la matricula: 10,88}
 * BUILD SUCCESSFUL (total time: 3 seconds)
 */