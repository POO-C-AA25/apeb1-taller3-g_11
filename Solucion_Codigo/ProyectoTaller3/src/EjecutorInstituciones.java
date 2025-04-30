import java.util.Random;
import java.util.Scanner;
public class EjecutorInstituciones {
    public static InstitucionesEdu institucionesEduX = new InstitucionesEdu();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("DIME EL NOMBRE DE LA INSTITUCION: ");
        String nombre = sc.next();
        System.out.print("DIME EL TIPO DE LA INSTITUCION: ");
        String tipoInst = sc.next();
        System.out.println("INFORME: ");
        int numAlum = random.nextInt(2000) + 1;
        int numDocent = random.nextInt(1000) + 1;
        int numSedes = random.nextInt(100) + 1;
        double gastosEstu = (random.nextDouble() * 500) + 800;
        institucionesEduX.setNombre(nombre);
        institucionesEduX.setTipoInst(tipoInst);
        institucionesEduX.setNumAlum(numAlum);
        institucionesEduX.setNumDocent(numDocent);
        institucionesEduX.setNumSedes(numSedes);
        institucionesEduX.setGastosEstu(gastosEstu);
        institucionesEduX.calcularPresupuesto();
        System.out.println("institucionesEduX: " + institucionesEduX.toString());
    }
}
class InstitucionesEdu {
    public String nombre;
    public String tipoInst;
    public int numAlum;
    public int numDocent;
    public int numSedes;
    public double gastosEstu;
    public double presupuesto;

    public InstitucionesEdu() {}
    public InstitucionesEdu(String nombre, String tipoInst, int numAlum, int numDocent, int numSedes, double gastosEstu, double presupuesto) {
        this.nombre = nombre;
        this.tipoInst = tipoInst;
        this.numAlum = numAlum;
        this.numDocent = numDocent;
        this.numSedes = numSedes;
        this.gastosEstu = gastosEstu;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipoInst(String tipoInst) {
        this.tipoInst = tipoInst;
    }
    public void setNumAlum(int numAlum) {
        this.numAlum = numAlum;
        this.calcularPresupuesto();
    }
    public void setNumDocent(int numDocent) {
        this.numDocent = numDocent;
    }
    public void setNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }
    public void setGastosEstu(double gastosEstu) {
        this.gastosEstu = gastosEstu;
        this.calcularPresupuesto();
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getTipoInst() {
        return this.tipoInst;
    }
    public int getNumAlum() {
        return this.numAlum;
    }
    public int getNumDocent() {
        return this.numDocent;
    }
    public int getnumSedes() {
        return this.numSedes;
    }
    public double getGastosEstu() {
        return this.gastosEstu;
    }
    public double getPresupuesto() {
        return this.presupuesto;
    }
    public void calcularPresupuesto() {
        this.presupuesto = this.numAlum * this.gastosEstu;
    }
    public String toString() {
        return "{Nombre: " + this.getNombre() + ", "
                + "Tipo de Institucion: " + this.getTipoInst() + ", " + "Numero de Alumnos: " + this.getNumAlum() + ", " + "Numero de Docentes: " + this.getNumDocent() + ", " + "Numero de Sedes: " + this.getnumSedes() + ", " + "Valor de Gastos por Estudiante: " + String.format("%.2f", this.getGastosEstu()) + ", " + "Presupuesto: " + String.format("%.2f", this.getPresupuesto()) + "}";
    }
}
/***
 * run:
 * DIME EL NOMBRE DE LA INSTITUCION: 
 * UTPL
 * DIME EL TIPO DE LA INSTITUCION: 
 * Privada
 * INFORME: 
 * institucionesEduX: {Nombre: UTPL, Tipo de Institucion: Privada, Numero de Alumnos: 1175, Numero de Docentes: 588, Numero de Sedes: 21, Valor de Gastos por Estudiante: 831,48, Presupuesto: 976989,87}
 * BUILD SUCCESSFUL (total time: 9 seconds)
 */