
public class EjecutorCandidatoPresidencial {

    public static void main(String[] args) {
        System.out.println("CANDIDATO1");
        CandidatoPresidencial candidatoX = new CandidatoPresidencial("Luisa Gonzalez", "Revolucion Ciudadana");
        candidatoX.edad = 45;
        candidatoX.planGobierno = "Reforma economica y social";
        candidatoX.numPropuestas = 12;
        System.out.println(candidatoX);

        System.out.println("\nCANDIDATO2");
        CandidatoPresidencial candidatoX1 = new CandidatoPresidencial("Guillermo Lasso", 68, "CREO", "Liberalismo economico", 8);
        System.out.println(candidatoX1);
    }
}

class CandidatoPresidencial {

    public String nombre;
    public int edad;
    public String partidoPolitico;
    public String planGobierno;
    public int numPropuestas;

    public CandidatoPresidencial() {
    }

    public CandidatoPresidencial(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
    }

    public CandidatoPresidencial(String nombre, int edad, String partidoPolitico, String planGobierno, int numPropuestas) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numPropuestas = numPropuestas;
    }

    public boolean validarEdad() {
        return this.edad >= 35;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" + "Edad: " + edad + " años\n" + "Partido: " + partidoPolitico + "\n"
                + "Plan de Gobierno: " + planGobierno + "\n" + "Propuestas Clave: " + numPropuestas + "\n" + "¿Cumple edad minima? " + (validarEdad() ? "Si" : "No");
    }
}/***
 * compile-single:
run-single:
CANDIDATO1
Nombre: Luisa Gonzalez
Edad: 45 a�os
Partido: Revolucion Ciudadana
Plan de Gobierno: Reforma economica y social
Propuestas Clave: 12
�Cumple edad minima? Si

CANDIDATO2
Nombre: Guillermo Lasso
Edad: 68 a�os
Partido: CREO
Plan de Gobierno: Liberalismo economico
Propuestas Clave: 8
�Cumple edad minima? Si
BUILD SUCCESSFUL (total time: 0 seconds)
 */
