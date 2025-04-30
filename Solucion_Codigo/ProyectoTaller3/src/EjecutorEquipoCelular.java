
public class EjecutorEquipoCelular {

    public static EquipoCelular equipoX = new EquipoCelular();

    public static void main(String[] args) {
        System.out.println("EquipoX");
        equipoX.sistemaOpera = "Android";
        equipoX.tamañoP = 7.0;
        equipoX.costoIn = 200.00;
        equipoX.porcenIva = 10.0;
        equipoX.dirMac = "00:1A:2B:3C:4D:5E";
        equipoX.infoImei = "490154203237518";

        equipoX.calcularIvaCostoIn();
        equipoX.calcularCostofin();

        System.out.println(equipoX);
    }
}

class EquipoCelular {

    public String sistemaOpera;
    public double tamañoP;
    public double costoIn;
    public double porcenIva;
    public double ivaCostoIn;
    public double costoFin;
    public String dirMac;
    public String infoImei;

    public EquipoCelular() {
    }

    public EquipoCelular(String sistemaOpera, double tamañoP, double costoIn, double porcenIva, String dirMac, String infoImei) {
        this.sistemaOpera = sistemaOpera;
        this.tamañoP = tamañoP;
        this.costoIn = costoIn;
        this.porcenIva = porcenIva;
        this.dirMac = dirMac;
        this.infoImei = infoImei;
    }

    public void calcularIvaCostoIn() {
        this.ivaCostoIn = this.costoIn * (this.porcenIva / 100);
    }

    public void calcularCostofin() {
        this.costoFin = this.costoIn + this.ivaCostoIn;
    }

    public String toString() {
        return String.format("sistemaOpera: %s%n" + "tamañoP: %.1f%n" + "costoIn: %.2f%n" + "porcenIva: %.1f%n" + "ivaCostoIn: %.2f%n"
                + "costoFin: %.2f%n" + "dirMac: %s%n" + "infoImei: %s", sistemaOpera, tamañoP, costoIn, porcenIva, ivaCostoIn, costoFin, dirMac, infoImei);
    }
}
/***
 * compile-single:
run-single:
EquipoX
sistemaOpera: Android
tama�oP: 7,0
costoIn: 200,00
porcenIva: 10,0
ivaCostoIn: 20,00
costoFin: 220,00
dirMac: 00:1A:2B:3C:4D:5E
infoImei: 490154203237518
BUILD SUCCESSFUL (total time: 0 seconds)
 */
