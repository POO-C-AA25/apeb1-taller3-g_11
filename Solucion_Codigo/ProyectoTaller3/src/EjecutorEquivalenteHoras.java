public class EjecutorEquivalenteHoras{
    public static EquivalenteHora conversionX = new EquivalenteHora();
    
    public static void main(String[] args) {
        double horas = (Math.random() * 24) + 1;
        conversionX.setHoras(horas);
        conversionX.calcularMinutos();
        conversionX.calcularSegundos();
        conversionX.calcularDias();
        System.out.println("conversionX: " + conversionX.toString());
    }
}
class EquivalenteHora{
    public double horas;
    public double minutos;
    public double segundos;
    public double dias;
    
    public EquivalenteHora() {}
    
    public EquivalenteHora(double horas) {
        this.horas = horas;
    }
    
    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public double getHoras() {
        return this.horas;
    }
    
    public double getMinutos() {
        return this.minutos;
    }
    
    public double getSegundos() {
        return this.segundos;
    }
    
    public double getDias() {
        return this.dias;
    }
    
    public void calcularMinutos() {
        this.minutos = this.horas * 60;
    }
    
    public void calcularSegundos() {
        this.segundos = this.horas * 3600;
    }
    
    public void calcularDias() {
        this.dias = this.horas / 24;
    }
    
    public String toString() {
        return "{Horas: " + this.getHoras() + ", " +
               "Minutos: " + this.getMinutos() + ", " +
               "Segundos: " + this.getSegundos() + ", " +
               "Días: " + this.getDias() + "}";
    }
}
