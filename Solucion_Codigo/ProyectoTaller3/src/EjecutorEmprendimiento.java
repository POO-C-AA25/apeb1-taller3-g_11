import java.time.LocalDate;
import java.time.Period;

public class EjecutorEmprendimiento {
    public static Emprendimiento emprendimientoX = new Emprendimiento();

    public static void main(String[] args) {
        System.out.println("FORMA LARGA:");
        emprendimientoX.setNombreComercial("LojaTech");
        emprendimientoX.setRuc("1101123456001");
        emprendimientoX.setSectorEconomico("Tecnología");
        emprendimientoX.setPropietario("Juan Pérez");
        emprendimientoX.setUbicacion("Loja");
        emprendimientoX.setFechaInicio(LocalDate.of(2018, 5, 15));
        emprendimientoX.setCapitalInicial(8000);

        System.out.println("emprendimientoX: " + emprendimientoX.toString());
        System.out.println("Antigüedad: " + emprendimientoX.calcularAntiguedad() + " años");
        System.out.println("Tipo de negocio: " + emprendimientoX.tipoNegocio());

        System.out.println("\nFORMA EFICIENTE:");
        Emprendimiento miEmp = new Emprendimiento(
            "Delicias Loja", "1101987654001", "Gastronomía", "María León",
            "Loja", LocalDate.of(2021, 1, 10), 15000
        );
        System.out.println("miEmp: " + miEmp.toString());
        System.out.println("Antigüedad: " + miEmp.calcularAntiguedad() + " años");
        System.out.println("Tipo de negocio: " + miEmp.tipoNegocio());
    }
}

class Emprendimiento {
    private String nombreComercial;
    private String ruc;
    private String sectorEconomico;
    private String propietario;
    private String ubicacion;
    private LocalDate fechaInicio;
    private double capitalInicial;

    public Emprendimiento() {}

    public Emprendimiento(String nombreComercial, String ruc, String sectorEconomico, String propietario, String ubicacion, LocalDate fechaInicio, double capitalInicial) {
        this.nombreComercial = nombreComercial;
        this.ruc = ruc;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.fechaInicio = fechaInicio;
        this.capitalInicial = capitalInicial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public String getRuc() {
        return ruc;
    }

    public String getSectorEconomico() {
        return sectorEconomico;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public double getCapitalInicial() {
        return capitalInicial;
    }

    public int calcularAntiguedad() {
        return Period.between(fechaInicio, LocalDate.now()).getYears();
    }

    public String tipoNegocio() {
        if (capitalInicial <= 5000) return "Micro";
        else if (capitalInicial <= 20000) return "Pequeño";
        else return "Mediano";
    }

    public String toString() {
        return "{Nombre Comercial: " + nombreComercial +
                ", RUC: " + ruc +
                ", Sector: " + sectorEconomico +
                ", Propietario: " + propietario +
                ", Ubicación: " + ubicacion +
                ", Fecha Inicio: " + fechaInicio +
                ", Capital Inicial: " + capitalInicial + "}";
    }
}
