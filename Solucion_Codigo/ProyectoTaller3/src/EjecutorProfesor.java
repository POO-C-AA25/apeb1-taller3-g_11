
public class EjecutorProfesor {

    public static Profesor profesorX = new Profesor();

    public static void main(String[] args) {
        System.out.println("Profesor1");
        profesorX.nombre = "Jorge";
        profesorX.apellido = "Guerra";
        profesorX.sueldoBasico = 1300.00;
        profesorX.cedula = "1105067210";
        profesorX.calcularSueldoTo();
        System.out.println(profesorX);
    }
}

class Profesor {

    public String nombre;
    public String apellido;
    public double sueldoBasico;
    public double sueldoTo;
    public String cedula;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }

    public void calcularSueldoTo() {
        this.sueldoTo = this.sueldoBasico + (this.sueldoBasico * 0.20);
    }

    public String toString() {
        return String.format("Nombre: %s%n" + "Apellido: %s%n" + "Sueldo Basico: $%.2f%n"
                + "Sueldo Total: $%.2f%n" + "Cedula: %s", nombre, apellido, sueldoBasico, sueldoTo, cedula);
    }
}
