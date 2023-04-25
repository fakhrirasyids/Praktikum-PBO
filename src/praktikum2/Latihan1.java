package praktikum2;

public class Latihan1 {
    public static void main(String[] args) {
        Mobil2 avanza = new Mobil2();
        Mobil2 xenia = new Mobil2();
        avanza.setNama("Avanza Silver");
        avanza.hidupkanMobil();
        avanza.ubahGigi();
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda Avanza  : " + avanza.getRoda());
        System.out.println("Roda Xenia   : " + xenia.getRoda());
        System.out.println("Mesin Avanza : " + avanza.mesin);
        System.out.println("Mesin Xenia  : " + avanza.mesin);
        avanza.setRoda(5);
        System.out.println("Roda Avanza  : " + avanza.getRoda());
        System.out.println("Roda Xenia   : " + xenia.getRoda());
        Mobil2.mesin = 9;
        System.out.println("Mesin Avanza : " + avanza.mesin);
        System.out.println("Mesin Xenia  : " + xenia.mesin);
        System.out.println("Mesin Avanza : " + avanza.mesin);
        System.out.println("Mesin Xenia  : " + xenia.mesin);
        avanza.matikanMobil();
    }
}

