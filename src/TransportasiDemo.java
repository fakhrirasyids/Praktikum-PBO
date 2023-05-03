import Transportasi.Bicycle;
import Transportasi.Mobil;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Bicycle bicycle = new Bicycle();

        mobil.setNama("Avanza Silver");
        mobil.hidupkanMobil();
        mobil.ubahGigi();

        bicycle.speed = 10;
        bicycle.gear = 2;

        bicycle.speedUp(10);
        bicycle.changeGear(2);
    }
}
