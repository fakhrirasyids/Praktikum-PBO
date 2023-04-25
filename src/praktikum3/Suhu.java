package praktikum3;

public class Suhu {
    private double celcius;

    Suhu(double celcius) {
        this.celcius = celcius;
    }

    double toKelvin() {
        return celcius + 273.15;
    }

    double toFahrenheit() {
        return  (celcius * 1.8) + 32;
    }

    double toRankine() {
        return (celcius * 1.8) + 491.67;
    }

    double toDelisle() {
        return (100 - celcius) * 1.5;
    }

    double toNewton() {
        return celcius * (33/100);
    }

    double toReaumur() {
        return celcius* 0.8;
    }

    double toRomer() {
        return celcius * (21/40) + 7.5;
    }
}
