
public class EjecutorCheques {

    public static Cheques chequeX = new Cheques();

    public static void main(String[] args) {
        System.out.println("CHEQUE 1");
        chequeX.nombreCliente = "Jaime Torres";
        chequeX.nombreBanco = "Banco De Loja";
        chequeX.valorCheque = 5000.00;
        chequeX.calcularComision();
        System.out.println(chequeX);
    }
}
class Cheques {
    public String nombreCliente;
    public String nombreBanco;
    public double valorCheque;
    public double comision;

    public Cheques() {}

    public Cheques(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }

    public void calcularComision() {
        this.comision = this.valorCheque * 0.003;
    }
    
    public String toString() {
        return ("Cliente: " + nombreCliente + "\n" +
               "Banco: " + nombreBanco + "\n" + "Valor: $" + valorCheque + "\n" + "Comision: $" + comision);
    }
}
/***
 *compile-single:
run-single:
CHEQUE 1
Cliente: Jaime Torres
Banco: Banco De Loja
Valor: $5000.0
Comision: $15.0
BUILD SUCCESSFUL (total time: 0 seconds)
 */
